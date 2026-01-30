package methodReferences.hospitalpatient;
import java.util.List;

public class PatientsIdPrinter {
	public static void main(String[] args) {
		List<Integer> patientId = List.of(
				101,102,103,104,105
				);
		patientId.forEach(System.out::println);
	}
}
