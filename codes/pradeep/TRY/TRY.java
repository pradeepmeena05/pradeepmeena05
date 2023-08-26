 class Base{
         
         Base(){
         System.out.println("base constructor is called");
        
         }
         class Derived extends Base{
         Derived(){
         super();
         System.out.println("derived constructor is called");
         }
         
         void fun(){
          System.out.println("derived fun  is called");
          }
          }
          class TRY {
          public void main (String args[]) {
          
          Derived d=new Derived();
          d.fun();
          }
          }
          }
