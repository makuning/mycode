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
import java.awt.BorderLayout;

public class NoteEdit extends JFrame{
    private JPanel mainPanel;
    private JMenuBar menuBar;
    private JMenu menuFile,menuEdit,menuHelp;
    private JMenuItem newItem,openItem,saveItem,exitItem,copyItem,cutItem,pasteItem,fontItem,colorItem,aboutItem;  
    private JToolBar toolBar;
    private JButton btnNew,btnOpen,btnSave,btnCut,btnCopy,btnPaste,btnFont,btnColor;
    private JTextArea txtArea;
    private JScrollPane scrollPane;

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
        //���ô�������
        setVisible(true);
        setBounds(100,100,500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
