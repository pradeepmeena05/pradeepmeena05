import java.io.*;

public class TRY{
 public static void main(String []args) throws IOException{
 
 int i;
 FileOutputStream fout;
  fout =new FileOutputStream("./myfile",true);
 
 String s="laptop";
  char ch[]=s.toCharArray();
  
  for(i=0;i<s.length();i++)
  
  fout.write(ch[i]);
  fout.close();
  }}
