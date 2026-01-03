package scenariobasedpractice.customeraccount;


public class SavingsAccount extends Account{
       int interest;
	   public SavingsAccount(double balance, int interest,int accountno) {
		super(balance,accountno);
		this.interest = interest;
	   }
}