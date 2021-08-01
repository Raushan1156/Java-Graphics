// Draw Oval and Polygon.

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.*;
import java.awt.Graphics;
public class Demo6 extends Frame {
    Demo6()
    {
        setVisible(true);
        setSize(500,500);
        setLocation(500,250);
        setBackground(Color.pink);
        setForeground(Color.blue);
        addWindowListener(new WindowAdapter()
        {
         public void windowClosing(WindowEvent e)
         {
             System.exit(0);
         }   
        });
    }
        public void paint(Graphics g)
        {
            // How to draw an oval like Cirle,parabola etc.
            g.setColor(Color.cyan);
            g.drawOval(50,50,100,100);
            g.fillOval(52,52,95,95);

            g.drawOval(160,60,100,90);
            g.drawOval(270,70,100,80);
            g.drawOval(380,80,100,70);

            // How to draw a Polygon using AWT
            g.setColor(Color.black);
            int x[]={250,350,150};
            int y[]={250,400,400};
            int n=3;
           // g.setColor(Color.green);
            g.drawPolygon(x,y,n);
            g.drawString("Triangle",225,420);
           // g.fillPolygon(375,525,150,100);

        }
    public static void main(String[] args)
    {
        Demo6 d6=new Demo6();
    }
}
