package methodReferences.NameUppercasing;
import java.util.List;

public class EmployeeNameUppercase {
	public static void main(String[] args) {

        List<String> employeeNames = List.of(
                "Himesh",
                "Lucky",
                "Rajeev",
                "Dev"
        );

        employeeNames.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
