//Loop Concept for printing 1 to 10 numbers on frame having some time gap
import java.awt.*;
import java.awt.event.*;
public class Demo11 extends Frame {
    Demo11() 
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
        int y= 100;
        int x=50;
        for(int j=1;j<=20;j++){
          for(int i=j;i<=j*10;i=i+j){
            g.drawString(""+i,x,y);
         try{
            Thread.sleep(500);
             }
        catch(Exception e){}
             y=y+50;
         }
        // System.out.println("\n");
          x=x+70;
          y=100;
    }

    }
    public static void main(String[] args)
    {
        Demo11 d11 =new Demo11();
    }
}
