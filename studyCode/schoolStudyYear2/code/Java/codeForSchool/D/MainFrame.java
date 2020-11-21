package D;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame implements ActionListener{
    private JDesktopPane desk;                                        //多文本
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newItem;
    public MainFrame(){
        desk=new JDesktopPane();
        menuBar=new JMenuBar();
        fileMenu=new JMenu("文件");
        newItem=new JMenuItem("新建");
        //将控件放入容器
        setContentPane(desk);
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        fileMenu.add(newItem);
        //监听
        newItem.addActionListener(this);
        //设置窗口属性
        setBounds(200,200,500,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MainFrame();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        desk.add(new ChildFrame());
    }
}