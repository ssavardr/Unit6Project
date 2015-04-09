import java.util.ArrayList;


public class User {

	String username;
	ArrayList<String> messageList;
	
	public User(String name)
	{
		this.username = name;
		this.messageList = new ArrayList<String>();
	}
	
	public User(String name, String message)
	{
		this.username = name;
		this.messageList = new ArrayList<String>();
		this.messageList.add(message);
	}
	
	public ArrayList<String> getUserMessages(){
		return messageList;
	}
	
	public void addUserMessage(String message)
	{
		this.messageList.add(message);
	}
	
	public String getName()
	{
		return this.username;
	}
}
