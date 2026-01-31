package functionalInterface.markerinterfaces.sensitivedatatagging;

public class BankAccount implements SensitiveData {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber + "', balance=" + balance + "}";
    }
}