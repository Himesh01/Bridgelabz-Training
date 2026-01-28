package iostreampractice.JSON.IntermediateProblem;

import com.google.gson.*;
class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

public class CarToJson {
    public static void main(String[] args) {

        Car car = new Car("Tesla", "Model S", 2024);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(car);

        System.out.println(json);
    }
}