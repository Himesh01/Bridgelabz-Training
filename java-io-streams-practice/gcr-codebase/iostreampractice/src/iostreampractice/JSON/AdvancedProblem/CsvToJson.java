package iostreampractice.JSON.AdvancedProblem;

import com.google.gson.*;
import java.io.*;

public class CsvToJson {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        String header[] = br.readLine().split(",");

        JsonArray array = new JsonArray();
        String line;

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            JsonObject obj = new JsonObject();

            for (int i = 0; i < header.length; i++) {
                obj.addProperty(header[i], values[i]);
            }
            array.add(obj);
        }

        br.close();
        System.out.println(array);
    }
}