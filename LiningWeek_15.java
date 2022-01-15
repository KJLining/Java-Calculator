package liningweek_15;
import java.awt.*;
import java.awt.event.*;
public class LiningWeek_15 implements ActionListener{
int c,n;
String s1,s2,s3,s4,s5;
Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,multiply,divide,equals,clear;
TextField disp;
LiningWeek_15(){
//Frame
Frame calc = new Frame ("Calculator");
//Display result
disp = new TextField();
disp.setBounds(20,40,260,50);

//Buttons for numbers
one = new Button("1");
one.setBounds(20,100,40,40);
one.addActionListener(this);

two = new Button("2");
two.setBounds(65,100,40,40);
two.addActionListener(this);

three = new Button("3");
three.setBounds(110,100,40,40);
three.addActionListener(this);

four = new Button("4");
four.setBounds(20,150,40,40);
four.addActionListener(this);

five = new Button("5");
five.setBounds(65,150,40,40);
five.addActionListener(this);

six = new Button("6");
six.setBounds(110,150,40,40);
six.addActionListener(this);

seven = new Button("7");
seven.setBounds(20,200,40,40);
seven.addActionListener(this);

eight = new Button("8");
eight.setBounds(65,200,40,40);
eight.addActionListener(this);

nine = new Button("9");
nine.setBounds(110,200,40,40);
nine.addActionListener(this);

zero = new Button("0");
zero.setBounds(20,250,40,40);
zero.addActionListener(this);

//Buttons for Functions
equals = new Button ("=");
equals.setBounds(65,250,85,40);
equals.setBackground(Color.magenta);
equals.addActionListener(this);

plus = new Button ("+");
plus.setBounds(160,100,50,90);
plus.addActionListener(this);

minus = new Button ("-");
minus.setBounds(160,200,50,90);
minus.addActionListener(this);

divide = new Button ("/");
divide.setBounds(220,100,60,40);
divide.addActionListener(this);

multiply = new Button ("*");
multiply.setBounds(220,150,60,40);
multiply.addActionListener(this);

clear = new Button ("CLR");
clear.setBounds(220,200,60,90);
clear.addActionListener(this);
clear.setBackground(Color.PINK);



// Add Elements
calc.add(clear);
calc.add(divide);
calc.add(multiply);
calc.add(minus);
calc.add(plus);
calc.add(equals);
calc.add(one);
calc.add(two);
calc.add(three);
calc.add(four);
calc.add(five);
calc.add(six);
calc.add(seven);
calc.add(eight);
calc.add(nine);
calc.add(zero);
calc.add(disp);
calc.setBackground(Color.CYAN);
calc.setSize(300,350);
calc.setLayout(null);
calc.setVisible(true);
calc.addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
    System.exit(0);
    }
});
}
@Override
public void actionPerformed(ActionEvent e){
if (e.getSource()==one){
s3 = disp.getText();
s4 = "1";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==two){
s3 = disp.getText();
s4 = "2";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==three){
s3 = disp.getText();
s4 = "3";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==four){
s3 = disp.getText();
s4 = "4";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==five){
s3 = disp.getText();
s4 = "5";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==six){
s3 = disp.getText();
s4 = "6";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==seven){
s3 = disp.getText();
s4 = "7";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==eight){
s3 = disp.getText();
s4 = "8";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==nine){
s3 = disp.getText();
s4 = "9";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==zero){
s3 = disp.getText();
s4 = "0";
s5 = s3+s4;
disp.setText(s5);
}
if (e.getSource()==plus){
s1 = disp.getText();
disp.setText("");
c = 1;
}
if (e.getSource()==minus){
s1 = disp.getText();
disp.setText("");
c = 2;
}
if (e.getSource()==multiply){
s1 = disp.getText();
disp.setText("");
c = 3;
}
if (e.getSource()==divide){
s1 = disp.getText();
disp.setText("");
c = 4;
}
if (e.getSource()==equals){
s2 = disp.getText();
 if (c==1){
 n = Integer.parseInt(s1) + Integer.parseInt(s2);
 disp.setText(String.valueOf(n));
 }
 if (c==2){
 n = Integer.parseInt(s1) - Integer.parseInt(s2);
 disp.setText(String.valueOf(n));
 }
 if (c==3){
 n = Integer.parseInt(s1) * Integer.parseInt(s2);
 disp.setText(String.valueOf(n));
 }
 if (c==4){
 n = Integer.parseInt(s1) / Integer.parseInt(s2);
 disp.setText(String.valueOf(n));
 }
}
if (e.getSource()==clear){
disp.setText("");
}
}
    public static void main(String[] args) {
       new LiningWeek_15();
    }
}
    

