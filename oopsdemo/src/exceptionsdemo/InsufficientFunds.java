package exceptionsdemo;

//use of *User defined Exceptions*

//InsufficientFunds-->CheckingAccount-->BankDemo
public class InsufficientFunds extends Exception{ //Exception is inbuilt class
	private double amount;

	public InsufficientFunds(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
