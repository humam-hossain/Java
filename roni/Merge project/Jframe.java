import javax.swing.*;
public class Jframe
{
	public static void main(String args[])
	{
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(800,600);
		//frame.setLocationRelativeTo(null);
		//frame.setLocation(200,50);
		frame.setBounds(300,100,800,600);
		frame.setTitle(" Jframe");
		frame.setResizable(false);
		
		
		
	}
}