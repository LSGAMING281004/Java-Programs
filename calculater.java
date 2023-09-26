import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="calculater" width=2000 height=1000>
 * </applet>
 */

public class calculater extends Applet implements ActionListener {
    Button button[]=new Button[10],equal,plus,minus,mul,div,dout,clear;
    TextField t;
	String num1="",num2="",op="";

    public void init() {
        setLayout(null);
        t = new TextField("");
        t.setBounds(550,100,500,40);
        this.add(t);
        for(int i=0;i<10;i++)
        {
            button[i]=new Button(String.valueOf(9-i));
            button[i].setBounds(550+((i%3)*100),150+((i/3)*100),100,100);
           
            this.add(button[i]);
            button[i].addActionListener(this);
        }
        clear=new Button("C");
        dout=new Button(".");
        equal=new Button("=");
        plus=new Button("+");
        minus=new Button("-");
        mul=new Button("*");
        div=new Button("/");
        

        equal.setBounds(750,450,300, 100);
        plus.setBounds(950, 150, 100, 100);
        minus.setBounds(850, 350, 100, 100);
        mul.setBounds(850, 250, 100, 100);
        div.setBounds(850, 150, 100, 100);
        dout.setBounds(650,450,100,100);
        clear.setBounds(950,250,100,200);

        this.add(equal);
        this.add(plus);
        this.add(minus);
        this.add(mul);
        this.add(div);
        this.add(dout);
        this.add(clear);
		
		equal.addActionListener(this);
		minus.addActionListener(this);
		plus.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		dout.addActionListener(this);
		clear.addActionListener(this);
     }

     public void actionPerformed(ActionEvent e)
    {
		String buton = e.getActionCommand();
        char ch = buton.charAt(0);
	if(ch>='0' && ch<='9'|| ch=='.') 
	{ 
	    if (!op.equals("")) 
		num2 = num2 + buton; 
	    else
		num1 = num1 + buton;   
	    t.setText(num1+op+num2); 
	} 
	else if(ch=='C') 
	{ 
	    num1 = op = num2 = ""; 
	    t.setText(""); 
	}
	else if (ch =='=') 
	{ 
	    if(!num1.equals("") && !num2.equals(""))
	    {
		double temp;
		double n1=Double.parseDouble(num1);
		double n2=Double.parseDouble(num2);
		if(n2==0 && op.equals("/"))
		{
		    t.setText(num1+op+num2+" = Zero Division Error");
		    num1 = op = num2 = "";
		}
		else
		{
		    if (op.equals("+")) 
		        temp = n1 + n2; 
		    else if (op.equals("-")) 
		        temp = n1 - n2; 
		    else if (op.equals("/")) 
	  	        temp = n1/n2; 
		    else
		        temp = n1*n2; 
		    t.setText(num1+op+num2+" = "+temp); 
		    num1 = Double.toString(temp);
		    op = num2 = ""; 
	        }
            }
	    else
	    {
		num1 = op = num2 = ""; 
		t.setText("");
	    }
        } 
	else 
	{ 
	    if (op.equals("") || num2.equals("")) 
		op = buton; 
	    else 
	    { 
		double temp;
		double n1=Double.parseDouble(num1);
		double n2=Double.parseDouble(num2);
		if(n2==0 && op.equals("/"))
		{
		    t.setText(num1+op+num2+" = Zero Division Error");
		    num1 = op = num2 = "";
		}
		else
		{
		    if (op.equals("+")) 
		        temp = n1 + n2; 
		    else if (op.equals("-")) 
		        temp = n1 - n2; 
		    else if (op.equals("/")) 
	  	        temp = n1/n2; 
		    else
		        temp = n1*n2; 
		    num1 = Double.toString(temp); 
		    op = buton; 
		    num2 = ""; 
	        }
            }
	    t.setText(num1+op+num2);
	    }
    }
}