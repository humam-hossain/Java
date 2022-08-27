import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.io.File;
import java.io.*;
import java.util.Formatter;
import java.util.*;


public class LoginPage extends JFrame implements ActionListener {

	private ImageIcon icon,img,limg,logoutimg,backimg;
	private Container c;
	private JLabel userlabel,passlabel,txlabel;
	private Font f;
	private JLabel imglabel;
	private JTextField tx1,tx2;
	private JPasswordField pass;
	private JButton but1,but2,but3,but4,but7;
	private Cursor cursor;
	private JRadioButton r1,r2,r3;
	private JCheckBox showpass;

	
	LoginPage()
	{

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Login Page");
		
		
		
         JLabel background;
		

		
 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
		
		c=this.getContentPane();
		
		c.setLayout(null);
		c.setBackground(Color.PINK);
		img= new ImageIcon(getClass().getResource("photo//loginpage.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(400,5,img.getIconWidth(),img.getIconHeight());
		c.add(imglabel);
		
		ImageIcon img = new ImageIcon("photo//loginpageback.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		
		
		
		f=new Font (" Arial",Font.BOLD,14);
		
		
		userlabel = new JLabel();
		userlabel.setText (" User Name : ");
		userlabel.setBounds(50,40,150,50);
		userlabel.setFont(f);
		userlabel.setForeground(Color.WHITE);
		userlabel.setToolTipText(" Enter Your User Name");
		background.add(userlabel);
		
		passlabel=new JLabel();
		passlabel.setText(" Password : ");
		passlabel.setBounds(50,80,150,50);
		passlabel.setFont(f);
		passlabel.setForeground(Color.WHITE);
		passlabel.setToolTipText(" Enter Your Password");
		background.add(passlabel);
		
		txlabel=new JLabel();
		txlabel.setText(" Do you want to signup then click signup ");
		txlabel.setBounds(50,400,350,30);
		txlabel.setFont(new Font("Arial", 0, 18));
		//txlabel.setBackground(Color.GRAY);
		txlabel.setForeground(Color.WHITE);
		background.add(txlabel);
		
		
		tx1=new JTextField();
		tx1.setBounds(200,50,200,30);
		tx1.setHorizontalAlignment(JTextField.CENTER);
		background.add(tx1);
		
		pass =new JPasswordField();
		pass.setBounds(200,90,200,30);
		pass.setHorizontalAlignment(JTextField.CENTER);
		background.add(pass);
		/*
		JCheckBox showpass = new JCheckBox(" Show password");
		showpass.setBounds(450,90,120,30);
		showpass.addActionListener(this);
		background.add(showpass);
		*/
		
		r1=new JRadioButton("User");
		r1.setBounds(200,140,90,30);
		r1.addActionListener(this);
		r1.setSelected(true);
		background.add(r1);
		
		r2 = new JRadioButton("Employee");
		r2.setBounds(300,140,90,30);
		r2.addActionListener(this);
		background.add(r2);
		r3 = new JRadioButton("Admin");
		r3.setBounds(400,140,90,30);
		r3.addActionListener(this);
		background.add(r3);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		cursor =new Cursor(Cursor.HAND_CURSOR);
		Border border = BorderFactory.createEmptyBorder(0,0,0,0);
		
		limg = new ImageIcon(getClass().getResource("photo//loginbutton.png"));
		
		but1=new JButton(limg);
		but1.setBounds(250,210,90,30);
		but1.setCursor(cursor);
		//but1.setBorder(border); 
		but1.addActionListener(this);
		but1.setFocusPainted(false);
		background.add(but1);
		
		but2=new JButton("Sign Up");
		but2.setBounds(600,400,90,30);
		but2.setCursor(cursor);
			but2.setFocusPainted(false);
			
		but2.addActionListener(this);
		background.add(but2);
		
		backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		but7.setCursor(cursor);
			but7.setBorder(border);
	
		but7.addActionListener(this);
		background.add(but7);
		
		

			
		
			
		  
		  
		
	  
	  
	  }
	  
	  public void actionPerformed(ActionEvent ae){
				

			  if (ae.getSource()==but1)
				  
				  {
					  
					  if (r1.isSelected())
					  {
						  boolean matched = false;
			    String userId= tx1.getText().toString();
				String password = pass.getText().toString();
				
				
				
				try{
				
				FileReader fir = new FileReader("signup.txt");
				BufferedReader bfr = new BufferedReader(fir);
				String line;
				while((line=bfr.readLine())!=null ){
					if(line.equals(userId+"\t\t\t"+password)){
						matched=true;
						break;
						
					}
					
				}
				fir.close(); 
				}catch(Exception e){}
				
				if(matched){
					 dispose();
			  UserPage frame = new UserPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
					
				}
				
				else{
					
					JOptionPane.showMessageDialog(null, " Invalid user Id Or Password");
				}
						  
					  }
					  
			 else if (r2.isSelected())
			 {
				 
				  boolean matched = false;
			    String userId= tx1.getText().toString();
				String password = pass.getText().toString();
				
				
				
				try{
				
				FileReader fir = new FileReader("employee.txt");
				BufferedReader bfr = new BufferedReader(fir);
				String line;
				while((line=bfr.readLine())!=null ){
					if(line.equals(userId+","+password)){
						matched=true;
						break;
						
					}
					
				}
				fir.close(); 
				}catch(Exception e){}
				
				if(matched){
					 dispose();
			  EmployeePortal frame = new EmployeePortal();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
					
				}
				
				else{
					
					JOptionPane.showMessageDialog(null, " Invalid user Id Or Password");
				}
						 
	
	
	
	
	
			 }
			 
			 else if (r3.isSelected())
			 {
				 String userId= tx1.getText();
				String password = pass.getText();
				
				
				if(userId.equals("admin") && password.equals("123450"))
				{
					//JOptionPane.showMessageDialog(null, " You are Successfully Logined");
					 dispose();
			  AdminFrame frame = new AdminFrame();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
			
			  
				}
				else{
					
					JOptionPane.showMessageDialog(null, " Invalid user Id Or Password");
				}
			 }
					  
					  
				  }
	
			else if (ae.getSource()==but2)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to Sign Up !");
					dispose();
			  SignUp frame = new SignUp();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
			  
				}
				
					else if (ae.getSource()==but7)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to Sign Up !");
					dispose();
			  HomePage frame = new HomePage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
			  
				}
				
				
		
					
			}
		
		/*	
		  public void showpassActionPerformed(ActionEvent e){
			  char password = pass.getText().tochar();
			  
			  	 if(showpass.isSelected())
				{
					pass.setEchoChar((char)0);
				}
		  else{
			  pass.setEchoChar();
		  }
}*/
		
	
	
	
	
	public static void main(String args[])
	{
		
		LoginPage frame = new LoginPage();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300,100,800,600);
		frame.setTitle(" Login Page");
		frame.setResizable(false);
	
		
		
		
	}
}