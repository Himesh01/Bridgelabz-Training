package iostreampractice.JSON.AdvancedProblem;

import com.google.gson.*;
import java.io.*;
import java.util.regex.*;

public class ValidateEmail {
    public static void main(String[] args) throws Exception {

        JsonObject obj = JsonParser.parseReader(
                new FileReader("data.json")
        ).getAsJsonObject();

        String email = obj.get("email").getAsString();

        boolean valid = Pattern.matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
                email
        );

        System.out.println(valid ? "Valid Email" : "Invalid Email");
    }
}