//  Fill Polygon
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
public class Demo8 extends Frame{
    Demo8()
    {
        setVisible(true);
        setSize(500,500);
        setLocation(500,250);
        setBackground(Color.pink);
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

        // filling polygon
        int x[]={400,150,50};
        int y[]={400,250,50};
        int n=3;
        g.setColor(Color.cyan);
        g.fillPolygon(x,y,n);
    }
        public static void main(String[] args)
        {
            Demo8 d8=new Demo8();
        }
    }