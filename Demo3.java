//Paint() method and Graphics and Font package.
import java.awt.Frame;
import java.awt.event.*;
import java.awt.Color;
//package for Grapics
import java.awt.Graphics;
import java.awt.Font;
public class Demo3 extends Frame{
    Demo3()
    {
       // Frame f=new Frame();
        setVisible(true); 
        setSize(500,500);
        setLocation(500,200);
        setBackground(Color.pink);
        setForeground(Color.blue);//Foreground color changed.
        Font f1=new Font("Fotre",Font.BOLD,30);
        setFont(f1);
        //Code for closing the frame .
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g)
    {
        g.drawString("Raushan Kumar",150,200);
        g.drawLine(155,155,255,155);
        g.drawLine(290,220,390,220);
    }
    public static void main(String[] args)
    {
       Demo3 D3=new Demo3();
    }
}
