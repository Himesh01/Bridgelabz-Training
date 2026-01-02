package scenariobasedpractice.ewalletapplication;

public class BusinessWallet extends Wallet implements Transferrable{
	private double taxRate = 0.02; // 2% business tax

    public BusinessWallet(double initialLoad, double bonus) {
        super(initialLoad, bonus);
        this.transferLimit = 50000.0; // Much higher limit
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double totalDeduction = amount + (amount * taxRate); // Using Operators
        if (getBalance() >= totalDeduction) {
            this.updateBalance(-totalDeduction);
            receiver.getWallet().updateBalance(amount);
            this.addLog("Business Transfer: $" + amount + " (Tax: $" + (amount * taxRate) + ")");
        }
    }

    @Override
    public void processTransaction(double amount) { /* Implementation */ }
}
