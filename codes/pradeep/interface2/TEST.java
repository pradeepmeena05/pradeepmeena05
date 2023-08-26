	import java .util.Scanner;


	
	interface add{
	
	
	void getSum(int a,int b);
	
}
  class TRY implements add{
  
  public void getSum(int a,int b){
  
  System.out.println("sum"+(a+b));
  
  
  }
  }
  
  
public class TEST{
	
	public static void main(String[]args){
	
	Scanner s=new Scanner(System.in);
	
	int a=s.nextInt();
	int b=s.nextInt();
	
	TRY p=new TRY();
	p.getSum(a,b);
	}
	}
