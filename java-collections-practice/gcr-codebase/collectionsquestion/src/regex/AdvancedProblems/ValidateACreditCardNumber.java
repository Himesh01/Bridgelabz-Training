package regex.AdvancedProblems;

public class ValidateACreditCardNumber {
	public static void main(String[] args) {

        String[] cards = { "4123456789012345",  "5123456789012345",    "6123456789012345",    "412345678901234"     };

        String regex = "^(4|5)[0-9]{15}$";

        for(String card : cards) {
            System.out.println(card + " → " + card.matches(regex));
        }
    }

}
