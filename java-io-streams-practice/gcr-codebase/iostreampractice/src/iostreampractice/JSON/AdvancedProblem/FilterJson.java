package iostreampractice.JSON.AdvancedProblem;

import com.google.gson.*;
import java.io.*;

public class FilterJson {
    public static void main(String[] args) throws Exception {

        JsonArray arr = JsonParser.parseReader(
                new FileReader("users.json")
        ).getAsJsonArray();

        for (JsonElement e : arr) {
            JsonObject obj = e.getAsJsonObject();
            if (obj.get("age").getAsInt() > 25) {
                System.out.println(obj);
            }
        }
    }
}