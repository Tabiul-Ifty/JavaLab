import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class FoodOrder extends JFrame {
	
	
	private JCheckBox P;
	private JCheckBox B;
	private JCheckBox D;
	private JLabel label;
	private JButton button;
	
	public FoodOrder(){
		super("Order Your Food Online");
		
		
		label = new JLabel("Order Food");
		label.setBounds(400, 270, 500, 50);
		
		P=new JCheckBox("Pizza @ 90");  
        P.setBounds(100,100,150,20); 

		B=new JCheckBox("Burger @ 35");  
        B.setBounds(100,150,150,20);
        
		D=new JCheckBox("Drink @ 10");  
        D.setBounds(100,200,150,20);
        
     
        
        button=new JButton("Order");  
        button.setBounds(100,250,80,30); 
       // button.addActionListener(this);
        add(P);
        add(B);
        add(D);
        add(label);
        add(button);
        setLayout(new FlowLayout());
        
       classHandler handle = new classHandler();
       button.addActionListener(handle);       
}
	private  class classHandler implements ActionListener{
		public void itemStateChanged(ActionEvent event) {
			double amount = 0;
			String msg = "";
			
			if (P.isSelected()) {
				amount =  amount + 90;
				msg = "Pizza : 90\n";
			}
			msg = " ------------\n ";
			 JOptionPane.showMessageDialog(null, this,msg+"Total: "+amount, DEFAULT_CURSOR); 
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
}
		
	


