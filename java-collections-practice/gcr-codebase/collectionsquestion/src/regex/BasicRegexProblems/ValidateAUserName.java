package regex.BasicRegexProblems;

public class ValidateAUserName {
	
    public static void main(String[] args) {

        String[] usernames = {"user_123", "123user", "us", "User_1", "user@123"};

        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        for(String username : usernames) {
            if(username.matches(regex)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}