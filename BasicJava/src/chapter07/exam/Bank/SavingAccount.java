package chapter07.exam.Bank;

import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

public class SavingAccount extends BankAccount{
private double interestRate;

public SavingAccount(int balance, double interestRate) {
	super(balance);
	this.interestRate = interestRate;
}

public void updateBalance(int period) {
	balance =+  balance * interestRate * period;
}

}
