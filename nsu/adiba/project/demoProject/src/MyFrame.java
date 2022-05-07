import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    final static int FRAME_SIZE_X = 500;
    final static int FRAME_SIZE_Y = 500;

    JButton btn;
    MyFrame(){
        ImageIcon iconThumbsup = new ImageIcon("thumbsup.png");

        btn = new JButton("I'm a button");
        btn.setBounds(100, 100, 250, 100);
        btn.addActionListener(e -> System.out.println("poo"));
        btn.setFocusable(false);
        btn.setIcon(iconThumbsup);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(FRAME_SIZE_X, FRAME_SIZE_Y);
        this.setVisible(true);
        this.add(btn);
    }

}
