import java.util.Scanner;
class TRY{
public static void findfile() throws IOException{
File newFile=new File("test.txt");
FileInputStream Stream=new FileInputStream(newFile);
}
public static void main(String[]args){
 try{
 findfile();
 }
 catch(IOException e){
 System.out.println(e);
 }
 }
 }
