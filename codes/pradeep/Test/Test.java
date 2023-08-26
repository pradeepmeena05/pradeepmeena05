  import java.util.Scanner;
  class TRY{

  
 static int display(){
  System.out.println("this is static method");
  return 0;
  }
  }
  //class TRY1 {
  
  //int  display(){
  
  //System.out.println("this is non static method");
  //return 0;
 // }
 // }
  
  class Test{
  
  public static void main(String []args){
  
//TRY1 t=new TRY1();

//t.display();
int s=TRY.display();

}
}
