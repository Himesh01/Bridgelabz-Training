package regex.AdvancedProblems;

public class ValidateanIPAddress {
	public static void main(String[] args) {

        String[] ips = {"192.168.1.1","255.255.255.255","256.100.1.1", "10.0.0"};

        String regex =
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}"
          + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        for(String ip : ips) {
            System.out.println(ip + " - " + ip.matches(regex));
        }
    }
}
