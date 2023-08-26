
import java.util.Scanner;

public class Lcm{
	 
  public static void main(String[]args) {
     
      int number,n1,n2,gcd=1,Lcm;
 	  	Scanner input=new Scanner(System.in);
 		
 		  System .out.println(" please enter the number");
 		  n1=input.nextInt();
 		  
 		  System .out.println(" please enter the number");
 		  n2=input.nextInt();
 		  
 	   	for(int i=1;i<=n1&&i>=n2;i++)
 
 		{
 				if(n1%i==0&&n2%i==0)
 			  gcd=i;
 	  }
  
 			 Lcm=(n1*n2)/gcd;
 			 
 	
  		System.out.printf("The LCM of %d and %d is %d.", n1, n2, Lcm);  
  }
  
}
