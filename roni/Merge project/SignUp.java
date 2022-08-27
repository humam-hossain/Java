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
import java.io.FileWriter;
import java.io.*;
import java.util.Formatter;
import java.util.*;

public class SignUp extends JFrame implements ActionListener

{
	private ImageIcon icon,img,logoutimg,backimg;
	private Container c;
	private JLabel userlabel,passlabel,confirmpasslabel,namelabel,mobilelabel,emaillabel,addresslabel,genderlabel,bloodlabel;
	private Font f;
	private JLabel imglabel,background;
	private JTextField tx1,tx2,txname,txmobile,txemail,txaddress,txgender,txblood,txuser;
	private JPasswordField pass,confirmpass;
	private JButton but1,but2,but3,but4,but5,but6,but7;
	private Cursor cursor;
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel model;
	private String[] columns = {"Name "," Mobile", " Email", " Address", " Gender", " Blood Group"," User Id"};
	private String[] rows = new String[7];

	
	SignUp()
	 
	 {
		 
		 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" SignUp Page");
		
		
		
         JLabel background;
		
		 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
		
		c=this.getContentPane();
	
		
		c.setLayout(null);
		img= new ImageIcon(getClass().getResource("photo//signup.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		c.add(imglabel);
		
		ImageIcon img = new ImageIcon("photo//signupback.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		
		
		
		f=new Font (" Arial",Font.BOLD,14);
		
		cursor =new Cursor(Cursor.HAND_CURSOR);
		
		
		namelabel = new JLabel();
		namelabel.setText (" Name : ");
		namelabel.setBounds(50,80,150,50);
		namelabel.setFont(f);
		namelabel.setForeground(Color.WHITE);
		namelabel.setToolTipText(" Enter Your Name Here ");
		c.add(namelabel);
		background.add(namelabel);
		
		mobilelabel = new JLabel();
		mobilelabel.setText (" Mobile : ");
		mobilelabel.setBounds(50,120,150,50);
		mobilelabel.setFont(f);
		mobilelabel.setForeground(Color.WHITE);
		mobilelabel.setToolTipText(" Enter Your Mobile Here ");
		background.add(mobilelabel);
		
		emaillabel = new JLabel();
		emaillabel.setText (" E-mail : ");
		emaillabel.setBounds(50,160,150,50);
		emaillabel.setFont(f);
		emaillabel.setForeground(Color.WHITE);
		emaillabel.setToolTipText(" Enter Your E-mail Here ");
		background.add(emaillabel);
		
		addresslabel = new JLabel();
		addresslabel.setText (" Address : ");
		addresslabel.setBounds(50,200,150,50);
		addresslabel.setFont(f);
		addresslabel.setForeground(Color.WHITE);
		addresslabel.setToolTipText(" Enter Your Address Here ");
		background.add(addresslabel);
		
		genderlabel = new JLabel();
		genderlabel.setText (" Gender : ");
		genderlabel.setBounds(50,240,150,50);
		genderlabel.setFont(f);
		genderlabel.setForeground(Color.WHITE);
		genderlabel.setToolTipText(" Enter Your Gender Here ");
		background.add(genderlabel);
		
		bloodlabel = new JLabel();
		bloodlabel.setText (" Blood Group : ");
		bloodlabel.setBounds(50,280,150,50);
		bloodlabel.setFont(f);
		bloodlabel.setForeground(Color.WHITE);
		bloodlabel.setToolTipText(" Enter Your Blood Group Here ");
		background.add(bloodlabel);
		
		userlabel = new JLabel();
		userlabel.setText (" User ID : ");
		userlabel.setBounds(50,320,150,50);
		userlabel.setFont(f);
		userlabel.setForeground(Color.WHITE);
		userlabel.setToolTipText(" Enter Your User ID");
		background.add(userlabel);
		
		passlabel=new JLabel();
		passlabel.setText(" Password : ");
		passlabel.setBounds(450,320,150,50);
		passlabel.setFont(f);
		passlabel.setForeground(Color.WHITE);
		passlabel.setToolTipText(" Enter Your Password");
		background.add(passlabel);
		
		confirmpasslabel=new JLabel();
		confirmpasslabel.setText("Re-type Password : ");
		confirmpasslabel.setBounds(400,360,150,50);
		confirmpasslabel.setFont(f);
		confirmpasslabel.setForeground(Color.WHITE);
		confirmpasslabel.setToolTipText(" Enter same Password");
		background.add(confirmpasslabel);
		
		
		
		
		txname=new JTextField();
		txname.setBounds(200,90,200,30);
		txname.setHorizontalAlignment(JTextField.CENTER);
		background.add(txname);
		
		txmobile=new JTextField();
		txmobile.setBounds(200,130,200,30);
		txmobile.setHorizontalAlignment(JTextField.CENTER);
		background.add(txmobile);
		
		txemail=new JTextField();
		txemail.setBounds(200,170,200,30);
		txemail.setHorizontalAlignment(JTextField.CENTER);
		background.add(txemail);
		
		txaddress=new JTextField();
		txaddress.setBounds(200,210,200,30);
		txaddress.setHorizontalAlignment(JTextField.CENTER);
		background.add(txaddress);
		
		txgender=new JTextField();
		txgender.setBounds(200,250,200,30);
		txgender.setHorizontalAlignment(JTextField.CENTER);
		background.add(txgender);
		
		txblood=new JTextField();
		txblood.setBounds(200,290,200,30);
		txblood.setHorizontalAlignment(JTextField.CENTER);
		background.add(txblood);
		
		txuser=new JTextField();
		txuser.setBounds(200,330,200,30);
		txuser.setHorizontalAlignment(JTextField.CENTER);
		background.add(txuser);
		
		pass =new JPasswordField();
		pass.setBounds(550,330,200,30);
		pass.setHorizontalAlignment(JTextField.CENTER);
		background.add(pass);
		
		confirmpass =new JPasswordField();
		confirmpass.setBounds(550,370,200,30);
		confirmpass.setHorizontalAlignment(JTextField.CENTER);
		background.add(confirmpass);
		
		

		
		Border border = BorderFactory.createEmptyBorder(0,0,0,0);
		
		but2=new JButton("Sign Up");
		but2.setBounds(400,500,90,30);
		but2.setCursor(cursor);
		but2.setBorder(border);
		but2.addActionListener(this);
		background.add(but2);
		
		
		backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		but7.setCursor(cursor);
		but7.setBorder(border);
		but7.setBackground(Color.BLACK);
		but7.addActionListener(this);
		background.add(but7);

	  }
	  
	  
	  
	  
	  public void actionPerformed(ActionEvent ae)
	  {
		  
             if(ae.getSource()==but2)
		  {
			  boolean matched = false;
			    String userId= txuser.getText().toString();
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
					// dispose();
					 // this.setVisible(false);
			JOptionPane.showMessageDialog(null, "Already Used this userid,Signup again with unique userid");
			/*  SignUp frame = new SignUp();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);*/
					
				}else{
					
		  String name = txname.getText();
		  String mobile = txmobile.getText();
		  String email = txemail.getText();
		  String address = txaddress.getText();
		  String gender = txgender.getText();
		  String blood = txblood.getText();
		  String user = txuser.getText();
		  String passwor = pass.getText();
		  String copasswor = confirmpass.getText();
		  
		  if (passwor.equals(passwor)&&copasswor.equals(passwor)){
			  
            try{
			FileWriter file = new FileWriter("signup.txt",true); 
			
		    file.write (txuser.getText()+"\t\t\t"+pass.getText()+"\n");
			file.close();  
			JFrame fr = new JFrame();
          //JOptionPane.showMessageDialog(fr, "Signedup Completed, You can now login ");
           //dispose();		  
			
		}

		catch(IOException io)
		{
			System.out.println("An error has just occured! :(");
			io.printStackTrace();
		}

      
	              try{
			FileWriter file = new FileWriter("customersinfo.txt",true); 
			
		   file.write (""+txname.getText()+","+txmobile.getText()+","+txemail.getText()+","+txaddress.getText()+","+txgender.getText()+","+txblood.getText()+","+txuser.getText()+","+pass.getText()+"\n");
			file.close();  
			JFrame fr = new JFrame();
          //JOptionPane.showMessageDialog(fr, "Signedup Completed, You can now login ");
           //dispose();		  
			
		}

		catch(IOException io)
		{
			System.out.println("An error has just occured! :(");
			io.printStackTrace();
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  




		


       try{
			FileWriter file = new FileWriter("signupdetails.txt",true); 
			
			 
			file.write (txname.getText()+"\t\t\t\t\t\t"+txmobile.getText()+"\t\t\t\t\t"+txemail.getText()+"\t\t\t\t\t"+txaddress.getText()+"\t\t\t\t\t\t\t\t\t\t"+txgender.getText()+"\t\t\t"+txblood.getText()+"\t\t\t\t\t"+txuser.getText()+"\t\t\t\t\t"+pass.getText()+"\n");
			file.close();  
			//JFrame fr = new JFrame();
          //JOptionPane.showMessageDialog(null, "Signed Completed, You can now login ");
		

if(name.equals("")&&mobile.equals("")&&email.equals("")&&address.equals("")&&gender.equals("")&&blood.equals("")&&user.equals("")&&passwor.equals(""))
{
	JOptionPane.showMessageDialog(null, "Please Filled up all the details");
}
else{
	   dispose();
	JOptionPane.showMessageDialog(null, "Signed Completed, You can now login ");
	  LoginPage frame = new LoginPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
	
}
		
		}

		catch(IOException io)
		{
			//System.out.println("An error has just occured! :(");
			//io.printStackTrace();
		}					 



			 
			  
			  
		  }else{
			  
			  JOptionPane.showMessageDialog(null, " Enter same password in the password field ");
			  
		  }
		  

					
					
				}
	 
		
		 	  
		  }		
		  else if(ae.getSource()==but7)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure to back !");
					dispose();
			  LoginPage frame = new LoginPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
				
				
				
	}
			
		

	
	
	
	public static void main(String args[])
	{
		
		SignUp frame = new SignUp();
		frame.setVisible(true);
		frame.setResizable(false);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBounds(300,100,800,600);
		//frame.setTitle(" Employee Portal");
		
		
		
		
		
	
		
		
		
	}
}