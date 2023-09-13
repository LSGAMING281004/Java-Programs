import java.awt.*;
import java.applet.*;

import java.lang.Thread;
/*<applet code= "face"
 width=3000 height=2000>
</applet>
*/
public class face extends Applet
{
    public void paint(Graphics g)
    {
int i=375,j=615,x=385,y=625,q=390,w=390;
while(i<=425)
{
        g.setColor(Color.white);
//f
        g.fillOval(300,300,450,450);
g.setColor(Color.black);

g.drawOval(300,300,450,450);
        g.drawLine(338,400,490,110);
        g.drawLine(695,380,480,110);
        g.setColor(Color.red);
        g.fillOval(455,90,60,60);
        g.setColor(Color.white);
        g.fillOval(360,420,100,60);
        g.fillOval(600,420,100,60);
        g.setColor(Color.black);
g.drawOval(360,420,100,60);
g.drawOval(600,420,100,60);
        //eyebro
        g.drawLine(360,390,480,q);
        g.drawLine(580,w,700,390);
        g.drawArc(420,500,200,200,200,130);
        g.drawLine(480,550,530,590);
        g.drawLine(530,590,570,535);
g.setColor(Color.red);
        g.fillOval(i,440,30,30);
g.fillOval(j,440,30,30);
g.setColor(Color.black);
        g.fillOval(x,450,15,15);
        g.fillOval(y,450,15,15);
repaint();
   
j++;
x++;
i++;
y++;
w++;
q++;

try
{
Thread.sleep(100);
}
catch(InterruptedException e)
{
}
//(i=375;i<=425;i++)
}
   }
}
