package atm_project;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.border.*;

public class main_page extends JFrame{

		public main_page() 
		{
			setTitle("Main Menu");
			setPreferredSize(new Dimension(800, 600));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
		
			Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
			
			JPanel grid = new JPanel();
			grid.setLayout(new GridLayout(3, 3));
		
			ImageIcon logo = new ImageIcon("C:\\Users\\SARA\\Desktop\\atm_machine\\src\\atm_machine\\rizk.jpg");
			JLabel label = new JLabel();
			label.setIcon(logo);
		
			JButton deposit = new JButton("Deposit");
			JButton balance = new JButton("Check Balance");
			JButton changePass = new JButton("Change Password");
			JButton withdraw = new JButton("Withdraw");
			JButton transfer = new JButton("Make a Transfer");
			JButton logout = new JButton("Logout");
			
			deposit.setPreferredSize(new Dimension(150, 50));
			balance.setPreferredSize(new Dimension(150, 50));
			changePass.setPreferredSize(new Dimension(150, 50));
			withdraw.setPreferredSize(new Dimension(150, 50));
			transfer.setPreferredSize(new Dimension(150, 50));
			logout.setPreferredSize(new Dimension(150, 50));
			
			deposit.setBackground(new Color(255, 201, 14));
			balance.setBackground(new Color(255, 201, 14));
			changePass.setBackground(new Color(255, 201, 14));
			withdraw.setBackground(new Color(255, 201, 14));
			transfer.setBackground(new Color(255, 201, 14));
			logout.setBackground(new Color(255, 201, 14));	
			
			deposit.setBorder(outline);
			balance.setBorder(outline);
			changePass.setBorder(outline);
			withdraw.setBorder(outline);
			transfer.setBorder(outline);
			logout.setBorder(outline);
			
			
			JLabel menu = new JLabel("Please select one of the following options");
			
			JPanel panel = new JPanel();
			panel.add(label);
		
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			JPanel panel5 = new JPanel();
			JPanel panel6 = new JPanel();
			JPanel panel7 = new JPanel();
			JPanel panel8 = new JPanel();
			JPanel panel9 = new JPanel();
			
			panel1.add(deposit);
			panel4.add(balance);
			panel7.add(changePass);
			panel3.add(withdraw);
			panel6.add(transfer);
			panel9.add(logout);
			panel5.add(menu);
		
			grid.add(panel1);
			grid.add(panel2);
			grid.add(panel3);
			grid.add(panel4);
			grid.add(panel5);
			grid.add(panel6);
			grid.add(panel7);
			grid.add(panel8);
			grid.add(panel9);
		
		
			add(panel, BorderLayout.NORTH);
			add(grid, BorderLayout.CENTER);
		
			panel.setBackground(Color.white);
			panel1.setBackground(Color.white);
			panel2.setBackground(Color.white);
			panel3.setBackground(Color.white);
			panel4.setBackground(Color.white);
			panel5.setBackground(Color.white);
			panel6.setBackground(Color.white);
			panel7.setBackground(Color.white);
			panel8.setBackground(Color.white);
			panel9.setBackground(Color.white);
		
			pack();
			setVisible(true);

		}
		
		public static void main(String[] args) 
		{	
			new main_page();
		}

}
