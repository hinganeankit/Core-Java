class point
{
    int x; int y;
    point (int x ,int y)
    {this.x=x;this.y=y;}
    
    @Override
   public boolean equals(Object p3)
   {	
     point p2=(point)p3;
	    if(this.x==p2.x && this.y==p2.y)
	    {
		  return true;
	    }
	    else
	    {
		  return false;
	    }
    }
}
class test
{
	public static void main(String[] args) 
	{
		point p1=new point(11,22);
		point p2=new point (11,22);

        if (p1==p2)
        {
        	System.out.println("Both are equal");
        }
        else
        {
        	System.out.println("Both are not equal");
        }

        System.out.println("--------------------------------");

        if (p1.equals(p2))
        {
        	System.out.println("Both are equal");
        }
        else 
        {
        	System.out.println("Both are not equal");
        }
	}

}