import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class FrontEnd {

		JFrame window;
		private JTextField textField;
		
	/**
	 * @wbp.parser.entryPoint
	 */
	public FrontEnd(){
		window = new JFrame("Messanger");
		Dimension dim = new Dimension(800,800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setPreferredSize(dim);
		window.setMaximumSize(dim);
		window.setMinimumSize(dim);
		window.setLocationRelativeTo(null);
		window.getContentPane().setLayout(null);
		
		
		
	}
	public static void main(String[] args){
		
	}
}
