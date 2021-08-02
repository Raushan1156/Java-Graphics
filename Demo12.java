//Loop Concept for printing 1 to 10 numbers on frame having some time gap and diffentiated by the line between of them.
import java.awt.*;
import java.awt.event.*;
public class Demo12 extends Frame {
    Demo12() 
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
      int y1=100;
      int x2=90;
      int y2=600;

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

        
     // Line is not at perfect position.
        g.drawLine(x1,y1,x2,y2);   
        x1=x1+80;
        x2=x2+80;      
         x=x+70;
          y=100;
    }

    }
    public static void main(String[] args)
    {
        Demo12 d11 =new Demo12();
    }
}
