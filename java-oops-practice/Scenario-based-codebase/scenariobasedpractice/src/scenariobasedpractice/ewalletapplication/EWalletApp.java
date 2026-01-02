package scenariobasedpractice.ewalletapplication;

public class EWalletApp {
	public static void main(String[] args) {
        
        User alice = new User("Himesh", new PersonalWallet(5000.0, 50.0)); 
        User shop = new User("TechHind", new BusinessWallet(10000.0, 0.0));

        System.out.println("Himesh Balance before: $" + alice.getWallet().getBalance());
        
        ((Transferrable) alice.getWallet()).transferTo(shop, 2000.0);

        System.out.println("Himesh Balance after: $" + alice.getWallet().getBalance());
        System.out.println("TechHind Balance: $" + shop.getWallet().getBalance());

        alice.getWallet().viewHistory();
    }
}