import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
import javax.swing.JComboBox;

public class NoteEdit extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JMenuBar menuBar;
    private JMenu menuFile,menuEdit,menuHelp;
    private JMenuItem newItem,openItem,saveItem,exitItem,copyItem,cutItem,pasteItem,fontItem,colorItem,aboutItem;  
    private JToolBar toolBar;
    private JButton btnNew,btnOpen,btnSave,btnCut,btnCopy,btnPaste,btnFont,btnColor;
    private JTextArea txtArea;
    private JScrollPane scrollPane;
    private String fileName = "新文件";
    private static int count = 0;

    public NoteEdit(){
        //实例化控件
        this.mainPanel = new JPanel(new BorderLayout());//采用边界布局
        this.menuBar = new JMenuBar();
        this.menuFile = new JMenu("文件");
        this.menuEdit = new JMenu("编辑");
        this.menuHelp = new JMenu("帮助");
        this.newItem = new JMenuItem("新建");
        this.openItem = new JMenuItem("打开");
        this.saveItem = new JMenuItem("保存");
        this.exitItem = new JMenuItem("退出");
        this.cutItem = new JMenuItem("剪切");
        this.copyItem = new JMenuItem("复制");
        this.pasteItem = new JMenuItem("粘贴");
        this.fontItem = new JMenuItem("字体");
        this.colorItem = new JMenuItem("颜色");
        this.aboutItem = new JMenuItem("关于");
        this.toolBar = new JToolBar();
        this.btnColor = new JButton("颜色");
        this.btnCopy = new JButton("复制");
        this.btnCut = new JButton("剪切");
        this.btnFont = new JButton("字体");
        this.btnNew = new JButton("新建");

        // ImageIcon openIcon = new ImageIcon(NoteEdit.class.getClassLoader().getResource("images\\04.gif"));//用照片来做按钮
        // this.btnNew = new JButton(openIcon);
        this.btnOpen = new JButton("打开");
        this.btnPaste = new JButton("粘贴");
        this.btnSave = new JButton("保存");
        this.txtArea = new JTextArea();
        this.scrollPane = new JScrollPane(txtArea);
        //将控件放入容器
        setContentPane(mainPanel);
        menuFile.add(newItem);
        menuFile.add(openItem);
        menuFile.addSeparator();
        menuFile.add(saveItem);
        menuFile.addSeparator();
        menuFile.add(exitItem);
        menuFile.add(cutItem);
        menuEdit.add(cutItem);
        menuEdit.add(copyItem);
        menuEdit.add(pasteItem);
        menuEdit.addSeparator();
        menuEdit.add(fontItem);
        menuEdit.add(colorItem);
        menuHelp.add(aboutItem);
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuHelp);
        setJMenuBar(menuBar);
        toolBar.add(btnNew);
        toolBar.add(btnOpen);
        toolBar.add(btnSave);
        toolBar.addSeparator();
        toolBar.add(btnCut);
        toolBar.add(btnCopy);
        toolBar.add(btnPaste);
        toolBar.addSeparator();
        toolBar.add(btnFont);
        toolBar.add(btnColor);
        mainPanel.add(toolBar,"North");
        mainPanel.add(scrollPane,"Center");

        //监听
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        fontItem.addActionListener(this);
        colorItem.addActionListener(this);
        aboutItem.addActionListener(this);
        btnNew.addActionListener(this);
        btnOpen.addActionListener(this);
        btnSave.addActionListener(this);
        btnCut.addActionListener(this);
        btnCopy.addActionListener(this);
        btnPaste.addActionListener(this);
        btnFont.addActionListener(this);
        btnColor.addActionListener(this);

        //设置窗口属性
        setTitle(fileName);
        setVisible(true);
        setBounds(100,100,500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(exitItem)){
            System.exit(0);
        }

        if(e.getSource().equals(newItem) || e.getSource().equals(btnNew)){
            txtArea.setText("");
            NoteEdit.count++;
            setTitle(fileName + NoteEdit.count);
        }

        if(e.getSource().equals(openItem) || e.getSource().equals(btnOpen)){
            try {
				open();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
        }

        if(e.getSource().equals(saveItem) || e.getSource().equals(btnSave)){
            try {
				save();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
        }

        //剪切
        if(e.getSource().equals(cutItem) || e.getSource().equals(btnCut)){
            txtArea.cut();
        }

        //复制
        if(e.getSource().equals(copyItem) || e.getSource().equals(btnCopy)){
            txtArea.copy();
        }

        //粘贴
        if(e.getSource().equals(pasteItem) || e.getSource().equals(btnPaste)){
            txtArea.paste();
        }

        //设置颜色
        if(e.getSource().equals(colorItem) || e.getSource().equals(btnColor)){
            txtArea.setForeground(getColor());
        }

        //设置字体
        if(e.getSource().equals(fontItem) || e.getSource().equals(btnFont)){
            txtArea.setFont(getMyFont());
        }
    }
    
    private Font getMyFont(){
        MyFont myFont = new MyFont(this);
        myFont.setVisible(true);
        return null;
    }

    private Color getColor(){
        JColorChooser cc = new JColorChooser();
        Color c = cc.showDialog(this, "颜色设置", Color.black);
        return c;
    }

    //用来打开文件的函数
    private void open() throws IOException{
        JFileChooser fc = new JFileChooser("E:\\");
        int n = fc.showOpenDialog(this);

        // System.out.println(n);//0表示打开了文件，1表示没有打开文件
        
        if(n == 0){
            setTitle(fc.getSelectedFile().getName());
            File file = fc.getSelectedFile();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            int n1 = 0;
            char[] cs = new char[1024];

            while((n1 = br.read(cs)) != -1){
                sb.append(new String(cs,0,n1));
            }

            txtArea.setText(sb.toString());
            br.close();
            fr.close();
        }
    }


    //用来保存文件的函数
    private void save() throws IOException{
        JFileChooser fc = new JFileChooser();
        if(fc.showSaveDialog(this) == 0){
            File file = fc.getSelectedFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            String str=txtArea.getText();
			str.replaceAll("\12", "\12\13");
            bw.write(str);
            
            bw.close();
            fw.close();
        }
    }
}

