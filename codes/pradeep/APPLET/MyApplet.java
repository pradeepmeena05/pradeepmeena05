import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code="MyApplet" Width="300" height="200"> </applet>*/

public class MyApplet extends Applet{

Label L1, L2,L3;
TextField t1,t2;
Button button;

public void init(){
L1=new Label ("first number");
L2=new Label("second number");
L3=new Label();

t1=new TextFiled();
t2=new TextFiled();

button=new Button ("Add");

setLayout(null);

L1.setBounds(30,50,100,20);
L2.setBounds(30,100,100,20);

t1.setBounds(150,50,100,20);
t2.setBounds(150,100,100,20);
button.setBounds(100,150,80,20);
L3.setBounds(30,180,100,20);

add(t1);
add(L1);
add(L2);
add(t2);
add(button);
add(L3);

button.addActionListener(new MyHandler());
}
public class MyHandler implements ActionListener{

public void actionPerformed (ActionEvent e){
int a,b,s;

a=Integer.parseInt(t1. getText());
b=Integer.parseInt(t2 .getText());

s=a+b;
L3.setText("sum is "+s);
}
}
}

