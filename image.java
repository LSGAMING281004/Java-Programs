import java.awt.*;
import java.applet.*;
/*<applet code="image" width=500 height=500>
</applet>*/
public class image extends Applet
{
	Image picture;
	public void init()
	{
		picture = getImage(getDocumentBase(),"itachi-uchiha.3840x2160.jpg");
	}
	public void paint(Graphics g)
	{
			for(int i=1;i<=1500;i++)
			{
			g.drawImage(picture,i,i,this);
			}
	}
}