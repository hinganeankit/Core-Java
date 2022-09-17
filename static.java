class staticblock
{
	static int k;

	static {

		k=3;

		System.out.println("Staticblock execute");
	}

	{
		System.out.println("Instance block executes");
	}

	staticblock()
	{
		System.out.println("Constructor executes");
	}

	public static void main(String a[])
	{
		staticblock.k=4;
		System.out.println("Main method executes");
		staticblock b1=new staticblock();
	}
}

