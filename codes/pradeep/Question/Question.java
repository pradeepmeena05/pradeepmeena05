	import java.util.Scanner;
	
	public class Question implements Runnable{
	      
	    public void run(){
			System.out.println(Thread.currentThread().getName() + "has ended");
		}	
			public static void main(String[]args){
			
				Question T=new Question();
				Thread t1=new Thread(T);
				
				t1.setName("main Thread");
				t1.start();
				
				System.out.println("Welcome to java");
			}	
			}
				
				
