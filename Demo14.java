//Movinng line had coded.
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
public class Demo14 extends Frame {
    Demo14()
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
        for(int i=0;i<=15;i++){
     //  while(true)                                            // will be done next page.
            // if(x2==350)
            // {
            //     x2=100;
            // }
            g.setColor(Color.red);
            g.drawLine(x1,y1,x2,y2);
            x2=x2+20;
            try{
                Thread.sleep(200);
            }
            catch(Exception e){}
           
        }
    }
    public static void main(String [] args)
    {
        Demo14 d14=new Demo14();
    }
}
