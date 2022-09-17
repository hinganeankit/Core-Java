import java.util.Scanner;
class Prime
{
	public static void main(String a[])
	{
		int i;
		int num;
		int j;
		int count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last number");
		num=sc.nextInt();
		
	   for (i=1;i<=num;i++)
         {
          count=0;
        for (j=1;j<=i;j++)
       {
           if (i%j==0)
          {
             count++;
          }
       }
         if (count==2)
       {
           System.out.println(i);
       }

	}
  }
}