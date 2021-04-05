
import javax.swing.*; //cung cap phuong thuc giao dien do hoa
import java.awt.*;
import java.awt.event.*;

//JFrame de tao khung 
//JButton tao mot nut co the click
//JLable hien thi hinh anh hoac text
//JPanel tạo ra một noi chứa các phần tử
//JFrame thêm thành phần vao container
public class CaRo extends JFrame implements ActionListener{
    Color background_cl=Color.black;
    Color x_cl=Color.red;
    Color y_cl=Color.blue;
    int column=20, row=30,count=0;
    int xUndo[] = new int[column*row];
    int yUndo[] = new int[column*row];
    boolean tick[][] = new boolean[column+2][row +2];
    int Size = 0;
    Container cn;
    JPanel pn,pn2;
    JLabel lb;
    JButton newGame_bt,undo_bt,exit_bt;
    private JButton b[][] = new JButton[column+2][row + 2];
    public CaRo(String s) {
        super(s);
        cn=this.getContentPane();
        pn = new JPanel();
        pn.setLayout(new GridLayout(column,row)); //thiet lap bo cuc cho man hinh
        for(int i=0;i<=column+1;i++){
            for(int j=0;j<=row+1;j++){
                b[i][j]= new JButton(" ");
                b[i][j].setActionCommand(i+" "+j);
                b[i][j].setBackground(background_cl);
                b[i][j].addActionListener(this);
                tick[i][j]=true;

            }
        }
            for(int i=1;i<=column;i++)
                for(int j=1;j<=row;j++)
                    pn.add(b[i][j]); // them mot thanh phan vao thanh phan khac
                
            lb= new JLabel("X Đánh Trước");
            newGame_bt=new JButton("New Game");
            undo_bt=new JButton("Undo");
            exit_bt=new JButton("Exit");
            newGame_bt.addActionListener(this);
            undo_bt.addActionListener(this);
            exit_bt.addActionListener(this);
            exit_bt.setForeground(x_cl);
            cn.add(pn);
            pn2=new JPanel();
            pn2.setLayout(new FlowLayout());
            pn2.add(lb);
            pn2.add(newGame_bt);
            pn2.add(undo_bt);
            pn2.add(exit_bt);
            cn.add(pn2,"North");
            this.setVisible(true); // thiet lap kha nag hien thi an(false) hoac hien(true) 
            this.setSize(1400,1000);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            undo_bt.setEnabled(false);
        
        }
        public boolean checkWin(int i ,int j) {
            int d=0;
            int k=i;
            int h;
            //kiem tra hang
            while(b[k][j].getText()==b[i][j].getText()){
                d++;
                k++;
            }
            k=i-1;
            while(b[k][j].getText()==b[i][j].getText()){
                d++;
                k--;
            }
            if(d>4) return true;
            d=0;h=j;
            //kiem tra cot
            while(b[i][h].getText()==b[i][j].getText()){
                d++;
                h++;
            }
            h=j-1;
            while(b[i][h].getText()==b[i][j].getText()){
                d++;
                h--;
            }
            if(d>4) return true;
            //kiem tra duong cheo 1
            h=i; k=j;d=0;
            while(b[i][j].getText()==b[h][k].getText()){
                d++;
                h++;
                k++;
            }
            h=i-1;k=j-1;
            while(b[i][j].getText()==b[h][k].getText()){
                d++;
                h--;
                k--;
            }
            if(d>4) return true;
            //kiem tra duong cheo 2
            h=i;k=j;d=0;
            while(b[i][j].getText()==b[h][k].getText()){
                d++;
                h++;
                k--;
            }
            h=i-1;k=j+1;
            while(b[i][j].getText()==b[h][k].getText()){
                d++;
                h--;
                k++;
            }
            if(d>4) return true;
            //nếu không đường chéo nào thõa mãn thì trả về false.
            return false;



        }
        public void undo(){
            if(Size>0){
                b[xUndo[Size-1]][yUndo[Size-1]].setText(" ");
                b[xUndo[Size-1]][yUndo[Size-1]].setActionCommand(xUndo[Size-1]+" "+yUndo[Size-1]);
                b[xUndo[Size-1]][yUndo[Size-1]].setBackground(background_cl);
                tick[xUndo[Size-1]][yUndo[Size-1]]=true;
                count--;
                if(count%2==0) lb.setText("Lượt của X");
                        else lb.setText("Lượt của O");
                Size--;
                if(Size==0) undo_bt.setEnabled(false);

                
            }

        }
        public void addPoint(int i, int j){
            if(Size>0){
                b[xUndo[Size-1]][yUndo[Size-1]].setBackground(background_cl);
            }
            xUndo[Size]=i;
            yUndo[Size]=j;
            Size++;
            if(count%2==0){
                b[i][j].setText("X");
                b[i][j].setForeground(x_cl);
                lb.setText("Lượt của O");
            }
            else{
                b[i][j].setText("O");
                b[i][j].setForeground(y_cl);
                lb.setText("Lượt của X");
            }
            tick[i][j]=false;
            count=1-count;
            b[i][j].setBackground(Color.GRAY);
            undo_bt.setEnabled(true);
        }
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand()=="New Game"){
                new CaRo("FIRE - GAME CARO");
                this.dispose();
            }
            else
            if(e.getActionCommand()=="Undo"){
                undo();
            }
            else 
            if(e.getActionCommand()=="Exit"){
                System.exit(0);
            }
            else{
                String s = e.getActionCommand();
                int k = s.indexOf(32);
                int i = Integer.parseInt(s.substring(0,k));
                int j = Integer.parseInt(s.substring(k+1,s.length()));
                if(tick[i][j]){
                    addPoint(i,j);
                }
                if(checkWin(i,j)){
                    lb.setBackground(Color.MAGENTA);
                    lb.setText(b[i][j].getText()+"WIN");
                    for(i=1;i<=column;i++)
                            for(j=1;j<=row;j++)
                                b[i][j].setEnabled(false);
                    undo_bt.setEnabled(false);
                    newGame_bt.setBackground(Color.YELLOW);
                }
            }
        }
        public static void main(String[] args) {
            new CaRo("FIRE - GAME CARO");
        }


    }
