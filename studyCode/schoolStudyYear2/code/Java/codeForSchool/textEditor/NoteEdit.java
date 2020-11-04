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
    private String fileName = "���ļ�";
    private static int count = 0;

    public NoteEdit(){
        //ʵ�����ؼ�
        this.mainPanel = new JPanel(new BorderLayout());//���ñ߽粼��
        this.menuBar = new JMenuBar();
        this.menuFile = new JMenu("�ļ�");
        this.menuEdit = new JMenu("�༭");
        this.menuHelp = new JMenu("����");
        this.newItem = new JMenuItem("�½�");
        this.openItem = new JMenuItem("��");
        this.saveItem = new JMenuItem("����");
        this.exitItem = new JMenuItem("�˳�");
        this.cutItem = new JMenuItem("����");
        this.copyItem = new JMenuItem("����");
        this.pasteItem = new JMenuItem("ճ��");
        this.fontItem = new JMenuItem("����");
        this.colorItem = new JMenuItem("��ɫ");
        this.aboutItem = new JMenuItem("����");
        this.toolBar = new JToolBar();
        this.btnColor = new JButton("��ɫ");
        this.btnCopy = new JButton("����");
        this.btnCut = new JButton("����");
        this.btnFont = new JButton("����");
        this.btnNew = new JButton("�½�");

        // ImageIcon openIcon = new ImageIcon(NoteEdit.class.getClassLoader().getResource("images\\04.gif"));//����Ƭ������ť
        // this.btnNew = new JButton(openIcon);
        this.btnOpen = new JButton("��");
        this.btnPaste = new JButton("ճ��");
        this.btnSave = new JButton("����");
        this.txtArea = new JTextArea();
        this.scrollPane = new JScrollPane(txtArea);
        //���ؼ���������
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

        //����
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

        //���ô�������
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

        //����
        if(e.getSource().equals(cutItem) || e.getSource().equals(btnCut)){
            txtArea.cut();
        }

        //����
        if(e.getSource().equals(copyItem) || e.getSource().equals(btnCopy)){
            txtArea.copy();
        }

        //ճ��
        if(e.getSource().equals(pasteItem) || e.getSource().equals(btnPaste)){
            txtArea.paste();
        }

        //������ɫ
        if(e.getSource().equals(colorItem) || e.getSource().equals(btnColor)){
            txtArea.setForeground(getColor());
        }

        //��������
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
        Color c = cc.showDialog(this, "��ɫ����", Color.black);
        return c;
    }

    //�������ļ��ĺ���
    private void open() throws IOException{
        JFileChooser fc = new JFileChooser("E:\\");
        int n = fc.showOpenDialog(this);

        // System.out.println(n);//0��ʾ�����ļ���1��ʾû�д��ļ�
        
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


    //���������ļ��ĺ���
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
        super(frame,"��������",true);
        mainPanel = new JPanel(null);
        lblZt = new JLabel("���壺");
        lblZx = new JLabel("���Σ�");
        lblDx = new JLabel("��С��");
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = e.getAvailableFontFamilyNames();
        listZt = new JComboBox<String>(fontNames);
        String[] zx = {"����","��б","�Ӵ�"};
        listZx = new JComboBox<String>(zx);
        String[] dx = {"6","7","8","10","14","20","30"};
        listDx = new JComboBox<String>(dx);
        btnOk = new JButton("ȷ��");
        btnCancel = new JButton("ȡ��");
        

        listZx.setMaximumRowCount(10);
        //���ô�С��λ��
        lblZt.setBounds(20,20,80,25);
        lblZx.setBounds(140,20,80,25);
        lblDx.setBounds(260,20,80,25);
        listZt.setBounds(20,50,80,25);
        listZx.setBounds(140,50,80,25);
        listDx.setBounds(260,50,80,25);
        btnOk.setBounds(190,170,60,25);
        btnCancel.setBounds(300,170,60,25);

        //�ѿؼ�����������
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
        //���ô���
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
            if(listZx.getSelectedItem().toString().equals("����")){
                n = Font.PLAIN;
            }
            if(listZx.getSelectedItem().toString().equals("�Ӵ�")){
                n = Font.BOLD;
            }
            if(listZx.getSelectedItem().toString().equals("��б")){
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