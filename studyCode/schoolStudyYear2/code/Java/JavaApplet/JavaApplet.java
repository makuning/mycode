//����ʵ��Applet��Ҫ�õ������
import java.applet.Applet;
import java.awt.*;
//ͨ���̳з�ʽ���岢ʵ��һ��Applet��JavaScript
public class JavaApplet extends Applet{
	public void paint(Graphics g){
		//����Graphics����g��drawString��������htmlҳ���ָ��λ�ô�ӡһ���ַ���
		g.drawString("This is my first Java Applet!",20,10);
	};
}