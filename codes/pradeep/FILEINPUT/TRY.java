import java.io.*;

class TRY{

public static void main(String[]args)throws IOException{

int i;

FileInputStream fin;

fin=new FileInputStream("./ TRY.java");

do{

i=fin.read();

if(i!=-1)

System.out.println((char)i);
}
while(i!=-1);
fin.close();
}
}
