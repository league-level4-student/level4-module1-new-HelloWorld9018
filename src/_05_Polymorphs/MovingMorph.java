package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	boolean loop = true;
	public MovingMorph(int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
		super(x, y, width, height);
			
		}
	

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		if(x<400 && loop) {
			x+=5;	
		}
		if (y < 400 && loop) {
			y+=2;
		}
		else {
			loop = false;
		}
		if(x>100 && loop == false) {
			x-=5;
		}
		if (y>100 && loop == false) {
			y-=2;
		}
		else {
			loop = true;
		}
		
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		super.draw(g);
		
	}

}
