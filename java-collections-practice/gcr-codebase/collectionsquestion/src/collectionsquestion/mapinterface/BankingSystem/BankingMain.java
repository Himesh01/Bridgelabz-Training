package collectionsquestion.mapinterface.BankingSystem;

public class BankingMain {
	public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        bank.createAccount(101, 5000);
        bank.createAccount(102, 3000);
        bank.createAccount(103, 8000);

        bank.requestWithdrawal(101);
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(103);

        bank.processWithdrawals(4000);

        bank.showAccountsSortedByBalance();
    }
}
