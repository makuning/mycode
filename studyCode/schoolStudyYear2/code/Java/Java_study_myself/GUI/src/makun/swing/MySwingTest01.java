package makun.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MySwingTest01 {
    public static void main(String[] args) {
        int frameHeight = 500;
        int frameWidth = 800;

        // 先添加一个主框架
        JFrame myFrame = new JFrame("我的第一个Java_GUI框架");
        // 设置它的关闭操作，不设置这个，点击关闭窗口，程序还会执行
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建几个面板
        JPanel myPanel = new JPanel();
        JPanel myPanel2 = new JPanel();

        // 用下面自定义的方法设置面板
        MySwingTest01.setPanel(myPanel);

        // 将面板添加到框架中
        myFrame.add(myPanel);

        // 设置框架的大小
        myFrame.setSize(frameWidth,frameHeight);
        // 设置界面可见
        myFrame.setVisible(true);
    }

    // 定义一个方法来设置面板
    public static void setPanel(JPanel jPanel) {
        // 设置一个用来参照的宽度和高度
        int jPanelHeight = 20;
        int jPanelWidth = 200;

        // 设置布局为null，这样好像就没有自动布局了
        jPanel.setLayout(null);
        // 创建一个标签
        JLabel jLabel = new JLabel("用户：");
        // 设置这个标签的位置和大小
        jLabel.setBounds(250,150,jPanelWidth,jPanelHeight);
        // 将标签添加到面板当中
        jPanel.add(jLabel);

        // 创建一个文本域，单行文本框（多行文本框是JTextArea）
        JTextField jTextField = new JTextField("请输入用户名...");
        jTextField.setBounds(280,150,jPanelWidth,jPanelHeight);
        jPanel.add(jTextField);

        // 创建第二个标签和密码文本域
        JLabel jLabel1 = new JLabel("密码：");
        jLabel1.setBounds(250,170,jPanelWidth,jPanelHeight);
        jPanel.add(jLabel1);
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(280,170,jPanelWidth,jPanelHeight);
        jPanel.add(jPasswordField);

        // 创建登录按钮
        JButton jButton = new JButton("登录");
        jButton.setBounds(250,190,jPanelWidth / 2,jPanelHeight);
        jPanel.add(jButton);

        // 创建退出按钮
        JButton jButton1 = new JButton("退出");
        jButton1.setBounds(380,190,jPanelWidth / 2,jPanelHeight);
        jPanel.add(jButton1);
    }
}
