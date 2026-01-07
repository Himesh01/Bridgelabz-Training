package scenariobasedpractice.loanbuddy;

public class Loan {
    int loanId;
    double loanAmount;
    String customerName;
	double remainingAmount;
    
    public Loan(int loanId, double loanAmount, String customerName) {
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.customerName = customerName;
		this.remainingAmount = loanAmount;
	}
    
    public void details() {
    	System.out.println("\n------Loan Details-------");
    	System.out.println("Customer Name : "+this.customerName);
    	System.out.println("Loan Amount   : "+this.loanAmount);
    	System.out.println("Loan Id       : "+this.loanId);
    	System.out.println("Remaining     : "+this.remainingAmount);
    }
    public void payEMI(double amount) {
    	if(remainingAmount<amount) {
    		this.remainingAmount -=amount;
    		System.out.print("access amount will be return to your account "+this.remainingAmount);
    	    return;
    	}
    	this.remainingAmount -= amount;
    	System.out.println("Amount Remained: "+this.remainingAmount);
    }
}