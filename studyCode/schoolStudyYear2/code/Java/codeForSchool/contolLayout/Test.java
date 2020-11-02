import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test implements ActionListener {
    Frame f = new Frame();
    public static void main(String[] args) {
        Test t = new Test();
        t.init();
    }

    private void init() {
        Button b = new Button("exit");
        b.addActionListener(this);
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(100,100);
        f.setVisible(true); 
    }

    public void actionPerformed(ActionEvent arg0) {
        f.setVisible(false);
        f.dispose();
        System.exit(0);
    }
}