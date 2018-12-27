import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;


public class ChangePass extends JFrame
{

    public ChangePass() 
    {
    	setTitle("Change Password");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel gridPass = new JPanel();
		gridPass.setLayout(new GridLayout(5, 2));
		
		ImageIcon logo = new ImageIcon("C:\\Users\\SARA\\Desktop\\atm_machine\\src\\atm_machine\\rizk.jpg");
		JLabel label = new JLabel();
		label.setIcon(logo);
		
		Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
		
		JLabel currentPass = new JLabel("Current Password: ");
		JPasswordField cPass = new JPasswordField(10);
		
		JLabel newPass = new JLabel("Enter New Password: ");
		JPasswordField nPass = new JPasswordField(10);
		
		JLabel newPass2 = new JLabel("Enter New Password Again: ");
		JPasswordField nPass2 = new JPasswordField(10);
		
		
		JButton change = new JButton("Change Password");
		change.setPreferredSize(new Dimension(150, 25));
		change.setBackground(new Color(255, 201, 14));
		change.setBorder(outline);
		
		JButton changeDone = new JButton("Done");
		changeDone.setPreferredSize(new Dimension(100, 25));
		changeDone.setBackground(new Color(255, 201, 14));
		changeDone.setBorder(outline);
		
		JPanel panel = new JPanel();
		panel.add(label);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		
		
		panel1.add(currentPass);
		panel1.add(cPass);
		panel2.add(newPass);
		panel2.add(nPass);
		panel3.add(newPass2);
		panel3.add(nPass2);
		panel4.add(change);
		panel4.add(changeDone);
		
		
		gridPass.add(panel1);
		gridPass.add(panel2);
		gridPass.add(panel3);
		gridPass.add(panel4);
		gridPass.add(panel5);
		
		
		add(panel, BorderLayout.NORTH);
		add(gridPass, BorderLayout.CENTER);
		
		
		panel.setBackground(Color.white);
		panel1.setBackground(Color.white);
		panel2.setBackground(Color.white);
		panel3.setBackground(Color.white);
		panel4.setBackground(Color.white);
		panel5.setBackground(Color.white);
		
		//change.addActionListener(this);
		
		pack();
		setVisible(true);
    }
    
    public static void main(String[] args) 
	{

		new ChangePass();
	}
    
}