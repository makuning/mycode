package D;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;
import java.awt.*;

public class ChildFrame extends JInternalFrame {
    public ChildFrame(){
        super("子窗口",false,true,false,true);
        setBounds(100,100,100,100);
        setVisible(true);
    }
}
