import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import javax.swing.*;
import java.awt.Container;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.Cursor;
import java.awt.Color;

import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
  

class OrdersPage extends JFrame implements ActionListener {
	
	private ImageIcon icon,img,logoutimg,backimg,homeimg;
	private Container c;
	private JLabel userlabel,passlabel,l;
	private Font fo;
	private JLabel imglabel,background;
	private JTextField tx1,tx2;
	private JPasswordField pass;
	private JButton but1,but2,but3,but4,but5,but6,but7,but8;
	private Cursor cursor;
	private DefaultTableModel model;
	private JTable table;
	JFrame f;
	JTextArea textArea;
	 JPanel p;

	
	
	
  
OrdersPage(){
	


  
  
      c=this.getContentPane();
	  	//c.setLayout(null);
		
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Orders Details");
		
		
		
	 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());

        img= new ImageIcon(getClass().getResource("photo//ordersportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		c.add(imglabel);
		
		
		
		
		
		
		
  
        p = new JPanel();

     
	 	     but8 = new JButton("Change Background");
         but8.setBounds(550, 500, 200, 30);
		 	but8.addActionListener(this);
         c.add(but8);
		 backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		but7.setCursor(cursor);
		but7.addActionListener(this);
		c.add(but7);
					homeimg = new ImageIcon(getClass().getResource("photo//homeimg.png"));
		
		but6=new JButton(homeimg);
		but6.setBounds(5,5,40,30);
		but6.setCursor(cursor);
		but6.addActionListener(this);
		c.add(but6);
		
		
		
		
        JTextArea textArea = new JTextArea();
		
        JScrollPane scrollPane = new JScrollPane(textArea);
		
		scrollPane.setBounds(100,50,600,400);
		
        try {
    
            textArea.read(new InputStreamReader(Objects.requireNonNull(
                    getClass().getResourceAsStream("/orderdetails.txt"))), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		 this.setLayout(new BorderLayout());
		// p.setPreferredSize(new Dimension(600, 400));
	 
	    add(scrollPane,BorderLayout.CENTER);
	 
   
           
           add(p);
	
	
}



 public void actionPerformed(ActionEvent ae){
				   
				    if(ae.getSource()==but7)	{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
				dispose();
			
			  EmployeePortal frame = new EmployeePortal();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				
				}
						    else if(ae.getSource()==but6)	{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
				dispose();
			
			  EmployeePortal frame = new EmployeePortal();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				
				}
				
				else if (ae.getSource()==but8){
							Color color = JColorChooser.showDialog(null,"Select a Color", Color.BLACK);
				        p.setBackground(color);
				}
	 }





    public static void main(String[] args)
    {
     	OrdersPage frame = new OrdersPage();
		frame.setVisible(true);
		frame.setResizable(false);  
    }
}