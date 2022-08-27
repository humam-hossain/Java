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

public class BranchList extends JFrame implements ActionListener{
	
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



     public BranchList(){
		 
		 
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Branches ");
			c=this.getContentPane();
			 c. setLayout(null);
		

				
			 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
		
		
			img= new ImageIcon(getClass().getResource("photo//branchportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		c.add(imglabel);
		
		ImageIcon img = new ImageIcon("photo//EmployeeListback.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);
		
		
		
		f=new Font (" Arial",Font.BOLD,14);
		
		cursor =new Cursor(Cursor.HAND_CURSOR);



         Object row[][] = {
			                {"Smart Tech","20/6 Dhanmondi","0123456789","Dhaka","Dhaka"},
			                {"Smart Tech","D block 0987654321","Bashundhara","Dhaka","Dhaka"},
			                {"Smart Tech","Uttara","1234567890","Dhaka","Dhaka"},
			                {"Smart Tech","Mirpur-12","0234567891","Dhaka","Dhaka"},
			                {"Smart Tech","Gulshan","2345678901","Dhaka","Dhaka"}
			              
			        
		
			           
                      };
					  
					  
					  
    Object column[] = {" Store Name","Address"," Mobile","District","Division"};
         table = new JTable(row, column);

         JScrollPane js = new JScrollPane(table);
         js.setBounds(100,100,650,300);
		     background.add(js);
			
		 

		 
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
				   
	
			 if(ae.getSource()==but7)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
			  StoreDetails frame = new StoreDetails();
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
       
		 
		 BranchList frame = new BranchList();
		frame.setVisible(true);
		frame.setResizable(false);
		 
		 
		 
     }
    }