import javax.swing.*;
import java.awt.Container;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Cursor;
import java.awt.Color;

import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class StoreDetails extends JFrame implements ActionListener{
	
		private ImageIcon icon,img,logoutimg,backimg,homeimg;
	private Container c;
	private JLabel userlabel,passlabel;
	private Font f;
	private JLabel imglabel,background;
	private JTextField tx1,tx2;
	private JPasswordField pass;
	private JButton but1,but2,but3,but4,but5,but6,but7,but8,button;
	private Cursor cursor;
	private DefaultTableModel model;
	private JTable table;



     public StoreDetails(){
		 
		 
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Store Details ");
			c=this.getContentPane();
			 c. setLayout(null);
		

				
				
				 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
		
		
			img= new ImageIcon(getClass().getResource("photo//storedetailsportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		c.add(imglabel);
		
		ImageIcon img = new ImageIcon("photo//storedetailsback.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		
		
		
		f=new Font (" Arial",Font.BOLD,14);
		
		cursor =new Cursor(Cursor.HAND_CURSOR);



         Object row[][] = {
			                {"XYZ Tech","25","5"},
			           
                      };
					  
					  
					  
    Object column[] = {" Store name","Total Employee"," Total Branch"};
         table = new JTable(row, column);

         JScrollPane js = new JScrollPane(table);
         js.setBounds(100,100,600,100);
		     background.add(js);
			
		 
		   but8 = new JButton("Employee List");
         but8.setBounds(550, 480, 200, 30);
		 	but8.addActionListener(this);
         background.add(but8);
		
		    but2 = new JButton("Branch List");
         but2.setBounds(300, 480, 200, 30);
		 	but2.addActionListener(this);
         background.add(but2);
		 
		backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		but7.setCursor(cursor);
		but7.addActionListener(this);
		background.add(but7);
			homeimg = new ImageIcon(getClass().getResource("photo//homeimg.png"));
		
		but6=new JButton(homeimg);
		but6.setBounds(5,5,40,30);
		but6.setCursor(cursor);
		but6.addActionListener(this);
		background.add(but6);
		 
		 
     }
	 

	           public void actionPerformed(ActionEvent ae){
				   
				    if(ae.getSource()==but8){
						
								dispose();
			  EmployeeListFEmploy frame = new EmployeeListFEmploy();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
						
					}
					else if(ae.getSource()==but2)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
			  BranchList frame = new BranchList();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
					else if(ae.getSource()==but7)
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
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
			  EmployeePortal frame = new EmployeePortal();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}

					
					}
				   
     public static void main(String[] args){
       
		 
		 StoreDetails frame = new StoreDetails();
		frame.setVisible(true);
		frame.setResizable(false);
		 
		 
		 
     }
    }