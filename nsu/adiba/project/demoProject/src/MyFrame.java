import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("JFrame title goes here"); // set title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // clicking X will close the program
        this.setResizable(false);
        this.setSize(420, 420); // sets the x-dimension and y-dimension of frame
        this.setVisible(true); // make frame visible

        ImageIcon image_logo = new ImageIcon("blood.png"); // create image icon
        this.setIconImage(image_logo.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(0,0,0));
    }
}
