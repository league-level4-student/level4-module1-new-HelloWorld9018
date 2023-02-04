package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FollowingMorph extends Polymorph implements MouseMotionListener{

	public FollowingMorph(int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
		super (x, y, width, height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		super.draw(g);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		y = e.getY();
		x = e.getX();
		
	}

}
