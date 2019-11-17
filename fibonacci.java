class fibonacci 
{ 
public static void main(String[] args) 
	{
		
		 float n = 20; 
		 int a = 0;
		 int b = 1;
		 int c;
		 float avg;
		 int sum=0;
		 
	          for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(a+" ");
	            c = a + b;
	            a = b;
	            b = c;
	            sum=sum+a;
	        }
 		avg=sum/n;
 		System.out.println("Average="+avg);
	}
 
}

