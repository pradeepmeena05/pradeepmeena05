 import java.util.Scanner;

	public class Switch {
    public static void main(String[]args){
  	
  	  double n1,n2, Sum,Multipal,Substrack;
    	double Divide;
      char operator;
  	
  	  Scanner sc=new Scanner(System.in);
  	
    	System.out.println("please enter n1 number");
    	n1=sc.nextInt();
  
  	  System.out.println("please enter n2 number");
  	  n2=sc.nextInt();
  	
    	System.out.print("Enter any operator (+, -, *, /) ");
      char opt= sc.next().charAt(0);
  	
  	switch(opt){
  	
  	case '+':
  	   			 Sum=n1+n2;
  			     System.out.println(n1 + " + " + n2 + " = " + Sum);
  					 break;
  	  
    case '*':
  					 Multipal=n1*n2;
  	  			 System.out.println(n1 + "*" + n2 + "="  + Multipal);
  	 				 break;
  	  
  	case '/':
  	         Divide=n1/n2;
  	         System.out.println(n1 + "/" + n2 + "=" + Divide);
  	 				 break;
  	 	
  	case '-':
  	
             Substrack=n1-n2;
             System.out.println(n1 + "-"  + n2  + "=" + Substrack);
  	 				 break;
    default:        
    
              System.out.println("invalid");
              
          }     
              
       }
       
   }
       
       
       
       
       
       
       
       
       
            
            
            
            
            
