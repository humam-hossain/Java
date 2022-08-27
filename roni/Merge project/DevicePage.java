import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class DevicePage extends JFrame implements ActionListener

{
	private ImageIcon icon,img,logoutimg,backimg,homeimg;
	private Container c;
	private JLabel userlabel,passlabel;
	private Font f;
	private JLabel imglabel,background;
	private JTextField tx1,tx2;
	private JPasswordField pass;
	private JButton but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15;
	private Cursor cursor;

	
	DevicePage()
	 
	 {
		 
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Componens Page");
		
		
		
         JLabel background;
		 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
		
		c=this.getContentPane();
	
		
		c.setLayout(null);
		img= new ImageIcon(getClass().getResource("photo//Componentsportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		c.add(imglabel);
		
		ImageIcon img = new ImageIcon("photo//employeepageback.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		
		
		
		f=new Font (" Arial",Font.BOLD,14);
		
		cursor =new Cursor(Cursor.HAND_CURSOR);
		
		but1=new JButton("Laptop");
		but1.setBounds(100,200,150,30);
		but1.setCursor(cursor);
		but1.addActionListener(this);
		background.add(but1);
		
		but2=new JButton("Mouse");
		but2.setBounds(300,200,150,30);
		but2.setCursor(cursor);
		but2.addActionListener(this);
		background.add(but2);
		
		but3=new JButton("KeyBoard");
		but3.setBounds(550,200,150,30);
		but3.setCursor(cursor);
		//but3.setBackground(Color.PINK);
		but3.addActionListener(this);
		background.add(but3);
		
		but4=new JButton("Graphics Card");
		but4.setBounds(100,300,150,30);
		but4.setCursor(cursor);
		//but4.setBackground(Color.PINK);
		but4.addActionListener(this);
		background.add(but4);
		
		but5=new JButton("PenDrive");
		but5.setBounds(300,300,150,30);
		but5.setCursor(cursor);
		//but5.setBackground(Color.PINK);
		but5.addActionListener(this);
		background.add(but5);
		
		but8=new JButton("Monitor");
		but8.setBounds(550,300,150,30);
		but8.setCursor(cursor);
		//but5.setBackground(Color.PINK);
		but8.addActionListener(this);
		background.add(but8);
		
		but9=new JButton("Web Cam");
		but9.setBounds(100,400,150,30);
		but9.setCursor(cursor);
		//but5.setBackground(Color.PINK);
		but9.addActionListener(this);
		background.add(but9);
		
		but10=new JButton("MotherBoard");
		but10.setBounds(300,400,150,30);
		but10.setCursor(cursor);
		//but5.setBackground(Color.PINK);
		but10.addActionListener(this);
		background.add(but10);
		
		but11=new JButton("Processor");
		but11.setBounds(550,400,150,30);
		but11.setCursor(cursor);
		//but5.setBackground(Color.PINK);
		but11.addActionListener(this);
		background.add(but11);
		
			
		
		
		homeimg = new ImageIcon(getClass().getResource("photo//homeimg.png"));
		
		but6=new JButton(homeimg);
		but6.setBounds(5,5,40,30);
		but6.setCursor(cursor);
		but6.addActionListener(this);
		background.add(but6);
		
		backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		 but7.setOpaque(false);
		but7.setCursor(cursor);
		but7.addActionListener(this);
		background.add(but7);
	
		
	  
	  
	  }
	  
	  public void actionPerformed(ActionEvent ae){
		  

		    if(ae.getSource()==but7)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
				EmployeePortal frame = new EmployeePortal();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
				   else if(ae.getSource()==but6)
				{
				//	JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
				EmployeePortal frame = new EmployeePortal();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
					   else if(ae.getSource()==but1)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
					LaptopPage frame = new LaptopPage();
		     frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
						   else if(ae.getSource()==but2)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
					Mouse frame = new Mouse();
		     frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
								   else if(ae.getSource()==but3)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
					Keyboard frame = new Keyboard();
		     frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
		  else if(ae.getSource()==but4)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
					Graphics frame = new Graphics();
		     frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
				else if(ae.getSource()==but5)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
					Pendrive frame = new Pendrive();
		     frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
					else if(ae.getSource()==but8)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
					Monitor frame = new Monitor();
		     frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
					else if(ae.getSource()==but9)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
					Webcam frame = new Webcam();
		     frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
					else if(ae.getSource()==but10)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
					Motherboard frame = new Motherboard();
		     frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
					else if(ae.getSource()==but11)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal Page !");
					dispose();
					Processor frame = new Processor();
		     frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
				
				
				
				
				
		
				
				
			}
			
		
	
	
	
	
	public static void main(String args[])
	{
		
		DevicePage frame = new DevicePage();
		frame.setVisible(true);
		frame.setResizable(false);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBounds(300,100,800,600);
		//frame.setTitle(" Employee Portal");
	
		
		
		
	}
}