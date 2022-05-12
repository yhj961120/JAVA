package chapter10;

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
