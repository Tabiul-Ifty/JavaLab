package sample;
import java.awt.*;
import java .awt.ActiveEvent.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;

public class sampleMain extends JFrame {
	
	private JTextField jt1;
	private JTextField jt2;
	private JTextField jt3;
	private JLabel jl1;
	private JLabel jl2;
	private JLabel jl3;
	private JButton jb;
	private JOptionPane jp;
	private Image icon;
	
	public sampleMain() {
	
		super("The title is simple");
		
		//Image icon = Toolkit.getDefaultToolkit().getImage("images/images (2).png");    
		//setIconImage(icon);
		
		ImageIcon img = new ImageIcon("G:\\JAVA\\sample\\image\\img4.png");
		setIconImage(img.getImage());
		
		jl1 = new JLabel("First Name");
		jl1.setBounds(50, 50, 100, 30);
		jl2 = new JLabel ("Last Name");
		jl2.setBounds(50, 100, 100, 30);
		jl3 = new JLabel ("Email");
		jl3.setBounds(50, 150, 100, 30);
		
		
		jt1 = new JTextField();
		jt1.setBounds(160, 50, 150, 30);
		jt2 = new JTextField();
		jt2.setBounds(160, 100, 150, 30);
		jt3 = new JTextField();
		jt3.setBounds(160, 150, 150, 30);
		
		
		jb = new JButton("click");
		jb.setBounds(200, 200, 60, 30);
		
		jb.addActionListener(
				new ActionListener(){
			
								public void actionPerformed(ActionEvent e) {
				
										//String str1 = jt1.getText();
										//String str2 = jt2.getText();
										//String str3 = jt3.getText();
										//jp.showMessageDialog(null, str1 + str2 + str3);
										
										try{
								            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tabiul","root","1070");
								           // Statement stmt=con.createStatement();
								             String sql = "Insert into tabiul values (?,?,?)";
								             PreparedStatement stat = con.prepareStatement(sql);
								             stat.setString(1, jt1.getText());
								             stat.setString(2, jt2.getText());
								             stat.setString(3, jt3.getText());
								             stat.executeUpdate();
								             JOptionPane.showMessageDialog(null, "Successfull");
								             }
										catch(SQLException error){
											JOptionPane.showMessageDialog(null, error.getMessage());
											//System.out.println("input again");
											//error.printStackTrace();
										}
										
														
			}
		}
	
	);
		
		 
		
		add(jl1); 
		add(jl2);
		add(jl3);
		add(jt1);
		add(jt2);
		add(jt3);
		add(jb);
	}
	
}
