package functionalInterface.markerinterfaces.cloneprototypeobject;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("Delhi", "India");
        Customer customer = new Customer(101, address);
        Order originalOrder = new Order(5001, customer);

        Order clonedOrder = (Order) originalOrder.clone();

        clonedOrder.customer.address.city = "Mumbai";

        System.out.println(originalOrder.customer.address.city); 
        System.out.println(clonedOrder.customer.address.city);   
    }
}
