package iostreampractice.JSON.AdvancedProblem;

import com.google.gson.*;
import java.util.*;

class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Car("Tesla", 2024),
                new Car("BMW", 2023),
                new Car("Audi", 2022)
        );

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(cars));
    }
}