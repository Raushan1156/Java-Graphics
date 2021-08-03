// Ashoka Chakra in white color only
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
public class Demo17 extends Frame {
    Demo17()
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
        int sa=0;
        int ma=4; // margin pixel
        g.setColor(Color.white);
        
        for(int i=0;i<=24;i++){
            g.fillArc(x1,y1,x2,y2,sa,ma);
          sa=sa+15;
            try{
               Thread.sleep(20);
            }
            catch(Exception e){}
           
        }
    }
    public static void main(String [] args)
    {
        Demo17 d17=new Demo17();
    }
}
