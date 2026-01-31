package streamApi.InsuranceClaimAnalysis;

import java.util.*;
import java.util.stream.Collectors;

public class ClaimAnalysis {
    public static void main(String[] args) {
    	
        List<Claim> claims = List.of(
            new Claim("Life", 50000.0),
            new Claim("Auto", 1500.0),
            new Claim("Life", 75000.0),
            new Claim("Auto", 2500.0),
            new Claim("Home", 12000.0)
        );

        Map<String, Double> averageByType = claims.stream()
            .collect(Collectors.groupingBy(
                Claim::getType,
                Collectors.averagingDouble(Claim::getAmount)
            ));

        averageByType.forEach((type, avg) -> 
            System.out.println(type + ": Average Claim = $" + avg));
    }
}
