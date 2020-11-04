/*
    计算器界面
*/
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.JTextField;
 import javax.swing.JButton;
 import java.awt.GridLayout;
 import java.awt.FlowLayout;
 import  javax.swing.JComponent;

 class CalTest{

 }

 public class Cal extends JFrame{
     private JPanel mainPanel;
     private JPanel topPanel;
     private JPanel buttomPanel;
     private JTextField txtResult;
     private JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
     btnJia,btnJian,btnCheng,btnChu,btnDian,btnDeng;

     public Cal(){
         //GridLayout layout = new GridLayout(4,4);
         mainPanel = new JPanel(new FlowLayout());
         topPanel = new JPanel(new FlowLayout());
         buttomPanel = new JPanel(new GridLayout(4,4,2,2));
         //mainPanel.setLayout(layout);
         this.setContentPane(mainPanel);
         mainPanel.add(topPanel);
         mainPanel.add(buttomPanel);
         txtResult = new JTextField(15);
         topPanel.add(txtResult);
         //
         btn0 = new JButton("0");
         btn1 = new JButton("1");
         btn2 = new JButton("2");
         btn3 = new JButton("3");
         btn4 = new JButton("4");
         btn5 = new JButton("5");
         btn6 = new JButton("6");
         btn7 = new JButton("7");
         btn8 = new JButton("8");
         btn9 = new JButton("9");
         btnJia = new JButton("+");
         btnJian = new JButton("-");
         btnCheng = new JButton("×");
         btnChu = new JButton("÷");
         btnDian = new JButton(".");
         btnDeng = new JButton("=");

          //放在面板当中
         mainPanel.add(btn1);
         mainPanel.add(btn2);
         mainPanel.add(btn3);
         mainPanel.add(btnJia);

         mainPanel.add(btn4);
         mainPanel.add(btn5);
         mainPanel.add(btn6);
         mainPanel.add(btnJian);

         mainPanel.add(btn7);
         mainPanel.add(btn8);
         mainPanel.add(btn9);
         mainPanel.add(btnCheng);

         mainPanel.add(btn0);
         mainPanel.add(btnChu);
         mainPanel.add(btnDian);
         mainPanel.add(btnDeng);

         //设置窗口的大小
         this.setBounds(200,200,300,300);
         this.setVisible(true);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);


     }

     public static void main(String[] args){
         new Cal();
     }
 }

 class MyButton extends JButton{
     public MyButton(String str){
         super(str);
         //setFont(new Font("微软雅黑",Font.BOLD,20));
     }
 }