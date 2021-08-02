// Draw the 3-D rectangle and 3-D round_rectangle
//g.draw3DRect(x,y,w,h) and g.draw3DRoundRect(x,y,w,h,xr,yr);
import java.awt.*;
import java.awt.event.*;
public class Demo9 extends Frame {
    Demo9()
    {
        setVisible(true);
        setSize(500,500);
        setLocation(500,250);
        setBackground(Color.pink);
        setForeground(Color.red);
        Font f=new Font("Forte",Font.BOLD,50);
        setFont(f);
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
        g.drawString("StairCase",250,70);

        // Learned new today
        // g.draw3DRect(50,50,100,100,true);
         g.fill3DRect(50,50,100,100,true);

        // g.drawRect(150,150,100,100);
       // g.draw3DRect(250,250,100,100,false);
        g.fill3DRect(250,250,100,100,false);
       // g.drawRect(350,350,100,100);
        // g.drawLine(50,150,150,250);
       // g.drawLine(150,250,250,350);
      // g.drawLine(50,150,350,450);

    }
    public static void main(String[] args)
    {
        Demo9 d =new Demo9();
    }
}
