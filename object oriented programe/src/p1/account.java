package p1;
class account 
{
	private int number;
	private double balance;
	private double amount;
	private int another;

	account (int number,double balance)
	{
		this.number=number;
		this.balance=balance;
	} 
	void getAccount()
	{
		System.out.println("Number = "+number);
		System.out.println("Balance = "+balance);
	} 
	public int getNumber()
	{
		return this.number;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setCredit(double balance)
	{
		this.balance=balance;
	}
	public void updateDebit(double amount)
	{
		if (this.balance>=amount)
		{
			this.balance=this.balance-amount;
		}
		else
		{
			System.out.println("Amount Exceeded");
		}
	}
	public void transferTo(int another,double amount)
	{
     if (balance>=amount)
     {
     	this.amount=amount;
     	this.another=another;
     	this.number=number;
     	this.balance=this.balance-amount;
     	System.out.println("Number ="+another);
     	System.out.println("Balance ="+amount);
     }
	}
}

class accounttest
{
	public static void main(String agrs[])
	{
     account a1=new account(500,1200.5);
     a1.getNumber();
     int x=a1.getNumber();
     System.out.println("Account Number ="+x);
     double y=a1.getBalance();
     System.out.println("Account Balance ="+y);
     a1.setCredit(200000);
     a1.getAccount();
     a1.updateDebit(10000);
     a1.getAccount();
     a1.transferTo(501,100000);
     a1.getAccount();
	}
}