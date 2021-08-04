package oopsdemo2;

//Multilevel inheritance
//Account  --- > SavingsBank ---> AccountDetails
public class AccountDetails extends SavingsBank //child class of Savings bank
{
	int withdrawl,deposit,finalBalance;
	public AccountDetails(int accNo, String name, int mb, int b,int w,int d) {
		super(accNo, name, mb, b);
		this.withdrawl=w;
		this.deposit=d;
	}
	void display()
    {
            super.display();// invoke SavingsBank class method
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalBalance=(balance+deposit)-withdrawl;
            System.out.println("Final Balance :"+finalBalance);
    }

}
