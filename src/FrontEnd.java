import java.awt.Dimension;

import javax.swing.JFrame;


public class FrontEnd {

		JFrame window;
		
	public FrontEnd(){
		window = new JFrame("Messanger");
		Dimension dim = new Dimension(800,800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setPreferredSize(dim);
		window.setMaximumSize(dim);
		window.setMinimumSize(dim);
		window.setLocationRelativeTo(null);
		
	}
	public static void main(String[] args){
		
	}
	
	
}
