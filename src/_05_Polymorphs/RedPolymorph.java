package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{

	public RedPolymorph(int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
		super(x, y, width, height);
		//what does super do again? refresher on constructors
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		super.draw(g);
		//difference between capital RED and lower case red?
		
	}

}
