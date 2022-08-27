import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class EmployeeListFEmploy extends JFrame implements ActionListener{

    private ImageIcon backimage;
    private ImageIcon backimage2;
    private ImageIcon homeimage;
    private ImageIcon icon;

    private JLabel backlabel;
    private JLabel backlabel2;
    private JLabel homelabel;

    private JButton home;
    private JButton backButton;

    private JTable table;
    private JButton refresh;
    private JScrollPane pane;
    private DefaultTableModel model;
    
    EmployeeListFEmploy(){
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
        backlabel2.setBounds(720,20,50,50);

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
        backButton.setBounds(720,20,50,50);
        backButton.setOpaque(false); // Must add
        backButton.setContentAreaFilled(false);
        backButton.setFocusable(false);
        backButton.setBorderPainted(true);
        backButton.setBorder(null);
        backButton.add(backlabel2);
        backButton.addActionListener(this);

        table=new JTable();

        refresh =new JButton("Refresh");
        refresh.setBounds(300,40,200,50);
        refresh.setFocusable(false);
        refresh.addActionListener(this);

        pane=new JScrollPane(table);
        pane.setBounds(0,120,800,450);
        table.setBackground(Color.cyan);
        table.setForeground(Color.black);
        table.setRowHeight(50);

        this.setTitle("EmployeeList");
        this.setLayout(null);
        this.add(home);
        this.add(backButton);
        this.add(homelabel);
        this.add(backlabel);
        this.add(pane);
        this.add(refresh);
        this.setBounds(300,100,800,600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(backlabel);
    
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==home){
            dispose();
            EmployeePortal frame=new EmployeePortal();
			 frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
			
        }
        if (e.getSource()==backButton){
            dispose();
            StoreDetails frame=new StoreDetails();
			 frame.setVisible(true);
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setBounds(300,100,800,600);
			  	frame.setResizable(false);
        }
        if(e.getSource()==refresh){
            String filePath = "employeedetails.txt";
            File file = new File(filePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split("/");
            model = (DefaultTableModel)table.getModel();
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();

            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            
        } catch (Exception ex) {
            System.out.print("system error");
        }
        refresh.setEnabled(false);

        }

        
    }

    public static void main(String [] args){
        EmployeeListFEmploy eml1 =new EmployeeListFEmploy();
    }
    
}
