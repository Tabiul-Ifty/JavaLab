import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class sub_checkbox_class extends JFrame {

	private JCheckBox bold;
	private JCheckBox italic;
	private JTextField t;
	
	public sub_checkbox_class() {
		super("this is the title for CheckBox");
		
		setLayout(new FlowLayout());
		t  =  new JTextField("This going to be the sentence ",15);
		t.setBounds(50, 100, 150, 100);

		t.setFont(new Font("Serif",Font.PLAIN,15));
		add(t);
		
		bold = new JCheckBox("BOLD");
		bold.setLocation(50, 100);
		italic = new JCheckBox("ITALIC");
		
		add (bold);
		add(italic);
		HandlerClass handler = new HandlerClass();
		bold.addItemListener(handler);
		italic.addItemListener(handler);
	}
	private class HandlerClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			
			if(bold.isSelected() && italic.isSelected()) 
				font = new Font ("Serif",Font.BOLD + Font.ITALIC,15);
			else if (bold.isSelected())
				font = new Font ("Serif",Font.BOLD ,15);
			else if (italic.isSelected())
				font = new Font ("Serif",Font.ITALIC ,15);
			else 
				font = new Font ("Serif", Font.PLAIN,15);
			
			t.setFont(font);
		}
	}
	
}
