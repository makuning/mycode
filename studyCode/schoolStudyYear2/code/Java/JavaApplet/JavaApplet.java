//导入实现Applet需要用到的类库
import java.applet.Applet;
import java.awt.*;
//通过继承方式定义并实现一个Applet类JavaScript
public class JavaApplet extends Applet{
	public void paint(Graphics g){
		//调用Graphics对象g的drawString方法，在html页面的指定位置打印一行字符串
		g.drawString("This is my first Java Applet!",20,10);
	};
}