import java.util.Scanner;
public class AmstrongNumber{

public static void main(String[]args)
{
int rem,rev=0,n;
Scanner p=new Scanner (System.in);
System.out.println("please enter a number");
 n=p.nextInt();
 int result=n;	


	
	while(n!=0)
{
		rem=n%10;
		rev=(rem*rem*rem)+rev;
		n/=10;
}
		if(result==rev)
	{
System.out.println("number is amstrong");
  }
else
{
System.out.println("number is not amstrong");
}

}
}
