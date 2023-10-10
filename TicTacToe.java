//Tic Tac Toe Game in Loki
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="TicTacToe.class"  width=5000 height=5000></applet>
public class TicTacToe extends Applet implements ActionListener{
    Button buttons[]=new Button[9];
    int Playercount=0,o;
    String Player1="X",Player2="O",Player="X",c0,c1,c2,c3,c4,c5,c6,c7,c8;
    Label Label1;
    public void init(){
        setLayout(null);
        Label1=new Label("1.Player X     2.Player O");
        Label1.setBounds(50,20,5000,100);
        Font myFont = new Font("Serif",Font.BOLD,40);
        Label1.setFont();
    
        add(Label1);
        for(int i=0;i<9;i++){
        buttons[i] = new Button(String.valueOf(i));
        buttons[i].setBounds(550+((i%3)*100),150+((i/3)*100),100,100);
        this.add(buttons[i]);
        buttons[i].addActionListener(this);
        }
    }
    public void actionPerformed(ActionEvent e){
        String in=e.getActionCommand();
        char inn=in.charAt(0);
        switch(inn){
            case '0':
            remove(buttons[0]);
        buttons[0]=new Button(Player);
        c0=Player;
        buttons[0].setBounds(550,150,100,100);
        this.add(buttons[0]);
        break;
        case '1':
        remove(buttons[1]);
        buttons[1]=new Button(Player);
        c1=Player;
        buttons[1].setBounds(650,150,100,100);
        this.add(buttons[1]);
        break;
         case '2':
        remove(buttons[2]);
        buttons[2]=new Button(Player);
        c2=Player;
        buttons[2].setBounds(750,150,100,100);
        this.add(buttons[2]);
        break;
         case '3':
        remove(buttons[3]);
        buttons[3]=new Button(Player);
        c3=Player;
        buttons[3].setBounds(550,250,100,100);
        this.add(buttons[3]);
        break;
         case '4':
        remove(buttons[4]);
        buttons[4]=new Button(Player);
        c4=Player;
        buttons[4].setBounds(650,250,100,100);
        this.add(buttons[4]);
        break;
         case '5':
        remove(buttons[5]);
        buttons[5]=new Button(Player);
        c5=Player;
        buttons[5].setBounds(750,250,100,100);
        this.add(buttons[5]);
        break;
         case '6':
        remove(buttons[6]);
        buttons[6]=new Button(Player);
        c6=Player;
        buttons[6].setBounds(550,350,100,100);
        this.add(buttons[6]);
        break;
         case '7':
        remove(buttons[7]);
        buttons[7]=new Button(Player);
        c7=Player;
        buttons[7].setBounds(650,350,100,100);
        this.add(buttons[7]);
        break;
        default:
        remove(buttons[8]);
        buttons[8]=new Button(Player);
        c8=Player;
        buttons[8].setBounds(750,350,100,100);
        this.add(buttons[8]);
        break;
    }
        Playercount++;
        if(Playercount%2==0)
        Player=Player1;
        else
        Player=Player2;
        if((c0=="X"&&c1=="X"&&c2=="X")||(c3=="X"&&c4=="X"&&c5=="X")||(c6=="X"&&c7=="X"&&c8=="X")||(c0=="X"&&c3=="X"&&c6=="X")||(c1=="X"&&c4=="X"&&c7=="X")||(c2=="X"&&c5=="X"&&c8=="X")||(c0=="X"&&c4=="X"&&c8=="X")||(c2=="X"&&c4=="X"&&c6=="X")){
            for(o=0;o<9;o++)
            remove(buttons[o]);
             remove(Label1);
             Label l3=new Label("X Player WIN");
            l3.setBounds(300,100,2000,1000);
            add(l3);
            Font myFont = new Font("Serif",Font.BOLD,99);
            l3.setFont(myFont);
        }
        else if((c0=="O"&&c1=="O"&&c2=="O")||(c3=="O"&&c4=="O"&&c5=="O")||(c6=="O"&&c7=="O"&&c8=="O")||(c0=="O"&&c3=="O"&&c6=="O")||(c1=="O"&&c4=="O"&&c7=="O")||(c2=="O"&&c5=="O"&&c8=="O")||(c0=="O"&&c4=="O"&&c8=="O")||(c2=="O"&&c4=="O"&&c6=="O")){
            for(o=0;o<9;o++)
            remove(buttons[o]);
            remove(Label1);
            Label l3=new Label("O Player WIN");
            l3.setBounds(500,100,1000,200);
            add(l3);
            Font myFont = new Font("Serif",Font.BOLD,99);
            l3.setFont(myFont);
        }
        if(Playercount==9){
            for(o=0;o<9;o++)
            remove(buttons[o]);
             remove(Label1);
            Label l3=new Label("Draw the match");
            l3.setBounds(300,200,3000,500);
            add(l3);
            Font myFont = new Font("Serif",Font.BOLD,99);
            l3.setFont(myFont);
         }
      }
} 
