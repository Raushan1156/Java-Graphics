//Movinng collection of point made a circle.
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
public class Demo16 extends Frame {
    Demo16()
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
        int x2=100;
        int y2=100;
        int a=0;
        g.setColor(Color.red);
        g.drawArc(x1,y1,x2,y2,0,0);
        
        for(int i=0;i<=360;i++){
            g.fillArc(x1,y1,x2,y2,0,a);
          a=a+1;
            try{
               // Thread.sleep(5000);
               Thread.sleep(20);
            }
            catch(Exception e){}
           
        }
    }
    public static void main(String [] args)
    {
        Demo16 d15=new Demo16();
    }
}
