class student
{
	private int roll, marks;
	private String name, city;
	
	public student(int r, int m, String n, String c)
	{
		roll=r;
		marks=m;
		name=n;
		city=c;
	}
	public student()
	{
	
	}
	
	void show_data()
	{
		System.out.println("Roll= "+roll+" Marks= "+marks+" Name= "+name+" City= "+city);
	}
	
	public static void main(String args[])
	{
		student s1=new student(1,100,"TC","Kolkata");
		student s2=new student();
		s1.show_data();
		s2.show_data();
		
	}
}


