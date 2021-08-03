//Movinng line(made of points) forming a rectangle.
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
public class Demo15 extends Frame {
    Demo15()
    {
        setVisible(true);
        setSize(500,500);
        setLocation(500,250);
        setBackground(Color.blue);
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
        int x1=100;
        int y1=100;
        int x2=300;
        int y2=100;
        g.setColor(Color.red);
        g.drawLine(x1,y1,x2,y2);
        for(int i=0;i<=5;i++){
            g.drawLine(x1,y1,x2,y2);
            x2=x2+10;
         //  y2=y2+1;
            try{
                Thread.sleep(500);
            }
            catch(Exception e){}
           
         }
        for(int i=0;i<=200;i++){
            g.drawLine(100,100,x2,y2);
           // x2=x2+20;
           y2=y2+1;
            try{
               // Thread.sleep(5000);
               Thread.sleep(20);
            }
            catch(Exception e){}
           
        }
        g.setColor(Color.orange);
        for(int i=0;i<=260;i++){
            g.drawLine(100,100,x2,y2);
           x2=x2-1;
           //y2=y2+1;
            try{
               // Thread.sleep(5000);
               Thread.sleep(20);
            }
            catch(Exception e){}
           
        }
    }
    public static void main(String [] args)
    {
        Demo15 d15=new Demo15();
    }
}
