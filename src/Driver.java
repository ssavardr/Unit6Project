import javax.swing.SwingUtilities;


public class Driver {

	
	public Driver(){
		FrontEnd gui = new FrontEnd();
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {new FrontEnd(); }
		});
	}
}
