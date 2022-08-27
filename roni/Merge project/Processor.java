import javax.swing.*;    
import java.awt.event.*;   
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
public class Processor extends JFrame implements ActionListener{   
		private ImageIcon icon,img,logoutimg,backimg;
	private Container fr;
	private JLabel userlabel,passlabel;
	private Font f;
	private JLabel imglabel,background;
	private JTextField tx1,tx2;
	private JPasswordField pass;
	private JButton but1,but2,but3,but4,but5,but6,but7,but8,button;
	private Cursor cursor;
	private DefaultTableModel model;
	private JTable table; 
//JFrame fr;    
JMenuBar mb;    
JMenu laptops,accessories;    
JMenuItem asus,hp,msi,dell,lenovo,acer,mouse,keyboard,graphics,processor,motherboard,webcam,pendrive,monitor; 
	
JTextArea ta;
    
Processor(){    
//fr=new JFrame(); 
	fr=this.getContentPane();
	
		 		  
asus=new JMenuItem("Asus");    
hp=new JMenuItem("Hp");    
msi=new JMenuItem("Msi");    
dell=new JMenuItem("Dell");    
lenovo=new JMenuItem("Lenovo");    
acer=new JMenuItem("Acer");  
mouse=new JMenuItem("Mouse");  
keyboard=new JMenuItem("Keyboard");  
graphics=new JMenuItem("Graphichs crad");  
motherboard=new JMenuItem("Motherboard");  
processor=new JMenuItem("Processor");  
pendrive=new JMenuItem("Pendrive");  
webcam=new JMenuItem("Webcam");  
monitor=new JMenuItem("Monitor");  
  
asus.addActionListener(this);    
hp.addActionListener(this);    
msi.addActionListener(this);    
dell.addActionListener(this);    
lenovo.addActionListener(this);    
acer.addActionListener(this); 
mouse.addActionListener(this); 
keyboard.addActionListener(this); 
graphics.addActionListener(this); 
motherboard.addActionListener(this); 
processor.addActionListener(this); 
pendrive.addActionListener(this); 
webcam.addActionListener(this); 
monitor.addActionListener(this); 
 
mb=new JMenuBar(); 
   
laptops=new JMenu("Laptops"); 
accessories=new JMenu("Accessories"); 

laptops.add(asus);laptops.add(hp);laptops.add(msi);laptops.add(dell);    
laptops.add(lenovo);laptops.add(acer);  
accessories.add(mouse);
accessories.add(keyboard);
accessories.add(graphics);
accessories.add(motherboard);
accessories.add(processor);
accessories.add(pendrive);
accessories.add(webcam);
accessories.add(monitor);


mb.add(laptops);  
mb.add(accessories);  
		 
	 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
img= new ImageIcon(getClass().getResource("photo//processorportal.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(350,5,img.getIconWidth(),img.getIconHeight());
		fr.add(imglabel);




  Object row[][] = {
			                {"Processor-#001","Intel core i3 - 2rd gen"," 4,000/="},
			                {"Processor-#002","Intel core i3 - 3rd gen"," 5,000/="},
			                {"Processor-#003","Intel core i3 - 5th gen"," 6,000/="},
			                {"Processor-#004","Intel core i3 - 7th gen"," 12,000/="},
			                {"Processor-#005","Intel core i3 - 8th gen"," 15,000/="},
			                {"Processor-#006","Intel core i3 - 9th gen"," 15,000/="},
			                {"Processor-#007","Intel core i3 - 10th gen"," 16,000/="},
			                {"Processor-#008","Intel core i3 - 11th gen"," 16,000/="},
			                {"Processor-#009","Intel core i3 - 12th gen"," 18,000/="},
			                {"Processor-#010","Intel core i5 - 3rd gen"," 8,000/="},
			                {"Processor-#011","Intel core i5 - 5th gen"," 11,000/="},
			                {"Processor-#012","Intel core i5 - 7th gen"," 12,000/="},
			                {"Processor-#013","Intel core i5 - 8th gen"," 12,000/="},
			                {"Processor-#014","Intel core i5 - 10th gen"," 16,000/="},
			                {"Processor-#015","Intel core i5 - 11th gen"," 20,000/="},
			                {"Processor-#016","Intel core i5 - 12th gen"," 25,000/="},
			                {"Processor-#017","Intel core i7 - 10th gen"," 20,000/="},
			                {"Processor-#018","Intel core i7 - 11th gen"," 30,000/="},
			                {"Processor-#019","Intel core i7 - 12th gen"," 40,000/="},
			                {"Processor-#020","Intel core i9 - 12th gen"," 45,000/="},
			                {"Processor-#021","Intel core i9 - 11th gen"," 40,000/="},
		                    {"Processor-#022","Intel core i9 - 10th gen"," 40,000/="},
							{"Processor-#023","AMD Ryzen 3 4100"," 10,000/="},
							{"Processor-#024","AMD Ryzen 5 4100"," 14,000/="},
							{"Processor-#025","AMD Ryzen 5 4500"," 15,000/="},
							{"Processor-#026","AMD Ryzen 5 5100"," 16,000/="},
							{"Processor-#027","AMD Ryzen 5 5600"," 20,000/="},
							{"Processor-#028","AMD Ryzen 5 5800"," 22,000/="},
							{"Processor-#029","AMD Ryzen 5 5900"," 25,000/="},
							{"Processor-#029","AMD Ryzen 7 5900"," 35,000/="},
							{"Processor-#029","AMD Ryzen 7 5600"," 20,000/="},
							{"Processor-#029","AMD Ryzen 7 5800"," 30,000/="}

			              
			               
                      };
					  
					  
					  
    Object column[] = {"Product Code","Product Name"," Price"};
         table = new JTable(row, column);

         JScrollPane js = new JScrollPane(table);
         js.setBounds(50,50,700,450);
		     fr.add(js);
			 
			 		   but8 = new JButton("Change Background");
         but8.setBounds(550, 500, 200, 30);
		 	but8.addActionListener(this);
         fr.add(but8);
		 
		backimg = new ImageIcon(getClass().getResource("photo//backimg.png"));
		
		but7=new JButton(backimg);
		but7.setBounds(5,510,40,30);
		but7.setCursor(cursor);
		but7.addActionListener(this);
		fr.add(but7);







      
fr.add(mb);   
this.setJMenuBar(mb);  
fr.setLayout(null);    
this.setBounds(300,100,800,600);    
fr.setVisible(true);
this.setResizable(false);    
}   

  
	           public void actionPerformed(ActionEvent ae){
				   
				    if(ae.getSource()==but8){
						
						Color color = JColorChooser.showDialog(null,"Select a Color", Color.BLACK);
				        fr.setBackground(color);
						
					}
					else if(ae.getSource()==but7)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
				LaptopPage frame = new LaptopPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
					
			
				}
				
					else if(ae.getSource()==asus){
						dispose();
						 Asus frame = new Asus();
						  frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
						
					}
								 else if(ae.getSource()==hp)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Hp frame = new Hp();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==msi)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Msi frame = new Msi();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==dell)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Dell frame = new Dell();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==lenovo)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Lenovo frame = new Lenovo();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
						   else if(ae.getSource()==acer)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Acer frame = new Acer();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
								   else if(ae.getSource()==mouse)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Mouse frame = new Mouse();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==keyboard)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Keyboard frame = new Keyboard();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==motherboard)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Motherboard frame = new Motherboard();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==processor)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Processor frame = new Processor();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==webcam)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Webcam frame = new Webcam();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
									   else if(ae.getSource()==pendrive)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Pendrive frame = new Pendrive();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
											   else if(ae.getSource()==graphics)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Graphics frame = new Graphics();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
											   else if(ae.getSource()==monitor)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to go to EmployeePortal !");
					dispose();
				Monitor frame = new Monitor();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false); 
				}
				
		}
    

     
public static void main(String[] args) {    
    Processor frame = new Processor();
			frame.setVisible(true);
		frame.setResizable(false);
  
	
}    
} 