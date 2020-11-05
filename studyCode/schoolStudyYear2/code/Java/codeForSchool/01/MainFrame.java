import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame implements ActionListener{
    private JDesktopPane desk;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newItem;
    public MainFrame(){
        desk = new JDesktopPane();
        menuBar = new JMenuBar();
        fileMenu = new JMenu("文件");
        newItem = new JMenuItem("新建");
        //
        setContentPane(desk);
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        fileMenu.add(newItem);
        //
        newItem.addActionListener(this);
        //
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