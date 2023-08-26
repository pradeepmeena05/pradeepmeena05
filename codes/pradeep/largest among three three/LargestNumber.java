import java.util.Scanner;
public class LargestNumber{

public static void main(String []args){

Scanner s=new Scanner (System.in);
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();

System.out.println("enter three number");

if(x>y)
{
	System.out.println("x is largest"+x);

}
    else if(y>z)
  {
	System.out.println("y is largest"+y);
  }
  else 
 {
	 System.out.println("z is largest"+z);
 }
 
 
}
}
