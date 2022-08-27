import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.Cursor;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class HomePage extends JFrame implements ActionListener {
   private JLabel label,imglabel,background,txlabel;
   private ImageIcon icon,img,logoutimg,backimg;
   private Container c;
   private Cursor cursor;
   private JButton but1,but2,but3,but4,but5,but6,but7;
	 
	 
	 
   public HomePage() {
	
	   
	   icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
		
		c=this.getContentPane();
	
		
		//c.setLayout(null);
		/*
		img= new ImageIcon(getClass().getResource("photo//smarttech.png"));
		imglabel = new JLabel(img);
		imglabel.setBounds(300,5,img.getIconWidth(),img.getIconHeight());
       
		c.add(imglabel);
		  */
		ImageIcon img = new ImageIcon("photo//home.png");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,800,600);
		add(background);

      label= new JLabel("  Welcome to Our Store  ");
      label.setFont(new Font("Arial", 0, 25));
	  label.setBounds(240,200,600,50);
	  label.setForeground(Color.WHITE);
      background.add(label);
      Timer t = new Timer(300, this); // set a timer
      t.start();
	  
	  
	    txlabel = new JLabel();
		txlabel.setText (" Press Enter to Proceed  ");
		txlabel.setBounds(50,400,500,50);
		txlabel.setFont(new Font("Arial", 0, 18));
		txlabel.setForeground(Color.WHITE);	
		//	b7.setForeground(new Color(0x000000));
		background.add(txlabel);
	  
	  
	  
	  
		cursor =new Cursor(Cursor.HAND_CURSOR); 
	   Border border = BorderFactory.createEmptyBorder(0,0,0,0);		
	  
	  	but6=new JButton(" Enter ");
		but6.setBounds(700,510,80,30);
		but6.setCursor(cursor);
		but6.setBorder(border);
		but6.addActionListener(this);
		but6.setBackground(Color.GRAY);
		but6.setForeground(Color.WHITE);
	    but6.setFocusPainted(false);		
		background.add(but6);
	  
	  
	  
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,100,800,600);
		this.setTitle(" Smart Tech");
      setVisible(true);
     setLocationRelativeTo(null);
     
   }
   
   
   
   
   public void actionPerformed(ActionEvent e) {
      String oldText = label.getText();
      String newText= oldText.substring(1)+ oldText.substring(0,1);
      label.setText(newText);
	  
	   if(e.getSource()==but6)
				{
					//JOptionPane.showMessageDialog(null, " Are you Sure Want to back !");
					dispose();
			  LoginPage frame = new LoginPage();
		      frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
				}
	  
	  
   }
   
   
   
   
   public static void main (String[] args) {
  
	  HomePage frame = new HomePage();
		frame.setVisible(true);
		frame.setResizable(false);
   }
}