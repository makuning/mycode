package com.scitc;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class MyFont extends JDialog implements ActionListener{
	private JPanel mainPanel;
	private JLabel lblZt,lblZx,lblDx;
	private JComboBox<String> listZt,listZx,listDx;
	private JButton btnOk,btnCancel;
	private Font font;
	public MyFont(JFrame frame){
		super(frame,"��������",true);
		mainPanel=new JPanel(null);
		lblZt=new JLabel("���壺");
		lblZx=new JLabel("���Σ�");
		lblDx=new JLabel("��С");
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = e.getAvailableFontFamilyNames();
		listZt=new JComboBox<String>(fontNames);
		String[] zx={"����","��б","�Ӵ�"};
		listZx=new JComboBox<String>(zx);
		String[] dx={"6","7","8","10","14","20","30"};
		listDx=new JComboBox<String>(dx);
		btnOk=new JButton("ȷ��");
		btnCancel=new JButton("ȡ��");
		//
		listZx.setMaximumRowCount(10);
		///���ô�С��λ��
		lblZt.setBounds(20,20,80,25);
		lblZx.setBounds(140,20,80,25);
		lblDx.setBounds(260,20,80,25);
		listZt.setBounds(20,50,100,25);
		listZx.setBounds(140,50,100,25);
		listDx.setBounds(260,50,100,25);
		btnOk.setBounds(190,170,60,25);
		btnCancel.setBounds(300,170,60,25);
		///�ѿؼ���������
		setContentPane(mainPanel);
		mainPanel.add(lblDx);
		mainPanel.add(lblZt);
		mainPanel.add(lblZx);
		mainPanel.add(listZt);
		mainPanel.add(listZx);
		mainPanel.add(listDx);
		mainPanel.add(btnOk);
		mainPanel.add(btnCancel);
		//
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		//���ô���
		setBounds(100,100,380,250);
		//setVisible(true);
		setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnCancel)){
			this.setVisible(false);
		}
		if(e.getSource().equals(btnOk)){
			String fontName=listZt.getSelectedItem().toString();
			int n=0;
			if(listZx.getSelectedItem().toString().equals("����")){
				n=Font.PLAIN;
			}
			if(listZx.getSelectedItem().toString().equals("�Ӵ�")){
				n=Font.BOLD;
			}
			if(listZx.getSelectedItem().toString().equals("��б")){
				n=Font.ITALIC;
			}
			int zh=Integer.valueOf(listDx.getSelectedItem().toString());
			font=new Font(fontName,n,zh);
			this.setVisible(false);
		}
	}
	public Font getMyFont(){
		return font;
	}

}
