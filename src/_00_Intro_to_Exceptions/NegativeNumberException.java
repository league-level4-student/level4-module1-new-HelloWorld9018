package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void scaryPopup() {
		JOptionPane.showMessageDialog(null, "A crtical error in your computer has been trigered", "WARNING", JOptionPane.ERROR_MESSAGE);
	}
	

}
