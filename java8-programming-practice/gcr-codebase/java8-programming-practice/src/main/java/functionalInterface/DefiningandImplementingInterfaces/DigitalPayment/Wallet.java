package functionalInterface.DefiningandImplementingInterfaces.DigitalPayment;

public class Wallet implements Payment{
	public String wallet;
	public double walletAmount;
	
	public Wallet(String wallet, double walletAmount) {
		this.wallet=wallet;
		this.walletAmount =walletAmount;
	}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		if(walletAmount>=amount) {
			walletAmount-=amount;
			System.out.println("Wallet payment done\n");
			return;
		}
		System.out.println("Insufficient amount\n");
	}
	
}