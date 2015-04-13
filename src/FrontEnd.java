import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;


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
		window.getContentPane().setBackground(Color.DARK_GRAY);
		window.setResizable(false);
		
		
		JTextPane messagePane = new JTextPane();
		messagePane.setBackground(Color.LIGHT_GRAY);
		messagePane.setBounds(246, 25, 524, 725);
		window.getContentPane().add(messagePane);
		
		
		
		JButton addUserButton = new JButton("Add User");
		addUserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getID() == e.ACTION_PERFORMED)
				{
					//backEnd.userList.add(new User(usernameList.getSelectedValue().toString()));
					String result = JOptionPane.showInputDialog(window, "Enter Username: ");		
					backEnd.userList.add(new User(result));
				}
			}
		});
		addUserButton.setBounds(25, 589, 200, 75);
		window.getContentPane().add(addUserButton);
		
		
		
		ArrayList<String> users = (ArrayList<String>) backEnd.getUsers();
		String [] usernameArray = new String [users.size()];
		for(int i = 0; i < users.size(); i++)
		{
			usernameArray[i] = users.get(i);
		}
		System.out.println("got out of loop");
		JList usernameList = new JList(usernameArray);
		usernameList.setBackground(Color.LIGHT_GRAY);
		usernameList.setBounds(25, 25, 200, 450);
		window.getContentPane().add(usernameList);
		
		
		JButton searchMessagesButton = new JButton("Search Messages");
		searchMessagesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getID() == e.ACTION_PERFORMED)
				{
					String name = usernameList.getSelectedValue().toString();
					//ArrayList messages = new ArrayList<String>
				}
			}
		});
		searchMessagesButton.setBounds(25, 495, 200, 75);
		window.getContentPane().add(searchMessagesButton);
		
		
		
		JButton composeMessageButton = new JButton("Compose Message");
		composeMessageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		composeMessageButton.setBounds(25, 675, 200, 75);
		window.getContentPane().add(composeMessageButton);
		
		
		
		
		
	}
	
}
