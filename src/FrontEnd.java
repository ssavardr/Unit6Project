import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

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
		BackEnd backEnd = new BackEnd();
		window = new JFrame("Messanger");
		window.setTitle("Messenger ");
		Dimension dim = new Dimension(800,800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setPreferredSize(dim);
		window.setMaximumSize(dim);
		window.setMinimumSize(dim);
		window.setLocationRelativeTo(null);
		window.getContentPane().setLayout(null);
		window.getContentPane().setBackground(Color.WHITE);
		window.setResizable(false);
		
		
		JTextPane messagePane = new JTextPane();
		messagePane.setBackground(Color.LIGHT_GRAY);
		messagePane.setBounds(227, 124, 417, 249);
		window.getContentPane().add(messagePane);
		
		JButton searchMessagesButton = new JButton("Search Messages");
		searchMessagesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchMessagesButton.setBounds(43, 159, 121, 32);
		window.getContentPane().add(searchMessagesButton);
		
		ArrayList<String> users = (ArrayList<String>) backEnd.getUsers();
		String [] usernameArray = new String [users.size()];
		for(int i = 0; i < users.size(); i++)
		{
			usernameArray[i] = users.get(i);
		}
		JComboBox usernameSelector = new JComboBox(usernameArray);
		usernameSelector.setBounds(170, 41, 28, 20);
		window.getContentPane().add(usernameSelector);
		
		
		
		JLabel selectUsernameLabel = new JLabel("Select Username");
		selectUsernameLabel.setBounds(28, 39, 92, 25);
		window.getContentPane().add(selectUsernameLabel);
		
		
		
	}
	public static void main(String[] args){
		new FrontEnd();
	}
}
