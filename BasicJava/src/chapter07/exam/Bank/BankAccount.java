package chapter07.exam.Bank;

public class BankAccount {
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {        //입금 메소드
		balance += amount;
	}

	public boolean withdraw(int amount) {   // 출금 메소드
		balance -= amount;
		return false;
		
	}

	public boolean transfer(int amount, BankAccount otherAccount) {   //이체메소드
		withdraw(amount);
		otherAccount.deposit(amount);
		
		return true;
	}

}
