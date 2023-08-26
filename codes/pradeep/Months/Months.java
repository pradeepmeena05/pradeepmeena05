import java.util.Scanner;
public class Months{
public static void main(String[]args){
int M,month;
Scanner sc=new Scanner(System.in);

System.out.print("enter a month number=");
M=sc.nextInt();

while(M<12){


if(M==1||M==3||M==5||M==7||M==8||M==10||M==12)

{
    System.out.print("31 days");
}
else if(M==4||M==6||M==9||M==11)
{
  
System.out.println("30 days");
}
else if(M==2)
{
 System.out.println("28/29 days"); 
}
}
System.out.print("this is wrong month");
}
}

