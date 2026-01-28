package iostreampractice.JSON.IntermediateProblem;

import com.google.gson.*;
import java.io.*;

public class ParseJson {
    public static void main(String[] args) throws Exception {

        JsonArray arr = JsonParser.parseReader(
                new FileReader("people.json")
        ).getAsJsonArray();

        System.out.println("People with age > 25:\n");

        for (JsonElement e : arr) {
            JsonObject obj = e.getAsJsonObject();

            if (obj.get("age").getAsInt() > 25) {
                System.out.println(obj);
            }
        }
    }
}
