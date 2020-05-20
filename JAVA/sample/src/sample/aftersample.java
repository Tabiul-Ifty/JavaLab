package sample;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class aftersample extends JFrame {
	
	//Login_page
	
	private JLabel jl1;
	private JLabel jl2;
	private JTextField jt1;
	private JTextField jt2;
	private JButton jb1;
	private JButton jb2;
	private JOptionPane jp;
	
	public aftersample() {
		super("Login Site");
		
		jl1 = new JLabel("First Name");
		jl1.setBounds(50, 50, 100, 30);
		jl2 = new JLabel ("Last Name");
		jl2.setBounds(50, 100, 100, 30);
		
		jt1 = new JTextField();
		jt1.setBounds(160, 50, 150, 30);
		jt2 = new JTextField();
		jt2.setBounds(160, 100, 150, 30);
		
		jb1 = new JButton("Login");
		jb1.setBounds(140, 150, 80, 30);
		
		jb2 = new JButton("Sign-up");
		jb2.setBounds(250, 150, 80, 30);
		
		
		add(jl1); 
		add(jl2);
		
		add(jt1);
		add(jt2);
		
		add(jb1);
		add(jb2);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
