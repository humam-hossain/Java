import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Employees extends JFrame implements ActionListener{

    private JButton home;
    private JButton backButton;
    private JButton logout;
    private JButton editemployee;
    private JButton addemployee;
    private JButton banemployee;
    private JButton employeelist;

    private ImageIcon backimage;
    private ImageIcon backimage2;
    private ImageIcon homeimage;
    private ImageIcon logoutimage;

    private JLabel backlabel;
    private JLabel backlabel2;
    private JLabel homelabel;
    private JLabel logoutlabel;

    

        
    Employees(){

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

        employeelist=new JButton("Employees List");
        employeelist.setBounds(150,150,200,60);
        employeelist.setFocusable(false);
        employeelist.addActionListener(this);

        editemployee=new JButton("Edit Employees");
        editemployee.setBounds(450,150,200,60);
        editemployee.setFocusable(false);
        editemployee.addActionListener(this);

        addemployee=new JButton("Add Employee");
        addemployee.setBounds(150,300,200,60);
        addemployee.setFocusable(false);
        addemployee.addActionListener(this);

        banemployee=new JButton("Ban Employee");
        banemployee.setBounds(450,300,200,60);
        banemployee.setFocusable(false);
        banemployee.addActionListener(this);

        this.setTitle("Employees");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(300,100,800,600);
        this.setResizable(false);
        this.add(home);
        this.add(backButton);
        this.add(logout);
        this.add(employeelist);
        this.add(editemployee);
        this.add(addemployee);
        this.add(banemployee);
        this.setVisible(true);
        this.add(backlabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==home){
            //System.out.println("this is home");
            dispose();
            AdminFrame admin=new AdminFrame();
        }
        if (e.getSource()==backButton){
            //System.out.println("this id backbutton");
            dispose();
            AdminFrame admin=new AdminFrame();
        }
        if (e.getSource()==logout){
            //System.out.println("this id logout");
            dispose();
            LoginPage l1=new LoginPage();
        }
        if (e.getSource()==employeelist){
            //System.out.println("this is home");
            dispose();
            EmployeeList e1=new EmployeeList();
            
        }
        if (e.getSource()==editemployee){
            dispose();
            EditEmployee ede1=new EditEmployee();
        }
        if (e.getSource()==addemployee){
            //System.out.println("this id logout");
            dispose();
            Addemployee ade=new Addemployee();
        }
        if (e.getSource()==banemployee){
            //System.out.println("this id logout");
            dispose();
            BanEmployee admin=new BanEmployee();
        }
        
    }

    public static void main(String [] args){
        Employees em1 =new Employees();
    }
}