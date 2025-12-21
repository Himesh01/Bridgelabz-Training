import java.util.*;
public class FindFactors {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter a nummber");
        int number = sc.nextInt();
		
        int[] factors = findFactors(number);

        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        System.out.println("Greatest factor: " + findGreatestFactor(factors));
        System.out.println("Sum of factors: " + findSumOfFactors(factors));
        System.out.println("Product of factors: " + findProductOfFactors(factors));
        System.out.println("Product of cubes of factors: " + findProductOfCubes(factors));
    }
	
    // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int num) {
        int[] factors = new int[num];
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[count] = i;
                count++;
            }
        }
		
		// Create a new array with the exact size of factors found
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = factors[i];  // Copy the factors to the new array
        }
        return result;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int max = 0;
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find the sum of the factors using the factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double findProductOfCubes(int[] factors) {
        double productOfCubes = 1;
        for (int factor : factors) {
            productOfCubes *= Math.pow(factor, 3);  // Cube the factor and multiply
        }
        return productOfCubes;
    }
}
		 