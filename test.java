class check
{
	private String name,family,spz;
	private int age;
	
	private static check instance=null;
	private check()
	{
		
		
	}
	
	private check(String n, String f, String s,int a)
	{
		name=n;
		family=f;
		spz=s;
		age=a;
		
	}
	
	
	
	public void show()
	{
		System.out.println("\nName: "+name+"\nFamily: "+family+"\nSpecialization: "+spz+"\nAge: "+age);
	}
	
	public static check getobj(String n, String f,String s,int a)
	{
		if(instance==null)
		{
			instance=new check(n,f,s,a);
		}		
		return instance;
	}
}

class test
{
	public static void main(String args[])
	{
		check c1=check.getobj("Vasilisa","Dragomir","Spirit",36);
		check c2=check.getobj("Christian","Ozera","Fire",36);
		check c3=check.getobj("Rosemarie","Guardian","shadows",36);
		check c4=check.getobj("Valkyrie","Dragomir","Combat",20);
		check c5=check.getobj("Twisha","Dragomir","Charmed fire",16);
		c1.show();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
			
	
