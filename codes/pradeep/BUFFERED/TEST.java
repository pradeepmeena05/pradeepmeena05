import java.io.*;

class TEST{

public static void main(String[]args)throws IOException{

BufferedWriter bf=new BufferedWriter(new FileWriter("../myfile",true));

bf.write("computer");
bf.close();
}
}
