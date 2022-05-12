package chapter09;

public abstract class BankAccount {
	
	protected int balance;

	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if (balance < amount) {
			return false;
		}
		balance -= amount;
		return true;
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(amount < 0 || amount > balance) {
		throw new IllegalArgumentException();
		
		}
		if(otherAccount==null) {
		throw new NullPointerException();
		}
		withdraw(amount);
		otherAccount.deposit(amount);
		return true;
	}
	public abstract String getAccountType(); 
		
	
	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
}
