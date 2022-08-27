import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class AddShippers extends JFrame implements ActionListener{

    private String name;
    private String mobile;
    private String address;
    private String email;

    private JButton homeb;
    private JButton backb;
    private JButton logoutb;
    private JButton addb;
    private JButton clearb;

    private ImageIcon backimage;
    private ImageIcon backimage2;
    private ImageIcon homeimage;
    private ImageIcon logoutimage;
    private ImageIcon icon;

    private JLabel backlabel;
    private JLabel backlabel2;
    private JLabel homelabel;
    private JLabel logoutlabel;

    private JTextField nametxf;
    private JTextField mobiletxf;
    private JTextField addresstxf;
    private JTextField emailtxf;

    private JLabel namel;
    private JLabel mobilel;
    private JLabel addressl;
    private JLabel emaill;
    AddShippers(){
   icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());
        namel=new JLabel("Name");
        namel.setBounds(200,80,100,50);
			namel.setForeground(Color.WHITE);

        mobilel=new JLabel("Mobile");
        mobilel.setBounds(200,160,100,50);
		mobilel.setForeground(Color.WHITE);
		

        addressl=new JLabel("Address");
        addressl.setBounds(200,240,100,50);
		addressl.setForeground(Color.WHITE);

        emaill=new JLabel("Email");
        emaill.setBounds(200,320,100,50);
		emaill.setForeground(Color.WHITE);

        backimage=new ImageIcon("photo/backgimg.png");

        backlabel=new JLabel(backimage);
        backlabel.setBounds(0,0,800,600);

        homeimage=new ImageIcon("photo/homeimg.png");
        homelabel=new JLabel(homeimage);
        homelabel.setBounds(0,0,100,100);

        backimage2=new ImageIcon("photo/backimg.png");
        backlabel2=new JLabel(backimage2);
        backlabel2.setBounds(20,500,50,50);

        logoutimage=new ImageIcon("photo/logout.png");
        logoutlabel=new JLabel(logoutimage);
        logoutlabel.setBounds(720,200,50,50);

        nametxf=new JTextField();
        nametxf.setBounds(400,80,200,50);
        
        mobiletxf=new JTextField();
        mobiletxf.setBounds(400,160,200,50);
        
        addresstxf=new JTextField();
        addresstxf.setBounds(400,240,200,50);
        
        emailtxf=new JTextField();
        emailtxf.setBounds(400,320,200,50);

        addb=new JButton();
        addb.setText("ADD");
        addb.setBounds(200,400,150,50);
        addb.setFocusable(false);
        addb.addActionListener(this);

        clearb=new JButton();
        clearb.setText("Clear All");
        clearb.setBounds(400,400,150,50);
        clearb.setFocusable(false);
        clearb.addActionListener(this);

        homeb=new JButton();
        homeb.setBounds(20,20,50,50);
        homeb.setOpaque(false); // Must add
        homeb.setContentAreaFilled(false);
        homeb.setFocusable(false);
        homeb.setBorderPainted(true);
        homeb.setBorder(null);
        homeb.add(homelabel);
        homeb.addActionListener(this);

        backb=new JButton();
        backb.setBounds(20,500,50,50);
        backb.setOpaque(false); // Must add
        backb.setContentAreaFilled(false);
        backb.setFocusable(false);
        backb.setBorderPainted(true);
        backb.setBorder(null);
        backb.add(backlabel2);
        backb.addActionListener(this);

        logoutb=new JButton();
        logoutb.setBounds(720,20,50,50);
        logoutb.setOpaque(false); // Must add
        logoutb.setContentAreaFilled(false);
        logoutb.setFocusable(false);
        logoutb.setBorderPainted(true);
        logoutb.setBorder(null);
        logoutb.add(logoutlabel);
        logoutb.addActionListener(this);
        
        this.setTitle("Add Shipper");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(300,100,800,600);
        this.setResizable(false);
        this.add(namel);
        this.add(mobilel);
        this.add(addressl);
        this.add(emaill);
        this.add(nametxf);
        this.add(mobiletxf);
        this.add(addresstxf);
        this.add(emailtxf);
        this.add(addb);
        this.add(clearb);
        this.add(homeb);
        this.add(backb);
        this.add(logoutb);
        this.setVisible(true);
        this.add(backlabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name=nametxf.getText();
        mobile=mobiletxf.getText();
        address=addresstxf.getText();
        email=emailtxf.getText();
        if (e.getSource()==homeb){
            AdminFrame a1=new AdminFrame();
        }
        if (e.getSource()==backb){
            Shippers sh1=new Shippers();
        }
        if (e.getSource()==logoutb){
            LoginPage em1=new LoginPage();
        }
        if(e.getSource()==addb){
            try{
                FileWriter file = new FileWriter("shippers.txt",true);
                file.write (name+","+mobile+","+address+","+email+"\n");
                file.close();  
                JFrame fr = new JFrame();	   
            }
            catch(IOException io){
                System.out.println("An error has just occured! :(");
            }
            addb.setEnabled(false);

        }
        if(e.getSource()==clearb){
            nametxf.setText("");
            mobiletxf.setText("");
            addresstxf.setText("");
            emailtxf.setText("");
            addb.setEnabled(true);
        }
        
    }

    public static void main(String [] args){
        AddShippers adc1=new AddShippers();
    }
    
}