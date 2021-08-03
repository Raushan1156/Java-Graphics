// Shining moon with different colors
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
public class Demo18 extends Frame {
    Demo18()
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
        int sa=0;
        
        
        // For drawing colorful arcs having 15 degrees, Change margin to the sa i.e. 15. 
      //  int ma=3; // margin pixel
      int ma=15;

        g.setColor(Color.white);
        
        for(int i=0;true;i++){
            int r=(int)Math.round(Math.random()*255);
            int g1=(int)Math.round(Math.random()*255);
            int b=(int)Math.round(Math.random()*255);

            Color c= new Color(r,g1,b);
            g.setColor(c);



           /*  Colorful  Ashoka Chakra
            g.fillArc(x1,y1,x2,y2,sa,ma);
          sa=sa+15;*/



          g.fillArc(x1,y1,x2,y2,sa,ma);
          sa+=15;



         // g.fillArc(x1,y1,x2,y2,sa,360);        // Shining Moon



            try{
               Thread.sleep(20);
            }
            catch(Exception e){}
           
        }
    }
    public static void main(String [] args)
    {
        Demo18 d18=new Demo18();
    }
}
