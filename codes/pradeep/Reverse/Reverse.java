		import java.util.Scanner;
			class Reverse{
					public static void main(String args[]) {
						Scanner sc=new Scanner (System.in);
						
					  System.out.println("This program made by Pradeep meena ");
					  
					  System.out.println(" enter Digit");
					  int n=sc.nextInt();
					  
					  int rev=0,rem;
					  
					  while(n!=0)
					  {
					 		 rem=n%10;
					 		 rev=(rev*10)+rem;
					 		 n=n/10;
					  }
					  System.out.println(" Digit after reverse");
					  System.out.println(rev);
				}
		}			  
