import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Demo"  width=200 height=200>
 * </applet>
*/
public class Demo extends Applet implements ActionListener
{
    
    String msg="";
    Button x,y;
    public void init()
    {
        x=new Button("YES");
        y=new Button("NO");
        add(x);
        add(y);
        x.addActionListener(this);
        y.addActionListener(this);
    }
    
        public void actionPerformed(ActionEvent e)
        {
            String str=e.getActionCommand();
            if(str.equalsIgnoreCase("YES"))
            {
                msg="You pressed yes";
            }
            else{
                msg="You pressed No";
            }
            repaint();
        }
            public void paint(Graphics g)
            {
                g.drawString(msg,6,100);
            }
        
        
    
}