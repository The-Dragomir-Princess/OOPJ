import java.util.Scanner;
class sumdigits
{ 
      
    
    static int getSum(int n) 
    {     
        int sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
      
    return sum; 
    } 
  
    
    public static void main(String[] args) 
    { 
        Scanner x=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=x.nextInt();
  
        System.out.println(getSum(n)); 
    } 
} 








