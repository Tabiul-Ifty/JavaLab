package labEXAM;
import javax.swing.*;
import java.awt.*;

public class subexam extends JFrame {
 private JOptionPane jo;
 public subexam() {
	// super("Title");
	 int p=1;
	 while(p != 0) {
	 jo = new JOptionPane();
	 String name  =	JOptionPane.showInputDialog("Enter First name");  
	 String name1 =	JOptionPane.showInputDialog("Enter Last name");
	 jo.showMessageDialog(jo,"Your Full Name is "+ name + " " + name1); 
	 int r = jo.showConfirmDialog(null, "Do you want to QUIT", "YES / NO", JOptionPane.YES_NO_CANCEL_OPTION);
	 
	 
		 if( r == 0) {
			 
			 break;
		 }
		 
		 else {
			 continue;
		 }
		 
		 }
	 
	 	
 	}
 
}
