package scenariobasedpractice.loanbuddy;


import java.util.ArrayList;

public class Customer {
	
	ArrayList<Loan> loan = new ArrayList<>();
	int customerId;
	String customerName;
	float creditScore;
	public Customer( int customerId, String customerName, float creditScore) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.creditScore = creditScore;
	}
   
	public void getLoan(String name,int loanId,double amount) {
		if(this.creditScore<5.5) {
			System.out.println("Not eligible for loan");
			return;
		}
		Loan l1 = new Loan(loanId,amount,name);
		loan.add(l1);
		System.out.println("Successfully get the loan");
	}
	public void getPersonalDetails() {
		System.out.println("\n-------Personal Details----------");
		System.out.println("Customer Name  : "+this.customerName);
		System.out.println("Customer Id    : "+this.customerId);
		System.out.println("Credit Score   : "+this.creditScore);
		System.out.println("Number of Loan : "+this.loan.size());
		System.out.println("\n--------Loans Details----------");
		for(Loan l: loan) {
			l.details();
		}
	}
	public void payEMI(int loanId,double amount) {
		for(Loan l: loan) {
			if(l.loanId==loanId) {
				l.payEMI(amount);
				return;
			}
		}
		System.out.println("Loan not found");
		return;
	}
}