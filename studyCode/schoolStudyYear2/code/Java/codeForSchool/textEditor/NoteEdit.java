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
        //设置窗口属性
        setVisible(true);
        setBounds(100,100,500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
