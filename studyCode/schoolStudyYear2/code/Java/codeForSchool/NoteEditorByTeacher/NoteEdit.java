package com.scitc;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class NoteEdit extends JFrame{
	private JPanel mainPanel;
	private JMenuBar menuBar;
	private JMenu menuFile,menuEdit,menuHelp;
	private JMenuItem newItem,openItem,saveItem,exitItem,copyItem,
					  cutItem,pasteItem,fontItem,colorItem,aboutItem;
	private JToolBar toolBar;
	private JButton btnNew,btnOpen,btnSave,btnCut,btnCopy,btnPaste,btnFont,btnColor;
	private JTextArea txtArea;
	private JScrollPane scrollPane;
	public NoteEdit(){
		//ʵ�����ؼ�
		mainPanel=new JPanel(new BorderLayout());//���ñ߽粼��
		menuBar=new JMenuBar();
		menuFile=new JMenu("�ļ�");
		menuEdit=new JMenu("�༭");
		menuHelp=new JMenu("����");
		newItem=new JMenuItem("�½�");
		openItem=new JMenuItem("��");
		saveItem=new JMenuItem("����");
		exitItem=new JMenuItem("�˳�");
		cutItem=new JMenuItem("����");
		copyItem=new JMenuItem("����");
		pasteItem=new JMenuItem("ճ��");
		fontItem=new JMenuItem("����");
		colorItem=new JMenuItem("��ɫ");
		aboutItem=new JMenuItem("����");
		toolBar=new JToolBar();
		btnColor=new JButton("��ɫ");
		btnCopy=new JButton("����");
		btnCut=new JButton("����");
		btnFont=new JButton("����");
		btnNew=new JButton("�½�");
		btnOpen=new JButton("��");
		btnPaste=new JButton("ճ��");
		btnSave=new JButton("����");
		txtArea=new JTextArea();
		scrollPane=new JScrollPane(txtArea);
		//���ؼ���������
		setContentPane(mainPanel);
		menuFile.add(newItem);
		menuFile.add(openItem);
		menuFile.addSeparator();
		menuFile.add(saveItem);
		menuFile.addSeparator();
		menuFile.add(exitItem);
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
	public static void main(String[] args) {
		new NoteEdit();
	}
}
