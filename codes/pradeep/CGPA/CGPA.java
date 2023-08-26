   import java.util.Scanner;
  
   public class CGPA{
  
   public static void main(String[]args){
  
   float M,E,C,ED,BEEE;
   double n,Avg,result;
   Scanner sc=new Scanner(System.in);
   
   System.out.println("please enter subject number ");
   
     
   C=sc.nextFloat();
   E=sc.nextFloat();
   M=sc.nextFloat();
   ED=sc.nextFloat();
   BEEE=sc.nextFloat();
  
  Avg=(C+E+M+ED+BEEE)/5.0;
  result=(9.5)*Avg;
  
  
  System.out.println("result="+result);
}
}
   
