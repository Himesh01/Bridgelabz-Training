package iostreampractice.JSON.IntermediateProblem;


import com.fasterxml.jackson.databind.*;
import java.io.*;


public class ValidateJson {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(new File("data.json"));
            System.out.println("Valid JSON Structure");
        } catch (Exception e) {
            System.out.println("Invalid JSON ");
        }
    }
}