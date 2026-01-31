package streamApi.HospitalDoctorAvailibility;
import java.util.*;

public class DoctorAvailibility {

    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
                new Doctor("Dr. Himesh", "Cardiology", true),
                new Doctor("Dr. Nag", "Neurology", false),
                new Doctor("Dr. Kattu", "Orthopedics", true),
                new Doctor("Dr. RAAZ", "Dermatology", true),
                new Doctor("Dr. Singam", "Neurology", true)
        );

        doctors.stream()
               .filter(Doctor::isAvailableOnWeekend)
               .sorted(Comparator.comparing(Doctor::getSpecialty))
               .forEach(System.out::println);
    }
}