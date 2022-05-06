package chapter07.exam.advanced;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	public Bank() {
		customers = new Customer[10];
	}
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers++] = customer;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
	
}