class Pradeep extends Thread 
{
   public void run()
   {
     for(int i=0;i<=5;i++)
     {
        System.out.println("Hiii.....");
        try
        {
           Thread.sleep(250);
        }
        catch(Exception e)
        {
           
        }
     }
   }
}
class Suraj extends Thread
{
   public void run()
   {
       for(int i=0;i<=5;i++)
     {
        System.out.println("Hello.....");
     }
     try
        {
           Thread.sleep(250);
        }
        catch(Exception e)
        {
        
        }
}
public class Ans
{
   public static void main (String args [])
   {
      Pradeep p=new Pradeep();
      Suraj s=new Suraj();
      
      p.start();
      s.start();
   }
   }
   }

