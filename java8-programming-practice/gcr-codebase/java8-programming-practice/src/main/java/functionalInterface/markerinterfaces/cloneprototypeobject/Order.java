package functionalInterface.markerinterfaces.cloneprototypeobject;

public class Order implements Cloneable {
	
	public int orderId;
	Customer customer;
	
	public Order(int orderId, Customer customer) {
		this.orderId = orderId;
		this.customer = customer;
	}
	
	@Override 
	protected Object clone() throws CloneNotSupportedException{
		
		Order clonedOrder = (Order) super.clone();

        Address clonedAddress =
                new Address(
                        this.customer.address.city,
                        this.customer.address.country
                );

        Customer clonedCustomer =
                new Customer(
                        this.customer.customerId,
                        clonedAddress
                );

        clonedOrder.customer = clonedCustomer;

        return clonedOrder;
	}
}
