// Draw the rectangle and round_rectangle
//g.drawRect(x,y,w,h) and g.drawRoundRect(x,y,w,h,xr,yr);
import java.awt.*;
import java.awt.event.*;
public class Demo4 extends Frame {
    Demo4()
    {
        setVisible(true);
        setSize(500,500);
        setLocation(500,250);
        setBackground(Color.pink);
        setForeground(Color.blue);
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
        g.drawRect(50,50,100,100);
        g.drawRect(150,150,100,100);
        g.drawRect(250,250,100,100);
        g.drawRect(350,350,100,100);
        // g.drawLine(50,150,150,250);
       // g.drawLine(150,250,250,350);
       g.drawLine(50,150,350,450);

    }
    public static void main(String[] args)
    {
        Demo4 d =new Demo4();
    }
}
