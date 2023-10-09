//Tic Tac Toe Game in Loki
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="TicTacToe.class"  width=5000 height=5000>
 * </applet>
 */
public class TicTacToe extends Applet implements ActionListener
{
    Button buttons[]=new Button[9];
    int rol=0;
    String x="X",o="O",p="X";
    boolean bool,bc[]=new boolean[9];
    String win,draw;
    public void init()
    {
        setLayout(null);
        for(int i=0;i<9;i++){
        buttons[i] = new Button(String.valueOf(i));
        buttons[i].setBounds(550+((i%3)*100),150+((i/3)*100),100,100);
        this.add(buttons[i]);
        buttons[i].addActionListener(this);
        }

    }
    public void actionPerformed(ActionEvent e)
    {
        String in=e.getActionCommand();
        char inn=in.charAt(0);
        switch(inn)
        {
            case '0':
            remove(buttons[0]);
        buttons[0]=new Button(p);
        bc[0]=bool;
        buttons[0].setBounds(550,150,100,100);
        this.add(buttons[0]);
        break;
        case '1':
        remove(buttons[1]);
        buttons[1]=new Button(p);
        bc[1]=bool;
        buttons[1].setBounds(650,150,100,100);
        this.add(buttons[1]);
        break;
         case '2':
        remove(buttons[2]);
        buttons[2]=new Button(p);
        bc[2]=bool;
        buttons[2].setBounds(750,150,100,100);
        this.add(buttons[2]);
        break;
         case '3':
        remove(buttons[3]);
        buttons[3]=new Button(p);
        bc[3]=bool;
        buttons[3].setBounds(550,250,100,100);
        this.add(buttons[3]);
        break;
         case '4':
        remove(buttons[4]);
        buttons[4]=new Button(p);
        bc[4]=bool;
        buttons[4].setBounds(650,250,100,100);
        this.add(buttons[4]);
        break;
         case '5':
        remove(buttons[5]);
        buttons[5]=new Button(p);
        bc[5]=bool;
        buttons[5].setBounds(750,250,100,100);
        this.add(buttons[5]);
        break;
         case '6':
        remove(buttons[6]);
        buttons[6]=new Button(p);
        bc[6]=bool;
        buttons[6].setBounds(550,350,100,100);
        this.add(buttons[6]);
        break;
         case '7':
        remove(buttons[7]);
        buttons[7]=new Button(p);
        bc[7]=bool;
        buttons[7].setBounds(650,350,100,100);
        this.add(buttons[7]);
        break;
        default:
        remove(buttons[8]);
        buttons[8]=new Button(p);
        bc[8]=bool;
        buttons[8].setBounds(750,350,100,100);
        this.add(buttons[8]);
        break;

        }

        rol++;
        if(rol%2==0){
        p=x;
        bool=false;
        }
        else{
        p=o;
        bool=true;
        }
        if((bc[0]&&bc[1]&&bc[2])||(bc[3]&&bc[4]&&bc[5])||(bc[6]&&bc[7]&&bc[8])||(bc[0]&&bc[3]&&bc[6])||(bc[1]&&bc[4]&&bc[7])||(bc[2]&&bc[5]&&bc[8])||(bc[1]&&bc[4]&&bc[8])||(bc[2]&&bc[4]&&bc[6])){
            for(int o=0;o<9;o++)
            remove(buttons[o]);
            Button end=new Button("O Win");
            end.setBounds(500,300,400,400);
            add(end);
        }
        else if((bc[0]&bc[1]&bc[2]==false)||(bc[3]&bc[4]&bc[5]==false)||(bc[6]&bc[7]&bc[8]==false)||(bc[0]&bc[3]&bc[6]==false)||(bc[1]&bc[4]&bc[7]==false)||(bc[2]&bc[5]&bc[8]==false)||(bc[1]&bc[4]&bc[8]==false)||(bc[2]&bc[4]&bc[6]==false)){
            for(int o=0;o<9;o++)
            remove(buttons[o]);
            Button end1=new Button("X Win");
            end1.setBounds(500,300,400,400);
            add(end1);

        }
      

       
        
    
    }
} 