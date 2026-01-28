package iostreampractice.JSON.IntermediateProblem;


import com.google.gson.*;

public class CreateJson {
    public static void main(String[] args) {

        JsonObject student = new JsonObject();
        student.addProperty("name", "Ayush");
        student.addProperty("age", 21);

        JsonArray subjects = new JsonArray();
        subjects.add("Math");
        subjects.add("Physics");
        subjects.add("Computer Science");

        student.add("subjects", subjects);

        System.out.println(student.toString());
    }
}