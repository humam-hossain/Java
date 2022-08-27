import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminFrame extends JFrame implements ActionListener{

    private JButton home;
    private JButton backButton;
    private JButton logout;
    //private JButton myInfo;
    private JButton branches;
    private JButton employees;
    //private JButton customars;
    private JButton clients;
    private JButton shippers;
    

    private ImageIcon backimage;
    private ImageIcon backimage2;
    private ImageIcon homeimage;
    private ImageIcon logoutimage;
    private ImageIcon icon;

    private JLabel backlabel;
    private JLabel backlabel2;
    private JLabel homelabel;
    private JLabel logoutlabel;

    AdminFrame(){
       
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
        backlabel2.setBounds(20,500,50,50);

        logoutimage=new ImageIcon("photo/logout.png");
        logoutlabel=new JLabel(logoutimage);
        logoutlabel.setBounds(700,500,50,50);

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
        backButton.setBounds(20,500,50,50);
        backButton.setOpaque(false); // Must add
        backButton.setContentAreaFilled(false);
        backButton.setFocusable(false);
        backButton.setBorderPainted(true);
        backButton.setBorder(null);
        backButton.add(backlabel2);
        backButton.addActionListener(this);

        logout=new JButton("Logout");
        logout.setBounds(720,500,50,50);
        logout.setOpaque(false); // Must add
        logout.setContentAreaFilled(false);
        logout.setFocusable(false);
        logout.setBorderPainted(true);
        logout.setBorder(null);
        logout.add(logoutlabel);
        logout.addActionListener(this);

        /*myInfo =new JButton();
        myInfo.setText("MY Info");
        myInfo.setBounds(50,100,200,50);
        myInfo.addActionListener(this);
        myInfo.setFocusable(false);*/

        branches = new JButton();
        branches.setText("Branches");
        branches.setBounds(150,150,200,50);
        branches.addActionListener(this);
        branches.setFocusable(false);

        employees=new JButton();
        employees.setText("Employee");
        employees.setBounds(450,150,200,50);
        employees.addActionListener(this);
        employees.setFocusable(false);
        
        /*customars=new JButton();
        customars.setText("Customar");
        customars.setBounds(50,350,200,50);
        customars.addActionListener(this);
        customars.setFocusable(false);*/

        clients=new JButton();
        clients.setText("Clients");
        clients.setFocusable(false);
        clients.setBounds(150,350,200,50);
        clients.addActionListener(this);

        shippers=new JButton();
        shippers.setText("Shippers");
        shippers.setFocusable(false);
        shippers.setBounds(450,350,200,50);
        shippers.addActionListener(this);

        this.setTitle("Admin Home-Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(300,100,800,600);
        this.setResizable(false);
        this.add(home);
        this.add(backButton);
        this.add(logout);
        //this.add(myInfo);
        this.add(branches);
        this.add(employees);
        //this.add(customars);
        this.add(clients);
        this.add(shippers);
        this.setVisible(true);
        this.add(backlabel);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==backButton){
            System.out.println("this id backbutton");
        }
        if (e.getSource()==logout){
            System.out.println("this id logout");
        }
        /*if (e.getSource()==myInfo){
            System.out.println("this is myInfo");
        }*/
        if (e.getSource()==branches){
            //System.out.println("this is branches");
            //dispose();
            Branches branch=new Branches();
        }
        if (e.getSource()==employees){
            //System.out.println("this is employeeInfo");
            //dispose();
            Employees e1= new Employees();
        }
        /*if (e.getSource()==customars){
           // System.out.println("this is customarInfo");
           //dispose();
           Customars castomar=new Customars();
        }*/
        if (e.getSource()==clients){
            //System.out.println("this is client");
            //dispose();
            Clients clients=new Clients();
        }
        if (e.getSource()==shippers){
            //System.out.println("this is shippers");
           // dispose();
            Shippers shipper=new Shippers();
        }
        
    }

    public static void main(String [] args){
        AdminFrame adf1 =new AdminFrame();
    }

}