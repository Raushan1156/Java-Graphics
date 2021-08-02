//Loop Concept for printing 1 to 10 numbers on frame having some time gap and diffentiated by the line between of them.
import java.awt.*;
import java.awt.event.*;
public class Demo13 extends Frame {
    Demo13() 
    {
        setVisible(true);
        setSize(1500,600);
        setLocation(30,100);
        setBackground(Color.pink);
        setForeground(Color.blue);
        Font f=new Font("Forte",Font.PLAIN,30);
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
        
      int x1=90;
      int y1=80;
      int x2=90;
      int y2=600;

          for(int i=1;i<=20;i++){
         try{
            Thread.sleep(500);
             }
        catch(Exception e){}
     // Line is not at perfect position.
        g.drawLine(x1,y1,x2,y2);   
        x1=x1+80;
        x2=x2+80;     
    }

    }
    public static void main(String[] args)
    {
        Demo13 d11 =new Demo13();
    }
}
