import java.util.Scanner;
class Account
{
	private String accountno;
	private double balance;

	Account (String accountno,double balance)
	{
		this.accountno=accountno;
		this.balance=balance;
	}
	void printAccount()
	{
		System.out.println("Account Number is : "+this.accountno);
		System.out.println("Account Balance is : "+this.balance);
		System.out.println("------------------------------------------------");
	}
	public String getAccountno()
	{
		return accountno;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		 this.balance=balance;
	}
	public void updateCridet(double c)
	{
		this.balance=balance+c; 
	}
	public void updateDebit(double d)
	{
		this.balance=balance-d;
	}
}
class accountTest
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Number");
		String x=sc.nextLine();
		System.out.println("Enter the Account Balance");
		double y=sc.nextDouble();
		Account a1=new Account(x,y);

		System.out.println("Account number is "+a1.getAccountno());
		System.out.println("Account Balance is "+a1.getBalance());
		System.out.println("------------------------------------------------");
		System.out.println("Set New Balance");
		double p=sc.nextDouble();
		a1.setBalance(p);
		a1.printAccount();
		System.out.println("------------------------------------------------");
		System.out.println("Amount Crideted in Account");
		double q=sc.nextDouble();
		a1.updateCridet(q);
		a1.printAccount();
		System.out.println("------------------------------------------------");
		System.out.println("Amount Debited in Account");
		double r=sc.nextDouble();
		a1.updateDebit(r);
		a1.printAccount();
	}
}