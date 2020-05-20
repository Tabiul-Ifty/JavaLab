import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class subclass extends JFrame {
	
	private JLabel item1;
	//private JTextField item2;
	
	public subclass() {
		
		super("This is the titel");
		
		setLayout(new FlowLayout());
		
		item1 = new JLabel ("this is the Message That will Show");
		//item2 = new JTextField("This is new one ");
		
		add(item1);
		//add(item2);
		
		}

}
