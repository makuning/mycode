package D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

public class AppletDemo extends JApplet implements MouseListener,MouseMotionListener{
    private int x1,y1,x2,y2;
    public AppletDemo() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(x1,y1,x2,y2);
        x1=x2;
        y1=y2;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton()==1){
            x1=x2=e.getX();
            y1=y2=e.getY();
        }


    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x2=e.getX();
        y2=e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}