interface inter
{
	void show();
	void get();
}

class first implements inter
{
	int x,y;
	public first()
	{
		x=10;
		y=20;
		System.out.println("I am inevitable");
	}
	
	public void show()
	{
		System.out.println("I");
	}
	
	public void get()
	{
		System.out.println("am");
	}
}

class demo1
{
	public static void main(String arg[])
	{
		inter i=new first();
		i.show();
		i.get();
		System.out.println("Ironman");
	}
}
