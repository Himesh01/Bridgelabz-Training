package multithreading.ScenarioBasedProblem.Banking;

public class Customer extends Thread {
	
 private final Bank bank;
 private final int accountNumber;

 public Customer(Bank bank, int accountNumber, String name) {
     super(name);
     this.bank = bank;
     this.accountNumber = accountNumber;
 }

 @Override
 public void run() {
     System.out.println(getName() + " started (Account " + accountNumber + ")");

     try {
         Thread.sleep(100);
         bank.deposit(accountNumber, 10000);

         for (int i = 0; i < 6; i++) {
             Thread.sleep(150 + (int)(Math.random() * 400));

             if (Math.random() < 0.55) {
                 int amount = 500 + (int)(Math.random() * 2000);
                 bank.withdraw(accountNumber, amount);
             } else {
                 int amount = 300 + (int)(Math.random() * 1500);
                 bank.deposit(accountNumber, amount);
             }
         }

     } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
     }

     System.out.printf("%s finished. Balance = %d%n",
             getName(), bank.getBalance(accountNumber));
 }
}