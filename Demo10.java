//Loop Concept for printing 1 to 10 numbers on frame having some time gap
import java.awt.*;
import java.awt.event.*;
public class Demo10 extends Frame {
    Demo10() 
    {
        setVisible(true);
        setSize(500,600);
        setLocation(500,200);
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
        int y= 100;
        for(int i=1;i<=10;i++){
        g.drawString(""+i,250,y);
        try{
            Thread.sleep(500);
        }
        catch(Exception e){}
        y=y+50;
        }

    }
    public static void main(String[] args)
    {
        Demo10 d =new Demo10();
    }
}
