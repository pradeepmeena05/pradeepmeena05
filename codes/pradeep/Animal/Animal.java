import java.util.Scanner;
 class Example{
  
  public int display(int a,int b){
  System.out.print("sum = " + (a+b));
  return 0;
  }
  }
  class Animal{
  public static void main(String[]args){
  
  Scanner t=new Scanner(System.in);
  
   Example p=new Example();
   
   System.out.print("arun choice");
 int x=t.nextInt();
 
 System.out.print("pradeep choice");
  int y=t.nextInt();
  
 p.display(x,y);
 
 }
 }
 
