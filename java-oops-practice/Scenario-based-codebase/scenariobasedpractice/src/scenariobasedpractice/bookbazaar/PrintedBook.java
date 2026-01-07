package scenariobasedpractice.bookbazaar;

public class PrintedBook extends Book implements IDiscountable{

	public PrintedBook(int stock, String title, String author, double price) {
		super(stock, title, author, price);
		// TODO Auto-generated constructor stub
	}
	public void buy(int quantity) {
		if(this.stock<quantity) {
			System.out.println("Not Sufficient Book");
			return;
		}
		this.stock-=quantity;
		double total = (quantity*this.price);
		System.out.println("\nTotal amount     : "+total);
		double discount = (applyDiscount((quantity*this.price)));
		System.out.println("Discount applied : "+discount);
		System.out.println("Final Amount     : "+(total-discount));
	}

	@Override
	public double applyDiscount(double total) {
		
		return (total/100)*30;
	}
}