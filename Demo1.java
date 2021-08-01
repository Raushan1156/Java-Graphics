//package Demo_for_Graphics;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
//import java.awt.*;
public class Demo1 {
    public static void main(String[] args){
    Frame f= new Frame();
    f.setLocation(500,250);
    //f.setShape();
    f.setSize(500,500);
    f.setBackground(Color.pink);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){
    System.exit(0);}});
    }
}
