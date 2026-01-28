package iostreampractice.JSON.IntermediateProblem;

import com.google.gson.*;
import java.util.*;

public class ListToJsonArray {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Model S", 2024));
        cars.add(new Car("BMW", "X5", 2023));
        cars.add(new Car("Audi", "A6", 2022));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonArray = gson.toJson(cars);

        System.out.println(jsonArray);
    }
}