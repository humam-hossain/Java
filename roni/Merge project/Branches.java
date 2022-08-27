import javax.swing.table.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Branches extends JFrame implements ActionListener{

    private JButton homeb;
    private JButton backb;
    private JButton logoutb;
    private JButton addb;
    private JButton deleteb;
    private JButton updateb;
    private JButton refreshb;

    private ImageIcon backimage;
    private ImageIcon backimage2;
    private ImageIcon homeimage;
    private ImageIcon logoutimage;
    private ImageIcon addimage;
    private ImageIcon updateimage;
    private ImageIcon deleteimage;
    private ImageIcon refreshimage;
    private ImageIcon icon;

    private JLabel backlabel;
    private JLabel backlabel2;
    private JLabel homelabel;
    private JLabel logoutlabel;

    private JLabel addl;
    private JLabel refreshl;
    private JLabel updatel;
    private JLabel deletel;

    private JScrollPane pane;

    private DefaultTableModel model;

    private JTable table;
        
    Branches(){
		 icon= new ImageIcon(getClass().getResource("photo//logo.png"));
		this.setIconImage(icon.getImage());

        backimage=new ImageIcon("photo/backgimg.png");
        backlabel=new JLabel(backimage);
        backlabel.setBounds(0,0,800,600);

        homeimage=new ImageIcon("photo/home100.png");
        homelabel=new JLabel(homeimage);
        homelabel.setBounds(690,0,100,100);

        backimage2=new ImageIcon("photo/backimg.png");
        backlabel2=new JLabel(backimage2);
        backlabel2.setBounds(690,520,50,50);

        logoutimage=new ImageIcon("photo/logout.png");
        logoutlabel=new JLabel(logoutimage);
        logoutlabel.setBounds(740,520,50,50);

        refreshimage=new ImageIcon("photo/refresh100.png");
        refreshl=new JLabel(refreshimage);
        refreshl.setBounds(690,100,100,100);

        addimage=new ImageIcon("photo/add100.png");
        addl=new JLabel(addimage);
        addl.setBounds(690,200,100,100);

        updateimage =new ImageIcon("photo/upgrade100.png");
        updatel=new JLabel(updateimage);
        updatel.setBounds(690,300,100,100);

        deleteimage=new ImageIcon("photo/delete100.png");
        deletel=new JLabel(deleteimage);
        deletel.setBounds(690,400,100,100);

        homeb=new JButton();
        homeb.setBounds(690,0,100,100);
        homeb.setFocusable(false);
        homeb.add(homelabel);
        homeb.addActionListener(this);

        backb=new JButton();
        backb.setBounds(690,520,50,50);
        backb.setOpaque(false);
        backb.setContentAreaFilled(false);
        backb.setFocusable(false);
        backb.setBorderPainted(true);
        backb.setBorder(null);
        backb.add(backlabel2);
        backb.addActionListener(this);

        logoutb=new JButton();
        logoutb.add(logoutlabel);
        logoutb.setBounds(740,520,50,50);
        logoutb.setOpaque(false);
        logoutb.setContentAreaFilled(false);
        logoutb.setFocusable(false);
        logoutb.setBorderPainted(true);
        logoutb.setBorder(null);
        logoutb.addActionListener(this);

        refreshb=new JButton("LIST");
        refreshb.add(refreshl);
        refreshb.setBounds(690,100,100,100);
        refreshb.setOpaque(false);
        refreshb.setContentAreaFilled(false);
        refreshb.setBorderPainted(true);
        refreshb.setBorder(null);
        refreshb.setFocusable(false);
        refreshb.addActionListener(this);

        addb=new JButton("ADD");
        addb.add(addl);
        addb.setBounds(690,200,100,100);
        addb.setOpaque(false);
        addb.setContentAreaFilled(false);
        addb.setBorderPainted(true);
        addb.setBorder(null);
        addb.setFocusable(false);
        addb.addActionListener(this);

        updateb=new JButton("Update");
        updateb.add(updatel);
        updateb.setBounds(690,300,100,100);
        updateb.setOpaque(false);
        updateb.setContentAreaFilled(false);
        updateb.setBorderPainted(true);
        updateb.setBorder(null);
        updateb.setFocusable(false);
        updateb.addActionListener(this);

        deleteb=new JButton();
        deleteb.add(deletel);
        deleteb.setBounds(690,400,100,100);
        deleteb.setOpaque(false);
        deleteb.setContentAreaFilled(false);
        deleteb.setBorderPainted(true);
        deleteb.setBorder(null); 
        deleteb.setFocusable(false);
        deleteb.addActionListener(this);

        table =new JTable();

        pane=new JScrollPane(table);
        pane.setBounds(0,0,690,600);
        table.setBackground(Color.cyan);
        table.setForeground(Color.black);
        table.setRowHeight(50);
        
        this.setTitle("Clients");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(300,100,800,600);
        this.setResizable(false);
        this.add(homelabel);
        this.add(addl);
        this.add(refreshl);
        //this.add(deletel);
        this.add(pane);
        this.add(addb);
        this.add(deleteb);
        this.add(updateb);
        this.add(refreshb);
        this.add(backb);
        this.add(logoutb);
        this.add(homelabel);
        this.setVisible(true);
        this.add(backlabel);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==homeb){
            //System.out.println("this is home");
            dispose();
            AdminFrame admin=new AdminFrame();
        }
        if (e.getSource()==backb){
            //System.out.println("this id backbutton");
            dispose();
            AdminFrame admin=new AdminFrame();
        }
        if (e.getSource()==logoutb){
            //System.out.println("this id logout");
            dispose();
            LoginPage admin=new LoginPage();
        }
        if(e.getSource()==refreshb){
            String filePath = "branches.txt";
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
        refreshb.setEnabled(false);
        }
        if(e.getSource()==addb){
            AddBranch adc1=new AddBranch();
        }
        if(e.getSource()==updateb){
            String filePath = "branches.txt";
            File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            String firstline="Name/Mobile/Address/Email\n";
            bw.write(firstline);
            
            for(int i = 0; i < table.getRowCount(); i++){
                for(int j = 0; j < table.getColumnCount(); j++){
                    bw.write(table.getValueAt(i, j).toString()+",");
                }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            System.out.print("system error");
        }
        }
        if(e.getSource()==deleteb){
            int i = table.getSelectedRow();
            if(i >= 0){
                model.removeRow(i);
            }
            else{
                System.out.println("Delete Error");
            }
            String filePath = "branches.txt";
            File file = new File(filePath);
            try{
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                String firstline="Name/Mobile/Address/Email\n";
                bw.write(firstline);
            
                for(int j = 0; j < table.getRowCount(); j++){
                    for(int k = 0; k < table.getColumnCount(); k++){
                        bw.write(table.getValueAt(j, k).toString()+",");
                    }
                    bw.newLine();
                }
            
                bw.close();
                fw.close();
            
            }
            catch (IOException ex) {
                System.out.print("system error");
            }
        }
        
    }

    public static void main(String [] args){
        Branches cl1 =new Branches();
    }
}