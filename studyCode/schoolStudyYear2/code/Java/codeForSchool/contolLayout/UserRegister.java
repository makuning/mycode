import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UserRegister extends JFrame{
	private JPanel mainPanel;//���
	private JLabel lblNo,lblName,lblSex,lblAge,lblCls,lblHobby,lblNote;//��ǩ
	private JTextField txtNo,txtName,txtAge;//�����ı���
	private JRadioButton rdoSexMan,rdoSexWoman;//��ѡ��
	private ButtonGroup bg;//��ϰ�ť
	private JComboBox<String> cboCls;//������
	private JCheckBox cboNetwork,cboGame,cboBall,cboBuy;//��ѡ��
	private JTextArea txtNote;//�����ı���
	private JScrollPane scoNote;//�������
	private JButton btnReg,btnExit;
	//���췽��
	public UserRegister(){
		//ʵ�����ؼ�
		mainPanel=new JPanel(null);
		lblNo=new JLabel("ѧ��");
		lblName=new JLabel("����");
		lblSex=new JLabel("�Ա�");
		lblAge=new JLabel("����");
		lblCls=new JLabel("�༶");
		lblHobby=new JLabel("����");
		lblNote=new JLabel("���˼��");
		txtNo=new JTextField();
		txtName=new JTextField();
		txtAge=new JTextField();
		rdoSexMan=new JRadioButton("��");
		rdoSexWoman=new JRadioButton("Ů");
		bg=new ButtonGroup();
		String[] cls={"���18-1","���18-2","���18-3","���19-1","���19-2","���19-3"};
		cboCls=new JComboBox<String>(cls);
		cboBall=new JCheckBox("����");
		cboBuy=new JCheckBox("����");
		cboGame=new JCheckBox("��Ϸ");
		cboNetwork=new JCheckBox("����");
		txtNote=new JTextArea();
		scoNote=new JScrollPane(txtNote);
		
		btnReg=new JButton("ע��");
		btnExit=new JButton("�˳�");
		//���ÿؼ���λ�úʹ�С
		lblNo.setBounds(30,30,60,25);
		txtNo.setBounds(90,30,250,25);
		lblName.setBounds(30,65,60,25);
		txtName.setBounds(90,65,250,25);
		lblAge.setBounds(30,100,60,25);
		txtAge.setBounds(90,100,250,25);
		lblSex.setBounds(30,135,60,25);
		rdoSexMan.setBounds(90,135,60,25);
		rdoSexWoman.setBounds(180,135,60,25);
		bg.add(rdoSexMan);
		bg.add(rdoSexWoman);//����
		lblCls.setBounds(30,170,60,25);
		cboCls.setBounds(90,170,250,25);
		lblHobby.setBounds(30,205,60,25);
		cboBall.setBounds(90,205,60,25);
		cboBuy.setBounds(150,205,60,25);
		cboGame.setBounds(210,205,60,25);
		cboNetwork.setBounds(270,205,60,25);
		lblNote.setBounds(30,240,60,25);
		scoNote.setBounds(90,240,250,100);
		btnReg.setBounds(90,360,60,25);
		btnExit.setBounds(210,360,60,25);
		this.setBounds(100,100,370,430);
		//���ؼ���������
		setContentPane(mainPanel);
		mainPanel.add(lblAge);
		mainPanel.add(lblCls);
		mainPanel.add(lblHobby);
		mainPanel.add(lblName);
		mainPanel.add(lblNo);
		mainPanel.add(lblNote);
		mainPanel.add(lblSex);
		mainPanel.add(txtAge);
		mainPanel.add(txtName);
		mainPanel.add(txtNo);
		mainPanel.add(scoNote);
		mainPanel.add(rdoSexMan);
		mainPanel.add(rdoSexWoman);
		mainPanel.add(cboCls);
		mainPanel.add(cboBall);
		mainPanel.add(cboBuy);
		mainPanel.add(cboGame);
		mainPanel.add(cboNetwork);
		mainPanel.add(btnExit);
		mainPanel.add(btnReg);
		//���ô��ڵ�����
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}
	public static void main(String[] args) {
		new UserRegister();
	}
}
