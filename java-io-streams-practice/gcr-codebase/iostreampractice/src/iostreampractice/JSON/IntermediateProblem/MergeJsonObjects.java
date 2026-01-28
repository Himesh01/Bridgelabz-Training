package iostreampractice.JSON.IntermediateProblem;


import com.google.gson.*;

public class MergeJsonObjects {
    public static void main(String[] args) {

        JsonObject obj1 = new JsonObject();
        obj1.addProperty("name", "Himesh");
        obj1.addProperty("age", 21);

        JsonObject obj2 = new JsonObject();
        obj2.addProperty("email", "himesh@gmail.com");
        obj2.addProperty("city", "Bhopal");

        for (String key : obj2.keySet()) {
            obj1.add(key, obj2.get(key));
        }

        System.out.println(obj1);
    }
}