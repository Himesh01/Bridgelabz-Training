package scenariobasedpractice.loanbuddy;

import java.util.ArrayList;

public class Bank {
      ArrayList<Customer> customer = new ArrayList<>();
      
      public void addCustomer(int customerId, String customerName, float creditScore) {
    	  for(Customer cus : customer) {
    		  if(cus.customerId==customerId) {
    			  System.out.println("Customer Id already exists");
    			  return;
    		  }
    	  }
    	  Customer cus = new Customer(customerId,customerName,creditScore);
    	  customer.add(cus);
    	  System.out.println("Successfully created account "+cus.customerName);
      }
      public void getLoan(int customerId,int loanId,double loanAmount) {
    	  for(Customer cus: customer) {
    		  if(cus.customerId==customerId) {
    			  cus.getLoan(cus.customerName, loanId, loanAmount);
    			  return;
    		  }
    	  }
    	  System.out.println("Customer does not exists");
      }
      public void payEMI(double amount ,int customerId, int loanId) {
    	  for(Customer cus: customer) {
    		  if(cus.customerId==customerId) {
    			  cus.payEMI(loanId, amount);
    			  return;
    		  }
    	  }
    	  System.out.println("Customer does not exists");
      }
      public void getDetails(int customerId) {
    	  for(Customer c : customer) {
    		  if(c.customerId==customerId) {
    			  c.getPersonalDetails();
    			  return;
    		  }
    	  }
    	  System.out.println("Customer does not exists");
      }
}