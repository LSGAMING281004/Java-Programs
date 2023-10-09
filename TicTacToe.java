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
    String c0,c1,c2,c3,c4,c5,c6,c7,c8;
    Label l1;
    public void init()
    {
        setLayout(null);
         l1=new Label("Start the player.1  X.  ___________________________  Second move in player.2  O.");
            l1.setBounds(50,20,5000,100);
            add(l1);
            Font myFont = new Font("Serif",Font.BOLD,40);
            l1.setFont(myFont);

        for(int i=0;i<9;i++){
        buttons[i] = new Button(String.valueOf(i));
        buttons[i].setBounds(550+((i%3)*100),150+((i/3)*100),100,100);
        this.add(buttons[i]);
        buttons[i].addActionListener(this);
        }

    }
    public void actionPerformed(ActionEvent e) {
        String in=e.getActionCommand();
        char inn=in.charAt(0);
        switch(inn)
        {
            case '0':
            remove(buttons[0]);
        buttons[0]=new Button(p);
        c0=p;
        buttons[0].setBounds(550,150,100,100);
        this.add(buttons[0]);
        break;
        case '1':
        remove(buttons[1]);
        buttons[1]=new Button(p);
        c1=p;
        buttons[1].setBounds(650,150,100,100);
        this.add(buttons[1]);
        break;
         case '2':
        remove(buttons[2]);
        buttons[2]=new Button(p);
        c2=p;
        buttons[2].setBounds(750,150,100,100);
        this.add(buttons[2]);
        break;
         case '3':
        remove(buttons[3]);
        buttons[3]=new Button(p);
        c3=p;
        buttons[3].setBounds(550,250,100,100);
        this.add(buttons[3]);
        break;
         case '4':
        remove(buttons[4]);
        buttons[4]=new Button(p);
        c4=p;
        buttons[4].setBounds(650,250,100,100);
        this.add(buttons[4]);
        break;
         case '5':
        remove(buttons[5]);
        buttons[5]=new Button(p);
        c5=p;
        buttons[5].setBounds(750,250,100,100);
        this.add(buttons[5]);
        break;
         case '6':
        remove(buttons[6]);
        buttons[6]=new Button(p);
        c6=p;
        buttons[6].setBounds(550,350,100,100);
        this.add(buttons[6]);
        break;
         case '7':
        remove(buttons[7]);
        buttons[7]=new Button(p);
        c7=p;
        buttons[7].setBounds(650,350,100,100);
        this.add(buttons[7]);
        break;
        default:
        remove(buttons[8]);
        buttons[8]=new Button(p);
        c8=p;
        buttons[8].setBounds(750,350,100,100);
        this.add(buttons[8]);
        break;
    }
        rol++;
        if(rol%2==0){
        p=x;
        }
        else{
        p=o;
        }
        if((c0=="X"&&c1=="X"&&c2=="X")||(c3=="X"&&c4=="X"&&c5=="X")||(c6=="X"&&c7=="X"&&c8=="X")||(c0=="X"&&c3=="X"&&c6=="X")||(c1=="X"&&c4=="X"&&c7=="X")||(c2=="X"&&c5=="X"&&c8=="X")||(c0=="X"&&c4=="X"&&c8=="X")||(c2=="X"&&c4=="X"&&c6=="X")){
            for(int o=0;o<9;o++)
            remove(buttons[o]);
             remove(l1);
             Label l3=new Label("Player 1 _X_ is WIN");
            l3.setBounds(300,100,2000,1000);
            add(l3);
            Font myFont = new Font("Serif",Font.BOLD,99);
            l3.setFont(myFont);

        }
        else if((c0=="O"&&c1=="O"&&c2=="O")||(c3=="O"&&c4=="O"&&c5=="O")||(c6=="O"&&c7=="O"&&c8=="O")||(c0=="O"&&c3=="O"&&c6=="O")||(c1=="O"&&c4=="O"&&c7=="O")||(c2=="O"&&c5=="O"&&c8=="O")||(c0=="O"&&c4=="O"&&c8=="O")||(c2=="O"&&c4=="O"&&c6=="O")){
            for(int o=0;o<9;o++)
            remove(buttons[o]);
            remove(l1);
            Label l3=new Label("Player 2 _O_ is WIN");
            l3.setBounds(500,100,1000,200);
            add(l3);
            Font myFont = new Font("Serif",Font.BOLD,99);
            l3.setFont(myFont);
        }
        if(rol==9){
            for(int o=0;o<9;o++)
            remove(buttons[o]);
             remove(l1);
            Label l3=new Label("Draw the match      GAME_OVER");
            l3.setBounds(300,200,3000,500);
            add(l3);
            Font myFont = new Font("Serif",Font.BOLD,99);
            l3.setFont(myFont);
         }
      }
} 
