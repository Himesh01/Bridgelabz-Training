package methodReferences.hospitalpatient;
import java.util.List;

public class NameUppercasing {
	public static void main(String[]args) {
		
		List<String> nameUpper = List.of(
				"Himesh",
				"Rajeev",
				"Lucky",
				"Nageshar",
				"Raj"
				);
		nameUpper.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);

	}
}
