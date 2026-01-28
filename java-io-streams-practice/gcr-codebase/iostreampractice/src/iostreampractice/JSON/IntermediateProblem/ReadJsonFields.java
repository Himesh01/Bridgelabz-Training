package iostreampractice.JSON.IntermediateProblem;

import com.google.gson.*;
import java.io.*;

public class ReadJsonFields {
    public static void main(String[] args) throws Exception {

        JsonObject obj = JsonParser.parseReader(
                new FileReader("user.json")
        ).getAsJsonObject();

        System.out.println("Name  : " + obj.get("name").getAsString());
        System.out.println("Email : " + obj.get("email").getAsString());
    }
}