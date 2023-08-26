import java.util.Scanner;
	
	 public class Harshad{
	
	 public static void main (String[]args){
	
	 int sum=0,n,rem;
	
	 Scanner sc=new Scanner(System.in);
	
	 System.out.println("please enter a number");
	 n=sc.nextInt();
	 
	 int x=n;
	
	 while(n!=0){
	 
 	 rem=n%10;
	 sum=rem+sum;
	 n=n/10;
              }
	 if(x%sum==0)
	{
	 
	  System.out.println("x is harshad number");
	}
	else
	{
	  System.out.println(" x is not harshad number" );
	}
	
 }
 
}
 
 




	
