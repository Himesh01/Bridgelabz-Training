package iostreampractice.JSON.AdvancedProblem;

import com.google.gson.*;
import java.io.*;

public class ReadJsonAllFields {
    public static void main(String[] args) throws Exception {

        JsonObject obj = JsonParser.parseReader(
                new FileReader("data.json")
        ).getAsJsonObject();

        for (String key : obj.keySet()) {
            System.out.println(key + " : " + obj.get(key));
        }
    }
}