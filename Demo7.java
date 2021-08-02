import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
public class Demo7 extends Frame{
    Demo7()
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

        //Threading Concept 
        g.setColor(Color.yellow);
        g.fillRoundRect(150,150,200,200,30,30);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {}


        // Another polygon will appear after 2second again.
        g.setColor(Color.blue);
        g.fillRoundRect(170,170,160,160,30,30);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e) {}

        g.setColor(Color.lightGray);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}

        g.fillRoundRect(190,190,120,120,30,30);
    }
    public static void main(String[] args)
{
    Demo7 d7=new Demo7();
}
}
