 class Question1 extends Thread{
 
   public void run(){}
   
   public static void main(String[]args){
   
     Question1 t1=new Question1();
     Question1 t2=new Question1();
     System.out.println("First Thread name " + t1.getName());
     System.out.println("Second Thread name " + t2.getName());
     
     t1.start();
     t1.setName("pradeep");
     
     t2.start();
     t2.setName("arun");
     
     System.out.println("First thread name after use setname " + t1.getName());
     System.out.println("second thread name after use setname " + t2.getName());
     
   }
 }    
     
