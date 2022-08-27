import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Addemployee extends JFrame implements ActionListener{

    private ImageIcon backimage;
    private ImageIcon backimage2;
    private ImageIcon homeimage;
    private ImageIcon icon;

    private JLabel backlabel;
    private JLabel backlabel2;
    private JLabel homelabel;

    private JButton home;
    private JButton backButton;

    private String usrname;
    private char[] tpassword;
    private char[] tpassword2;
    private String password;
    private String password2;
    private String name;
    private String mobile;
    private String address;
    private String email;
    private String bloodgroup;
    private String gender="Male";

    private JButton addb;
    private JButton clearb;
    private JRadioButton m;
    private JRadioButton f;
    private JRadioButton o;
    ButtonGroup bgroup;


    private JTextField usrnametxf;
    private JPasswordField tpasswordtxf;
    private JPasswordField tpasswordtxf2;
    private JTextField nametxf;
    private JTextField mobiletxf;
    private JTextField addresstxf;
    private JTextField emailtxf;
    private JTextField bloodgrouptxf;
    //private JTextField gendertxf;

    private JLabel usrnamel;
    private JLabel tpasswordl;
    private JLabel tpasswordl2;
    private JLabel namel;
    private JLabel mobilel;
    private JLabel addressl;
    private JLabel emaill;
    private JLabel bloodgroupl;
    private JLabel genderl;

    Addemployee(){
		
		   icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());

        backimage=new ImageIcon("photo/backgimg.png");

        backlabel=new JLabel(backimage);
        backlabel.setBounds(0,0,800,600);

        homeimage=new ImageIcon("photo/homeimg.png");
        homelabel=new JLabel(homeimage);
        homelabel.setBounds(20,20,50,50);

        backimage2=new ImageIcon("photo/backimg.png");
        backlabel2=new JLabel(backimage2);
        backlabel2.setBounds(720,500,50,50);

        home=new JButton();
        home.setBounds(20,20,50,50);
        home.setOpaque(false); // Must add
        home.setContentAreaFilled(false);
        home.setFocusable(false);
        home.setBorderPainted(true);
        home.setBorder(null);
        home.add(homelabel);
        home.addActionListener(this);

        backButton=new JButton();
        backButton.setBounds(720,500,50,50);
        backButton.setOpaque(false); // Must add
        backButton.setContentAreaFilled(false);
        backButton.setFocusable(false);
        backButton.setBorderPainted(true);
        backButton.setBorder(null);
        backButton.add(backlabel2);
        backButton.addActionListener(this);

        usrnamel=new JLabel("Username");
        usrnamel.setBounds(100,50,300,30);

        tpasswordl=new JLabel("Password");
        tpasswordl.setBounds(100,90,300,30);

        tpasswordl2=new JLabel("Password");
        tpasswordl2.setBounds(100,130,300,30);

        namel=new JLabel("Name");
        namel.setBounds(100,170,300,30);

        mobilel=new JLabel("Mobile");
        mobilel.setBounds(100,210,300,30);

        addressl=new JLabel("Address");
        addressl.setBounds(100,250,300,30);

        emaill=new JLabel("Email");
        emaill.setBounds(100,290,300,30);

        bloodgroupl=new JLabel("Bloodgroup");
        bloodgroupl.setBounds(100,330,300,30);

        genderl=new JLabel("Gender");
        genderl.setBounds(100,370,300,30);

        usrnametxf=new JTextField();
        usrnametxf.setBounds(400,50,300,30);
        
        tpasswordtxf=new JPasswordField();
        tpasswordtxf.setBounds(400,90,300,30);

        tpasswordtxf2=new JPasswordField();
        tpasswordtxf2.setBounds(400,130,300,30);
        
        nametxf=new JTextField();
        nametxf.setBounds(400,170,300,30);
        
        mobiletxf=new JTextField();
        mobiletxf.setBounds(400,210,300,30);
        
        addresstxf=new JTextField();
        addresstxf.setBounds(400,250,300,30);
        
        emailtxf=new JTextField();
        emailtxf.setBounds(400,290,300,30);
        
        bloodgrouptxf=new JTextField();
        bloodgrouptxf.setBounds(400,330,300,30);
        
        //gendertxf=new JTextField();
        //gendertxf.setBounds(400,400,300,30);

        backimage=new ImageIcon("backimg.png");
        backlabel=new JLabel(backimage);
        backlabel.setBounds(0,0,800,600);

        addb=new JButton("ADD");
        addb.setBounds(100,450,200,60);
        addb.setFocusable(false);
        addb.addActionListener(this);

        clearb=new JButton("Clear all");
        clearb.setBounds(350,450,200,60);
        clearb.setFocusable(false);
        clearb.addActionListener(this);

        m=new JRadioButton("Male");
        m.setBounds(400,370,100,30);
        f=new JRadioButton("Female");
        f.setBounds(500,370,100,30);
        o=new JRadioButton("others");
        o.setBounds(600,370,100,30);

        bgroup =new ButtonGroup();
        
        bgroup.add(m);
        bgroup.add(f);
        bgroup.add(o);

        m.addActionListener(this);
        f.addActionListener(this);
        o.addActionListener(this);

        this.setTitle("ADD Employees");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(300,100,800,600);
        this.setResizable(false);
        this.add(home);
        this.add(backButton);
        this.add(homelabel);
        this.add(backlabel);
        this.add(usrnamel);
        this.add(tpasswordl);
        this.add(tpasswordl2);
        this.add(namel);
        this.add(mobilel);
        this.add(addressl);
        this.add(emaill);
        this.add(bloodgroupl);
        this.add(genderl);
        this.add(usrnametxf);
        this.add(tpasswordtxf);
        this.add(tpasswordtxf2);
        this.add(nametxf);
        this.add(mobiletxf);
        this.add(addresstxf);
        this.add(emailtxf);
        this.add(bloodgrouptxf);
        //this.add(gendertxf);
        this.add(addb);
        this.add(clearb);
        this.add(m);
        this.add(f);
        this.add(o);
        this.setVisible(true);
        this.add(backlabel);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==home){
            AdminFrame a1=new AdminFrame();
        }
        if (e.getSource()==backButton){
            Employees em1=new Employees();
        }
        usrname=usrnametxf.getText();
        tpassword=tpasswordtxf.getPassword();
        tpassword=tpasswordtxf2.getPassword();
        password =new String(tpassword);
        password2 =new String(tpassword);
        name=nametxf.getText();
        mobile=mobiletxf.getText();
        address=addresstxf.getText();
        email=emailtxf.getText();
        bloodgroup=bloodgrouptxf.getText();
        if (e.getSource()==m){
            gender="Male";
        }
        if (e.getSource()==f){
            gender="Female";
        }
        if (e.getSource()==o){
            gender="Others";
        }if(e.getSource()==addb){
            boolean matched = false;
            try{
                FileReader fir = new FileReader("employee.txt");
                BufferedReader bfr = new BufferedReader(fir);
                String line;
                while((line=bfr.readLine())!=null ){
                    if(line.equals(usrname+","+password)){
                        matched=true;
                        break;
                    } 
                }
                fir.close();
            }
            catch(Exception ev){
                System.out.println("System error");
            }
            if(matched){
                JOptionPane.showMessageDialog(null, "Already Used this userid,Signup again with unique userid");
            }
            else{
                  
        if (password.equals(password)&&password2.equals(password)){
            try{
                FileWriter file = new FileWriter("employee.txt",true);
                file.write (usrname+","+password+"\n");
                file.close();  
                JFrame fr = new JFrame();	   
            }
            catch(IOException io){
                //System.out.println("An error has just occured! :(");
                //io.printStackTrace();
            }




			
            try{
                FileWriter file = new FileWriter("employeedetails.txt",true); 
                file.write(""+name+","+mobile+","+address+","+email+","+bloodgroup+","+gender+"\n");
                file.close();
               
            }
            catch(IOException io){
                System.out.println("An error has just occured! :(");
            }




			
            try{
                FileWriter file = new FileWriter("employeedetailsforemployee.txt",true); 
                file.write(""+usrname+","+password+","+name+","+mobile+","+address+","+email+","+bloodgroup+","+gender+"\n");
                file.close();
                if(usrname.equals("")&&tpassword.equals("")&&tpassword2.equals("")&&name.equals("")&&mobile.equals("")&&email.equals("")&&address.equals("")&&gender.equals("")&&bloodgroup.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Filled up all the details");
                }
                else{
                    dispose();
                    JOptionPane.showMessageDialog(null, "Signed Completed, You can now login ");
                    Employees e1=new Employees();
                    e1.setVisible(true);
                    e1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    e1.setBounds(300,100,800,600);
                    e1.setResizable(false);
                }
            }
            catch(IOException io){
                System.out.println("An error has just occured! :(");
            }




			
        }
        else{
            
            JOptionPane.showMessageDialog(null, " Enter same password in the password field ");
            
        }       
    } 
        }
        if (e.getSource()==clearb){
        usrnametxf.setText("");
        tpasswordtxf.setText("");
        tpasswordtxf2.setText("");
        nametxf.setText("");
        mobiletxf.setText("");
        addresstxf.setText("");
        emailtxf.setText("");
        bloodgrouptxf.setText("");
        }
        
        
        
        
    }

    public static void main(String [] args){
        Addemployee ade1 =new Addemployee();
    }
    
}
