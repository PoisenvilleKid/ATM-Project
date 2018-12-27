package atm_project;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;

public class login_page extends JFrame{
	
		public login_page()
		{
			setTitle("Login");
			setPreferredSize(new Dimension(600, 500));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
			JPanel grid = new JPanel();
			grid.setLayout(new GridLayout(5, 1));
			
			Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
			
			ImageIcon logo = new ImageIcon("C:\\Users\\SARA\\Desktop\\atm_machine\\src\\atm_machine\\rizk.jpg");
			JLabel label = new JLabel();
			label.setIcon(logo);
			
			JLabel user = new JLabel("Username: ");
			JTextField username = new JTextField(10);
			
			JLabel pass = new JLabel("Password: ");
			JTextField password = new JTextField(10);
			
			JButton login = new JButton("Login");
			login.setPreferredSize(new Dimension(100, 25));
			login.setBackground(new Color(255, 201, 14));
			login.setBorder(outline);
			
			JPanel panel = new JPanel();
			panel.add(label);
			
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel space = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel bottom = new JPanel();
			
			
			panel1.add(user);
			panel1.add(username);
			panel2.add(pass);
			panel2.add(password);
			panel3.add(login);
			
			grid.add(panel1);
			grid.add(panel2);
			grid.add(space);
			grid.add(panel3);
			grid.add(bottom);
			
			
			add(panel, BorderLayout.NORTH);
			add(grid, BorderLayout.CENTER);
			
			panel.setBackground(Color.white);
			panel1.setBackground(Color.white);
			panel2.setBackground(Color.white);
			space.setBackground(Color.white);
			panel3.setBackground(Color.white);
			bottom.setBackground(Color.white);
			
			pack();
			setVisible(true);
		}
		
	public static void main(String[] args) 
	{

		new login_page();
	}

}
