 import java.util.Scanner;

 
 interface polygon{
  void getArea(int length,int breath);
  }
  
  class Rectangle implements polygon{
  
  public void getArea(int length,int breath){
  
  System.out.println("The area of the Rectangle is"+ (length*breath));
  }
  
}
 public class TEST{
 
 public static void main(String[]args){

Rectangle r1=new Rectangle();
r1.getArea(3,4);
}
}
