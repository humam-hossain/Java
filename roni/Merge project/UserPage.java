import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserPage extends JFrame implements ActionListener{
    JButton myInfo;
    JButton changePass;
    JButton employeeInfo;
    JButton customarInfo;
    JButton clients;
    JButton shippers;

    public UserPage(){

        myInfo =new JButton();
        myInfo.setText("MY Info");
        myInfo.setBounds(50,100,200,50);
        myInfo.addActionListener(this);
        myInfo.setFocusable(false);

        changePass = new JButton();
        changePass.setText("Change Password");
        changePass.setBounds(300,100,200,50);
        changePass.addActionListener(this);
        changePass.setFocusable(false);

        employeeInfo=new JButton();
        employeeInfo.setText("Employee Info");
        employeeInfo.setBounds(550,100,200,50);
        employeeInfo.addActionListener(this);
        employeeInfo.setFocusable(false);
        
        customarInfo=new JButton();
        customarInfo.setText("Customar Info");
        customarInfo.setBounds(50,350,200,50);
        customarInfo.addActionListener(this);
        customarInfo.setFocusable(false);

        clients=new JButton();
        clients.setText("Clients");
        clients.setFocusable(false);
        clients.setBounds(300,350,200,50);
        clients.addActionListener(this);

        shippers=new JButton();
        shippers.setText("Shippers");
        shippers.setFocusable(false);
        shippers.setBounds(550,350,200,50);
        shippers.addActionListener(this);






        this.setTitle("User Home-Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800,600);
        this.add(myInfo);
        this.add(changePass);
        this.add(employeeInfo);
        this.add(customarInfo);
        this.add(clients);
        this.add(shippers);
        this.setVisible(true);



    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==myInfo){
            System.out.println("this is myInfo");
        }
        if (e.getSource()==changePass){
            System.out.println("this is changePass");
        }
        if (e.getSource()==employeeInfo){
            System.out.println("this is employeeInfo");
        }
        if (e.getSource()==customarInfo){
            System.out.println("this is customarInfo");
        }
        if (e.getSource()==clients){
            System.out.println("this is client");
        }
        if (e.getSource()==shippers){
            System.out.println("this is shippers");
        }
        

    }
	public class Main {
    public static void main(String args[]){
        UserPage a1=new UserPage();
    }
    
}





}