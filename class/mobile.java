import java.util.Scanner;

class Samsung
{
	int model=123;
	String name="Samsung";
	int price= 25000;
}
class Nokia
{
	int model=256;
	String name="Nokia";
	int price= 20000;
}

 class MobileTest
 {
	  public static void main(String a[])
	{
		Samsung s1=new Samsung();
		Nokia n1=new Nokia();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which brand Samsung (press 1) and Nokia (press 2)");
		int i=sc.nextInt();

		if (i==1)
		{
			System.out.println("Brand name :"+s1.name);
			System.out.println("Model :"+s1.model);
			System.out.println("Price :"+s1.price);
		}
		else if (i==2)
		{
			System.out.println("Brand name :"+n1.name);
			System.out.println("Model :"+n1.model);
			System.out.println("Price :"+n1.price);
		}
	}
 }
 
 	
	

 
