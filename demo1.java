import P1.university;
import java.util.Scanner;

public class stud_base 
{
	private String name, branch;
	private int  reg_no, year, sem;
	Scanner sc=new Scanner(System.in);
	sc.name=nextLine();
	sc.branch=nextLine();
	sc.reg_no=nextInt();
	sc.year=nextInt();
	
	
	public void show()
	{
		System.out.println("Basic Student Info:");
		System.out.println("Name:"+ name+"\nRegistration Number:"+ reg_no+"\nBranch:"+branch+"\nYear:"+year+"\nSemester:"+sem);
	}
}

class Academic implements university
{
	int m1, m2, m3, m4;
	float cgpa;
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter marks of Java:");
	s1.m1=nextInt();
	System.out.println("Enter marks of DS:");
	s1.m2=nextInt();
	System.out.println("Enter marks of EM3:");
	s1.m3=nextInt();
	System.out.println("Enter marks of STLD:");
	s1.m4=nextInt();
	cgpa= 8.75;
	public void show()
	{
		System.out.println("Academic Records:");
		System.out.println("Marksheet:"+"\n Java:"+m1+"\nDS:"+m2+"\nEM3:"+m3+"\nSTLD:"+m4);
		System.out.println("CGPA:"+ cgpa);
	}
		
	
	
