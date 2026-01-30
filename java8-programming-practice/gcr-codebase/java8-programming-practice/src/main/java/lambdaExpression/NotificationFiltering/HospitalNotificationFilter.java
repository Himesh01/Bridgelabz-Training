package lambdaExpression.NotificationFiltering;

import java.util.*;
import java.util.function.Predicate;

public class HospitalNotificationFilter {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("EMERGENCY", "Heart rate critical"),
                new Alert("MEDICATION", "Take insulin at 8 AM"),
                new Alert("APPOINTMENT", "Doctor visit at 5 PM"),
                new Alert("GENERAL", "Health tips available")
        );
        
        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");
               
                
        Predicate<Alert> emergencyAndMedication =
                alert -> alert.type.equals("EMERGENCY")
                      || alert.type.equals("MEDICATION");
                
        Predicate<Alert> hideGeneral =
                alert -> !alert.type.equals("GENERAL");
                
        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(emergencyAndMedication)
              .forEach(System.out::println);
            }
        }

