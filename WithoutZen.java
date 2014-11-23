import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class WithoutZen extends JFrame implements KeyListener{
	
	public static void main(String[] args){
		new WithoutZen();
	}
	int x = 250;
	int y = 250;
	boolean upKeyPressed = false;
	public WithoutZen(){
		super("motion");
		setSize(500,500);
		addKeyListener(this);
		setVisible(true);
	}
	public void paint(Graphics z){
		z.setColor(Color.blue);
		z.fillRect(0, 0, 500, 500);
		z.setColor(Color.pink);
		z.fillOval(x, y, 10, 10);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			y = y -10;
					repaint();
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			y = y +10;
					repaint();
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			x = x -10;
					repaint();
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			x = x +10;
					repaint();
		}
		
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
