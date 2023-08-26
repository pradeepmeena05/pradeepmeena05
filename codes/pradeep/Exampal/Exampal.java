import java.util.Scanner;

  class Test1{
   
   public void display(){
   
    System.out.println("i am pradeep");
    }
  }
    class Test2 extends Test1{
    public void display1(){
        
    System.out.println("i am suraj");
   }
}
	public class Exampal{

  public static void main(String[]args){
  
   Test2 obj=new Test2();
   Test1 obj1=new Test1();
  obj.display1();
  obj1.display();
  obj.display1();
  }
  }
  
