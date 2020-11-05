import javax.swing.JApplet;

public class AppletDemo extends JApplet{
    public void init(){
        System.out.println("初始化方法执行了。。。。。");
    }

    public void stop(){
        System.out.println("停止");
    }

    public void start(){
        System.out.println("开始");
    }

    public void paint(){
        System.out.println("绘画");
    }

    public void destroy(){
        System.out.println("销毁");
    }
}