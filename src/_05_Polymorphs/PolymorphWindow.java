package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * 1. Create new member variables for the width and height of Polymorph then 
 * initialize them in its constructor.
 *                                                       
 * 2. Encapsulate the member variables of the Polymorph class. 
 * --------------------------------------------------------------------IDK HOW TO DO THIS!!
 * 3. Substitute the hard-coded numbers in the draw method of the BluePolymorph 
 * class with its width and height.
 * 
 * 4. Create a new sub-class of the Polymorph class called RedPolymorph.
 * 
 * 5. Make RedPolymorph draw a red rectangle when its draw method is called.
 * 
 * 6. Create an object of RedPolymorph in the PolymorphWindow class and test
 * it by drawing it like the BluePolymorph.
 * 
 * 7. Create a new sub-class of the Polymorph class called MovingMorph.
 * 
 * 8. Add code to its update method to make MovingMorph objects move around
 * the screen.
 * 
 * 9. Create a MovingMorph object in your PolymorphWindow class and test it
 * by calling its draw and update methods.
 *
 * 10. Now, delete all references to Polymorphs subclasses inside your
 * PolymorphWindow class.
 * 
 * 11. Create an ArrayList of Polymorph inside your PolymorphWindow class.
 * 
 * 12. Initialize the ArrayList and add a bunch of different types of
 * Polymorph subclass objects to the ArrayList.
 * 
 * 13. Use loops to call the draw and update method for all the Polymorphs in 
 * the list.
 * 
 * 14. Create a Polymorph that follows your mouse. Hint: The MouseMotionListener
 *  interface.
 * 
 * 15. Create a Polymorph that displays a JOptionPane Message Dialog when
 *  clicked. Hint: MouseListener interface.
 *  ----------------------------------------------------------------I AM ON THIS STEP HERE!!!!!!!!!
 */

public class PolymorphWindow extends JPanel implements ActionListener {

    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;

    private JFrame window;
    private Timer timer;
    ArrayList <Polymorph> polly = new ArrayList<>();
    
    public static void main(String[] args) {
        new PolymorphWindow().buildWindow();
    }

    public void buildWindow() {
        window = new JFrame("IT'S MORPHIN' TIME!");
        window.add(this);
        window.getContentPane().setPreferredSize(new Dimension(500, 500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        
        
        polly.add(new BluePolymorph(50, 40, 30, 20));
        polly.add(new RedPolymorph(100, 50, 20, 10));
        polly.add(new MovingMorph(200, 80, 10, 40));
        polly.add(new FollowingMorph(200, 200, 25, 25));
        polly.add(new DisplayMorph(400, 400, 40, 40));
        
        window.addMouseMotionListener((FollowingMorph)polly.get(3));

        timer = new Timer(1000 / 30, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
    	//==========================================WHERE IS THIS BEING CALLED????
        // draw background
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 500, 500);

        // draw polymorph
        for(int i = 0; i<polly.size(); i++) {
        	polly.get(i).draw(g);
        }
    
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        
        for(Polymorph c: polly) {
        	c.update();
        }


    }
}
