package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class DisplayMorph extends Polymorph implements MouseListener{

	public DisplayMorph(int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
		super(x, y, width, height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		super.draw(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//how to check for color under mouse?
		if(x>400 && x<440 && y>400 && y<440) {
			JOptionPane.showMessageDialog(null, "hello!");
		}
		//--------------------------------------------DOESN"T WORK!!!!!!!!!!!!!!!!
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

}
