package p1;
import java.util.Scanner;
class insufficientBalanceException extends RuntimeException
{
	public insufficientBalanceException()
	{

	}
	public insufficientBalanceException(String str)
	{
		super(str);
	}

}
class Person
{
	String name;
	String address;
	int age;
	Person()
	{

	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "Name:"+this.name+" Address:"+this.address+" Age:"+this.age;
	}

}
class Account extends Person
{
	String bank;
	double balance;
	Account()
	{

	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setBank(String bank)
	{
		this.bank=bank;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void updateDebit(double balance)
	{
	if(this.balance>balance)
	{
		this.balance=this.balance-balance;
	}

	else
	{
		throw new insufficientBalanceException("Insufficient Balance:"+this.balance);
		//System.out.println("Amount Excceds");
	}
	}
	public String toString()
	{
		return " Bank:"+this.bank+" Balance:"+this.balance;
	}

}
class PersonAccount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Person p1=new Person();
		p1.setName("Ankit");
		p1.setAddress("Shegaon");
		p1.setAge(25);
		System.out.println(p1.toString());
		Account a1=new Account();
		a1.setBank("Axis");
		a1.setBalance(10000);
		System.out.println(a1.getBalance());
		a1.updateDebit(7000);
		System.out.println("Updated Balance"+a1.getBalance());
		System.out.println(p1.toString()+a1.toString());
		a1.updateDebit(9000);
	}
}