class Code{
public static void main (String[]args){

 int balance=500;
 int withdrawlamount=5000;

	try{
      
      if(balance<withdrawlamount)
      throw new ArithmeticException("insufficient balance");
      
      balance=balance-withdrawlamount;
      
      System.out.println("transaction sucessfull");
      }
      catch(ArithmeticException e)
      {
      System.out.println("ArithmeticException " + e.getMessage());
      }
      System.out.println("program continue");
      }
     }
