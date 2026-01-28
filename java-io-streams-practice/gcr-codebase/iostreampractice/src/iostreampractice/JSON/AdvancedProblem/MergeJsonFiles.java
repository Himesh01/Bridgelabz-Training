package iostreampractice.JSON.AdvancedProblem;

import com.google.gson.*;
import java.io.*;

public class MergeJsonFiles {
    public static void main(String[] args) throws Exception {

        JsonObject obj1 = JsonParser.parseReader(
                new FileReader("a.json")
        ).getAsJsonObject();

        JsonObject obj2 = JsonParser.parseReader(
                new FileReader("b.json")
        ).getAsJsonObject();

        for (String key : obj2.keySet()) {
            obj1.add(key, obj2.get(key));
        }

        System.out.println(obj1);
    }
}