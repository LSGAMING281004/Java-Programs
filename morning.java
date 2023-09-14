import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="morning"  width=3000 height=2000>
 * </applet>
*/
public class morning extends Applet
{
    public static int i=0,j=0,flag=1,yy=1000,xx=100;
     
    public void paint(Graphics g)
    {
        
                if(flag<1800){
            setBackground(Color.white);    
        g.setColor(Color.yellow);
        if(flag<250||flag>1400)
        g.setColor(Color.orange);
        if(flag<150||flag>1600)
        g.setColor(Color.red);
        while(i<flag)
        {
            try{
            while(j<=flag)
            {
                
			g.fillOval(xx,yy,80,80);
            Thread.sleep(4);

            j++;
            System.out.println(flag);
           
            }
        }
        catch(Exception e)
        {

        }
            ++i;
            if(flag>1000)
            {
                xx++;
                yy++;
            }
            else{
            xx++;
            yy--;
            }
            
        }
         repaint();
         flag++;
    }
    else{
        setBackground(Color.black);
          g.setColor(Color.lightGray);
        g.fillOval(500,200,80,80); 
        }
      
    }
}
