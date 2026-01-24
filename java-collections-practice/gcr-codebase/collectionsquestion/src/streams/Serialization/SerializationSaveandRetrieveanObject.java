package streams.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationSaveandRetrieveanObject {

    private static final String FILE_NAME = "employees.ser";

    static class Employee implements Serializable {

        private static final long serialVersionUID = 1L;

        int id;
        String name;
        String department;
        double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Himesh", "IT", 60000));
        employees.add(new Employee(102, "Lucky", "HR", 50000));
        employees.add(new Employee(103, "Nageshwar", "Finance", 55000));

        serializeEmployees(employees);

        List<Employee> retrievedEmployees = deserializeEmployees();

        System.out.println("\nEmployees retrieved from file:");
        for (Employee e : retrievedEmployees) {
            System.out.println(e);
        }
    }
    public static void serializeEmployees(List<Employee> employees) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully to " + FILE_NAME);

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Employee> deserializeEmployees() {

        List<Employee> employees = new ArrayList<>();

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees deserialized successfully.");

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Error: " + e.getMessage());
        }

        return employees;
    }
}