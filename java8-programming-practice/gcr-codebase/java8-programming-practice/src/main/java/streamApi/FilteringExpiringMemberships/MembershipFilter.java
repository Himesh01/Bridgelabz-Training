package streamApi.FilteringExpiringMemberships;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MembershipFilter {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysFromNow = today.plusDays(30);

        List<GymMember> members = List.of(
            new GymMember("Rajeev", today.plusDays(10)),
            new GymMember("Bunuty", today.plusDays(45)),
            new GymMember("Himesh", today.plusDays(25)),
            new GymMember("Farhan", today.minusDays(5))
        );

        List<GymMember> expiringSoon = members.stream()
            .filter(member -> {
                LocalDate expiry = member.getExpiryDate();
                return !expiry.isBefore(today) && expiry.isBefore(thirtyDaysFromNow);
            })
            .collect(Collectors.toList());

        System.out.println("Members expiring in the next 30 days:");
        expiringSoon.forEach(System.out::println);
    }
}
