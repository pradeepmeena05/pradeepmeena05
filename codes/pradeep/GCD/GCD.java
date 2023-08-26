public class GCD {
   int m,n;
   int gcd(int m,int n){
   if(m>n) return gcd(n,m);
   if(m==n) return  m;
   if(m==0) return n;
   if(m==1) return 1;
   return gcd(m,n%m);
   }
   public static void main(String[]args){
   GCD sc=new GCD();
   //g.m=Integer.parseInt(args[1]);
   //g.n=Integer.parseInt(args[1]);
  int m=sc.nextInt();
  int n=sc.nextInt();
   System.out.printf("GCD of %d and and %d id %d",m,n,sc.gcd(m,n));
   }
   }
   
  
