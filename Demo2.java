//How to close a Frame.
import java.awt.Frame;
import java.awt.event.*;
import java.awt.Graphics;
public class Demo2 {
    // public void paint(Graphics g)
    // {
    //     g.drawString("Raushan Kumar",250,100);
    //     g.drawLine(50,50,150,150);
    // }
    public static void main(String[] args)
    {
        Frame f=new Frame();
        f.setVisible(true); //making visible the frame.
        f.setSize(500,500);
        // setBackground(Color.pink);
        // setForeground(Color.blue);
        //Code for closing the frame .
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}
