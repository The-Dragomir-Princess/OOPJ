abstract class shape
{
   abstract public void area(int l, int b);
}

/*class rectangle extends shape
{
   int l=10;
   int b=20;
   int a;
   public void area()
   {
   		a=l*b;
   		System.out.println("Area is:"+a);
   	}
      
}*/

class parallelogram extends shape
{
	int a;
	public void area(int l,int b)
   {
   		a=l*b;
   		System.out.println("Area is:"+a);
   	}
}


class square extends parallelogram
{
	
}

class demo7
{
	public static void main(String args[])
	{
		/*rectangle r1 = new rectangle();
		r1.area();*/
		square s1= new square();
		s1.area(10,10);
		parallelogram p1= new parallelogram();
		p1.area(5,6);
    }
}

