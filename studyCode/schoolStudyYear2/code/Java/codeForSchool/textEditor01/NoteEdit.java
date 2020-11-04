package com.scitc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileFilter;
import javax.swing.plaf.ColorChooserUI;

public class NoteEdit extends JFrame implements ActionListener{
	private JPanel mainPanel;
	private JMenuBar menuBar;
	private JMenu menuFile,menuEdit,menuHelp;
	private JMenuItem newItem,openItem,saveItem,exitItem,copyItem,
					  cutItem,pasteItem,fontItem,colorItem,aboutItem;
	private JToolBar toolBar;
	private JButton btnNew,btnOpen,btnSave,btnCut,btnCopy,btnPaste,btnFont,btnColor;
	private JTextArea txtArea;
	private JScrollPane scrollPane;
	private String fileName="���ļ�";
	private static int count=0;
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
		
		ImageIcon newIcon=new ImageIcon(NoteEdit.class.getClassLoader().getResource("image//new.gif"));
		btnNew=new JButton(newIcon);
		ImageIcon openIcon=new ImageIcon(NoteEdit.class.getClassLoader().getResource("image//open.gif"));
		btnOpen=new JButton(openIcon);
		
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
	public static void main(String[] args) {
		new NoteEdit();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(exitItem)){
			System.exit(0);
		}
		if(e.getSource().equals(newItem)||e.getSource().equals(btnNew)){
			txtArea.setText("");
			count++;
			setTitle(fileName+count);
		}
		if(e.getSource().equals(openItem)||e.getSource().equals(btnOpen)){
			try {
				open();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource().equals(saveItem)||e.getSource().equals(btnSave)){
			try {
				save();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource().equals(cutItem)||e.getSource().equals(btnCut)){
			txtArea.cut();
		}
		if(e.getSource().equals(copyItem)||e.getSource().equals(btnCopy)){
			txtArea.copy();
		}
		if(e.getSource().equals(pasteItem)||e.getSource().equals(btnPaste)){
			txtArea.paste();
		}
		if(e.getSource().equals(colorItem)||e.getSource().equals(btnColor)){
			txtArea.setForeground(getColor());
		}
		if(e.getSource().equals(fontItem)||e.getSource().equals(btnFont)){
			txtArea.setFont(getMyFont());
			//System.out.print(getFont().getSize());
		}
	}
	private Font getMyFont() {
		MyFont myFont=new MyFont(this);
		myFont.setVisible(true);
		return myFont.getMyFont();
	}
	private Color getColor() {
		JColorChooser cc=new JColorChooser();
		Color c=cc.showDialog(this, "��ɫ����", Color.black);
		return c;
	}
	private void save() throws IOException {
		JFileChooser fc=new JFileChooser();
		fc.addChoosableFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean accept(File f) {
				
				return f.getName().toString().endsWith(".txt");
			}
		});
		if(fc.showSaveDialog(this)==0){
			File file=fc.getSelectedFile();
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			String str=txtArea.getText();
			str.replaceAll("\12", "\12\13");
			bw.write(str);
			bw.close();
			fw.close();
		}
	}
	private void open() throws IOException {
		JFileChooser fc=new JFileChooser("c:\\");
		
		fc.setFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				return ".txt";
			}
			
			@Override
			public boolean accept(File f) {
				return f.getName().endsWith(".txt")||f.getName().endsWith(".log");
			}
		});
		
		int n=fc.showOpenDialog(this);
		if(n==0){
			setTitle(fc.getSelectedFile().getName());
			File file=fc.getSelectedFile();
			
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			StringBuffer sb=new StringBuffer();
			int n1=0;
			char[]cs=new char[1024];
			while((n1=br.read(cs))!=-1){
				sb.append(new String(cs,0,n1));
			}
			txtArea.setText(sb.toString());
			br.close();
			fr.close();
		}
	}
}
