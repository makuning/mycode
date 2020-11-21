package D;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableDemo extends JFrame {
    private JPanel mainPanel;
    private JScrollPane scrollPane;
    private JTable table;
    private DefaultTableModel model;
    public TableDemo(){
        mainPanel=new JPanel(new BorderLayout());
        String[] heads={"学号","姓名","性别","出生日期","家庭住址","联系方式"};
        model=new DefaultTableModel(heads,10);
        table=new JTable(model);
        scrollPane=new JScrollPane(table);
        //
        setContentPane(mainPanel);
        mainPanel.add(scrollPane,"Center");

        fillData();
        //
        setBounds(100,100,500,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void fillData() {
        for(int i =1;i<50;i++){
            model.addRow(new String[]{"0"+i,"张三"+i,"男","2000-1-1","四川成都","110"});
        }
    }

    public static void main(String[] args){
        new TableDemo();
    }
}
