import java.util.ArrayList;
import java.util.List;


public class BackEnd {

	
	public ArrayList<User> userList = new  ArrayList<User>();
	
	public BackEnd()
	{
		userList.add(new User("Sean"));
		userList.add(new User("Rafie"));
	}
	
	public List<String> getMessages(String username)
	{
		ArrayList<String> list = null;
		for(int i = 0; i < userList.size(); i++)
		{
			if(username == userList.get(i).getName())
				list = userList.get(i).getUserMessages();
		}
		return list;
	} 
	
	public void addMessage(String username, String msg)
	{
		for(int i = 0; i < userList.size(); i++)
		{
			if(username == userList.get(i).getName())
				userList.get(i).addUserMessage(msg);
		}
	}
	
	public List<String> getUsers()
	{
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < userList.size(); i++)
		{
			list.add(userList.get(i).getName());
		}
		return list;
		
	}
	

}