class MyFont extends JDialog implements ActionListener{
    private JPanel mainPanel;
    private JLabel lblZt,lblZx,lblDx;
    private JComboBox<String> listZt,listZx,listDx;
    private JButton btnOk,btnCancel;
    private Font font;

    public MyFont(JFrame frame){
        super(frame,"设置字体",true);
        mainPanel = new JPanel(null);
        lblZt = new JLabel("字体：");
        lblZx = new JLabel("字形：");
        lblDx = new JLabel("大小：");
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = e.getAvailableFontFamilyNames();
        listZt = new JComboBox<String>(fontNames);
        String[] zx = {"常规","倾斜","加粗"};
        listZx = new JComboBox<String>(zx);
        String[] dx = {"6","7","8","10","14","20","30"};
        listDx = new JComboBox<String>(dx);
        btnOk = new JButton("确定");
        btnCancel = new JButton("取消");
        

        listZx.setMaximumRowCount(10);
        //设置大小和位置
        lblZt.setBounds(20,20,80,25);
        lblZx.setBounds(140,20,80,25);
        lblDx.setBounds(260,20,80,25);
        listZt.setBounds(20,50,80,25);
        listZx.setBounds(140,50,80,25);
        listDx.setBounds(260,50,80,25);
        btnOk.setBounds(190,170,60,25);
        btnCancel.setBounds(300,170,60,25);

        //把控件放入容器中
        setContentPane(mainPanel);
        mainPanel.add(lblDx);
        mainPanel.add(lblZt);
        mainPanel.add(lblZx);
        mainPanel.add(listZt);
        mainPanel.add(listZx);
        mainPanel.add(listDx);
        mainPanel.add(btnOk);
        mainPanel.add(btnCancel);

        btnOk.addActionListener(this);
        btnCancel.addActionListener(this);
        //设置窗口
        setBounds(100,100,380,250);
        //setVisible(true);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnCancel)){
            this.setVisible((false));
        }
        if(e.getSource().equals(btnOk)){
            String fontName = listZt.getSelectedItem().toString();
            int n = 0;
            if(listZx.getSelectedItem().toString().equals("常规")){
                n = Font.PLAIN;
            }
            if(listZx.getSelectedItem().toString().equals("加粗")){
                n = Font.BOLD;
            }
            if(listZx.getSelectedItem().toString().equals("倾斜")){
                n = Font.ITALIC;
            }
            
            int zh = Integer.valueOf(listDx.getSelectedItem().toString());
            font = new Font(fontName,n,zh);

            this.setVisible(false);
        }
    }

    public Font getMyFont(){
        return font;
    }
}