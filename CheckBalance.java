import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;

public class CheckBalance extends JFrame {

    public CheckBalance() 
    {
    	setTitle("Deposit");
		setPreferredSize(new Dimension(500, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
			
		JPanel gridCheck = new JPanel();
		gridCheck.setLayout(new GridLayout(1,1));
		
		Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
		
		JLabel CurrentBalance = new JLabel("Current Balance: $" + 0);
		
		JButton Donecheck = new JButton("Done");
		Donecheck.setPreferredSize(new Dimension(100, 25));
		Donecheck.setBackground(new Color(255, 201, 14));
		Donecheck.setBorder(outline);
		
		JPanel panel = new JPanel();
		//panel.add(label);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		
		panel1.add(CurrentBalance);
		panel2.add(Donecheck);
		
		gridCheck.add(panel1);
		gridCheck.add(panel2);
		
		add(panel, BorderLayout.NORTH);
		add(gridCheck, BorderLayout.CENTER);
		
		panel.setBackground(Color.white);
		panel1.setBackground(Color.white);
		panel2.setBackground(Color.white);
		
		pack();
		setVisible(true);
		
    }
    
    public static void main(String[] args) 
	{

		new CheckBalance();
	}
    
    
}