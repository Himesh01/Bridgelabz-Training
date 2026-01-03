package scenariobasedpractice.customeraccount;

public class Account {
	double balance;
    int accountno;
    public Account(double balance,int accountno) {
 	   this.balance = balance;
 	   this.accountno = accountno;
    }
    public void deposit(double balance) {
    	this.balance+=balance;
    }
	   
    public void withDrawal(double amount) {
    	if(this.balance>=amount) {
    		this.balance-=amount;
    	}
    	else {
    		System.out.println("Not Enough Balance");
    	}
    }
    public void checkBalance() {
    	System.out.println("Balance :"+this.balance);
    }
}
