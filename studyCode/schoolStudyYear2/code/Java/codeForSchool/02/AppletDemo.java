import javax.swing.JApplet;

public class AppletDemo extends JApplet{
    public void init(){
        System.out.println("��ʼ������ִ���ˡ���������");
    }

    public void stop(){
        System.out.println("ֹͣ");
    }

    public void start(){
        System.out.println("��ʼ");
    }

    public void paint(){
        System.out.println("�滭");
    }

    public void destroy(){
        System.out.println("����");
    }
}