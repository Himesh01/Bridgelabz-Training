package scenariobasedpractice.customeraccount;
import java.util.ArrayList;

public class Customer {
	ArrayList<Account> accounts = new ArrayList<>();
	   String name;
       int id;
	   public Customer(String name, int id) {
		this.name = name;
		this.id = id;
	   }
	   
	   public void openAccount(Account ac) {
		   accounts.add(ac);
	   }
	   
	   public void checkBalance( int accno) {
		   for(Account a:accounts) {
			   if(a.accountno==accno) {
				   a.checkBalance();
				   return;
			   }
		   }
		   System.out.println("Account not found");
	   }
       public void deposit(double amount,int accno) {
    	   for(Account a:accounts) {
			   if(a.accountno==accno) {
				   a.deposit(amount);
				   return;
			   }
		   }
		   System.out.println("Account not found");
       }
       public void withdrawal(double amount, int accno) {
    	   for(Account a:accounts) {
			   if(a.accountno==accno) {
				   a.withDrawal(amount);;
				   return;
			   }
		   }
		   System.out.println("Account not found");
       }
}