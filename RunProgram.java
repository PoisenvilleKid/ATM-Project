
import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.ImageIO;

public class RunProgram extends JFrame implements ActionListener {
private AccountInfo fred;
private AccountInfo FullClient;
private static final long serialVersionUID = 1L;
JTextField username;
JPasswordField password;
JPasswordField cPass;
JPasswordField nPass;
JPasswordField nPass2;
JTextField AmountDeposited;
JTextField AmountWithdraw;
JTextField tAccnt;
JTextField tAmnt;
JButton login;
JButton balance;
JButton changePass;
JButton deposit;
JButton withdraw;
JButton transfer;
JButton logout;
JButton addDeposit;
JButton DoneDeposit;
JButton subWithdraw;
JButton DoneWithdraw;
JButton Donecheck;
JButton change;
JButton changeDone;
JButton compDone;
JButton compTrans;
JLabel CurrentBalance;
JPanel grid;
JPanel grid1;
JPanel gridDeposit;
JPanel gridWithdraw;
JPanel gridCheck;
JPanel gridPass;
JPanel gridTran;

    public RunProgram() 
    {
    	FillClient();
    	FillAccount();
    }
    
    public void FillClient()
    {
    	//File clientfile = new File("ClientInfo.txt");
    	Scanner inputFile = null;
    	try 
    	{
    		inputFile = new Scanner(new File("ClientInfo.txt"));
    	}

 		catch (FileNotFoundException e) 
 		{
   			System.out.println("File not found!");
 		}
    	while(inputFile.hasNext())
    	{
    		fred = new AccountInfo(inputFile.nextInt(),inputFile.next());
    	}
    }
    
    public void FillAccount()
    {
    	File Accountfile = new File("AccountInfo.txt");
    	Scanner inputFile = null;
    	try 
    	{
    		inputFile = new Scanner(new File("AccountInfo.txt"));
    	}

 		catch (FileNotFoundException e) 
 		{
   			System.out.println("File not found!");
 		}
 		while(inputFile.hasNext())
 		{
 			FullClient = new AccountInfo(Integer.parseInt(inputFile.nextLine()),inputFile.nextLine(),inputFile.nextLine(),Integer.parseInt(inputFile.nextLine()),inputFile.next());
 		}
    }
    
   
    
    public void setLogin()
    {
    	
    		setTitle("Login");
			setPreferredSize(new Dimension(600, 500));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
			grid = new JPanel();
			grid.setLayout(new GridLayout(5, 1));
			
			Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
			
			ImageIcon logo = new ImageIcon("C:\\Users\\SARA\\Desktop\\atm_machine\\src\\atm_machine\\rizk.jpg");
			JLabel label = new JLabel();
			label.setIcon(logo);
			
			JLabel user = new JLabel("Username: ");
			username = new JTextField(10);
			
			JLabel pass = new JLabel("Password: ");
			password = new JPasswordField(10);
			
			login = new JButton("Login");
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
			
			login.addActionListener(this);
			
			pack();
			setVisible(true);
    	
    }
    
    public void mainPage()
    {
    		setTitle("Main Menu");
			setPreferredSize(new Dimension(800, 600));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
		
			Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
			
			grid1 = new JPanel();
			grid1.setLayout(new GridLayout(3, 3));
		
			ImageIcon logo = new ImageIcon("C:\\Users\\SARA\\Desktop\\atm_machine\\src\\atm_machine\\rizk.jpg");
			JLabel label = new JLabel();
			label.setIcon(logo);
		
			deposit = new JButton("Deposit");
		    balance = new JButton("Check Balance");
		    changePass = new JButton("Change Password");
			withdraw = new JButton("Withdraw");
			transfer = new JButton("Make a Transfer");
			logout = new JButton("Logout");
			
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
		
			grid1.add(panel1);
			grid1.add(panel2);
			grid1.add(panel3);
			grid1.add(panel4);
			grid1.add(panel5);
			grid1.add(panel6);
			grid1.add(panel7);
			grid1.add(panel8);
			grid1.add(panel9);
		
		
			add(panel, BorderLayout.NORTH);
			add(grid1, BorderLayout.CENTER);
		
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
			
			deposit.addActionListener(this);
			withdraw.addActionListener(this);
			logout.addActionListener(this);
			balance.addActionListener(this);
			changePass.addActionListener(this);
			transfer.addActionListener(this);
		
			pack();
			setVisible(true);
			
	
    }
    
    public void Deposit()
    {
    		setTitle("Deposit");
			setPreferredSize(new Dimension(600, 500));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
			gridDeposit = new JPanel();
			gridDeposit.setLayout(new GridLayout(5, 2));
			
			ImageIcon logo = new ImageIcon("C:\\Users\\SARA\\Desktop\\atm_machine\\src\\atm_machine\\rizk.jpg");
			JLabel label = new JLabel();
			label.setIcon(logo);
			
			Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
			
			CurrentBalance = new JLabel("Current Balance: $" + FullClient.getBalance());
			
			JLabel request = new JLabel("How Much Would You Like To Deposit?");
			AmountDeposited = new JTextField(10);
			
			
			addDeposit = new JButton("Add Deposit");
			addDeposit.setPreferredSize(new Dimension(100, 25));
			addDeposit.setBackground(new Color(255, 201, 14));
			addDeposit.setBorder(outline);
			
			DoneDeposit = new JButton("Done");
			DoneDeposit.setPreferredSize(new Dimension(100, 25));
			DoneDeposit.setBackground(new Color(255, 201, 14));
			DoneDeposit.setBorder(outline);
			
			
			JPanel panel = new JPanel();
			panel.add(label);
			
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			JPanel panel5 = new JPanel();
			
			
			
			panel1.add(CurrentBalance);
			panel2.add(request);
			panel2.add(AmountDeposited);
			panel3.add(addDeposit);
			panel3.add(DoneDeposit);
			
			
			gridDeposit.add(panel1);
			gridDeposit.add(panel2);
			gridDeposit.add(panel3);
			gridDeposit.add(panel4);
			gridDeposit.add(panel5);
			
			
			add(panel, BorderLayout.NORTH);
			add(gridDeposit, BorderLayout.CENTER);
			
			
			panel.setBackground(Color.white);
			panel1.setBackground(Color.white);
			panel2.setBackground(Color.white);
			panel3.setBackground(Color.white);
			panel4.setBackground(Color.white);
			panel5.setBackground(Color.white);
			
			addDeposit.addActionListener(this);
			DoneDeposit.addActionListener(this);
			
			pack();
			setVisible(true);
    }
    
    public void withDraw()
    {
    	setTitle("Deposit");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		gridWithdraw = new JPanel();
		gridWithdraw.setLayout(new GridLayout(5, 2));
		
		ImageIcon logo = new ImageIcon("C:\\Users\\SARA\\Desktop\\atm_machine\\src\\atm_machine\\rizk.jpg");
		JLabel label = new JLabel();
		label.setIcon(logo);
			
		Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
			
		CurrentBalance = new JLabel("Current Balance: $" + FullClient.getBalance());
			
		JLabel request = new JLabel("How Much Would You Like To WithDraw?");
		AmountWithdraw = new JTextField(10);
		
		subWithdraw = new JButton("Withdraw");
		subWithdraw.setPreferredSize(new Dimension(100, 25));
		subWithdraw.setBackground(new Color(255, 201, 14));
		subWithdraw.setBorder(outline);
			
		DoneWithdraw = new JButton("Done");
		DoneWithdraw.setPreferredSize(new Dimension(100, 25));
		DoneWithdraw.setBackground(new Color(255, 201, 14));
		DoneWithdraw.setBorder(outline);
		
		JPanel panel = new JPanel();
		panel.add(label);
			
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
			
			
			
		panel1.add(CurrentBalance);
		panel2.add(request);
		panel2.add(AmountWithdraw);
		panel3.add(subWithdraw);
		panel3.add(DoneWithdraw);
			
			
			
		gridWithdraw.add(panel1);
		gridWithdraw.add(panel2);
		gridWithdraw.add(panel3);
		gridWithdraw.add(panel4);
		gridWithdraw.add(panel5);
			
			
			
			
		add(panel, BorderLayout.NORTH);
		add(gridWithdraw, BorderLayout.CENTER);
			
			
		panel.setBackground(Color.white);
		panel1.setBackground(Color.white);
		panel2.setBackground(Color.white);
		panel3.setBackground(Color.white);
		panel4.setBackground(Color.white);
		panel5.setBackground(Color.white);
		
		subWithdraw.addActionListener(this);
		DoneWithdraw.addActionListener(this);
			
			
			
		pack();
		setVisible(true);
    }
    
    
    public void checkBalance()
    {
    	setTitle("Balnce");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
			
		gridCheck = new JPanel();
		gridCheck.setLayout(new GridLayout(1,1));
		
		Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
		
		CurrentBalance = new JLabel("Current Balance: $" + FullClient.getBalance());
		
		Donecheck = new JButton("Done");
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
		
		
		Donecheck.addActionListener(this);
		
		pack();
		setVisible(true);
    }
    
    public void changePass()
    {
    	setTitle("Change Password");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		gridPass = new JPanel();
		gridPass.setLayout(new GridLayout(5, 2));
		
		ImageIcon logo = new ImageIcon("C:\\Users\\SARA\\Desktop\\atm_machine\\src\\atm_machine\\rizk.jpg");
		JLabel label = new JLabel();
		label.setIcon(logo);
		
		Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
		
		JLabel currentPass = new JLabel("Current Password: ");
		cPass = new JPasswordField(10);
		
		JLabel newPass = new JLabel("Enter New Password: ");
		nPass = new JPasswordField(10);
		
		JLabel newPass2 = new JLabel("Enter New Password Again: ");
		nPass2 = new JPasswordField(10);
		
		
		change = new JButton("Change Password");
		change.setPreferredSize(new Dimension(150, 25));
		change.setBackground(new Color(255, 201, 14));
		change.setBorder(outline);
		
		changeDone = new JButton("Done");
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
		
		change.addActionListener(this);
		changeDone.addActionListener(this);
		
		pack();
		setVisible(true);
    }
    
    public void transfer()
    {
    	setTitle("Transfer Funds");
		setPreferredSize(new Dimension(600, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		gridTran = new JPanel();
		gridTran.setLayout(new GridLayout(5, 2));
		
		ImageIcon logo = new ImageIcon("C:\\Users\\SARA\\Desktop\\atm_machine\\src\\atm_machine\\rizk.jpg");
		JLabel label = new JLabel();
		label.setIcon(logo);
		
		Border outline = BorderFactory.createLineBorder(new Color(237, 28, 36), 3);
		
		JLabel transAccount = new JLabel("Enter Account # to Transfer: ");
		tAccnt = new JTextField(10);
		
		JLabel transAmount = new JLabel("Enter Amount for Transfer: ");
		tAmnt = new JTextField(10);
		
		compTrans = new JButton("Complete Transfer");
		compTrans.setPreferredSize(new Dimension(150, 25));
		compTrans.setBackground(new Color(255, 201, 14));
		compTrans.setBorder(outline);
		
		
		compDone = new JButton("Done");
		compDone.setPreferredSize(new Dimension(100, 25));
		compDone.setBackground(new Color(255, 201, 14));
		compDone.setBorder(outline);
		
		JPanel panel = new JPanel();
		panel.add(label);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		
		
		panel1.add(transAccount);
		panel1.add(tAccnt);
		panel2.add(transAmount);
		panel2.add(tAmnt);
		panel3.add(compTrans);
		panel4.add(compDone);
		
		gridTran.add(panel1);
		gridTran.add(panel2);
		gridTran.add(panel3);
		gridTran.add(panel4);
		gridTran.add(panel5);
		
		
		add(panel, BorderLayout.NORTH);
		add(gridTran, BorderLayout.CENTER);
		
		
		panel.setBackground(Color.white);
		panel1.setBackground(Color.white);
		panel2.setBackground(Color.white);
		panel3.setBackground(Color.white);
		panel4.setBackground(Color.white);
		panel5.setBackground(Color.white);
		
		compTrans.addActionListener(this);
		compDone.addActionListener(this);
		
		pack();
		setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource() == login)
    	{
    		String Username = username.getText();
    		int inputUser = Integer.parseInt(Username);
    		
    		String inputpassword = password.getText();
    	
    		if(inputUser == fred.getID() && inputpassword.equals(fred.getPassword()))
    		{
    			System.out.println("Correct!");
    			grid.setVisible(false);
    			mainPage();

    		
    		}
    		else
    		{
    			System.out.println("Incorrect!");
    		}
    	}
    	
    	if(e.getSource() == deposit)
    	{
    		grid1.setVisible(false);
    		Deposit();
    		
    	}
    	if(e.getSource() == withdraw)
    	{
    		grid1.setVisible(false);
    		withDraw();
    	}
    	if(e.getSource() == addDeposit)
    	{
    		String entered = AmountDeposited.getText();
    		Double inputUser = Double.parseDouble(entered);
    		
    		FullClient.Deposit(inputUser);
    		CurrentBalance.setText("Current Balance: $" + FullClient.getBalance());
    		
    	}
    	if(e.getSource() == subWithdraw)
    	{
    		String entered = AmountWithdraw.getText();
    		Double inputUser = Double.parseDouble(entered);
    		
    		FullClient.withdraw(inputUser);
    		CurrentBalance.setText("Current Balance: $" + FullClient.getBalance());
    		
    	}
    	if(e.getSource() == DoneWithdraw)
    	{
    		gridWithdraw.setVisible(false);
    		mainPage();
    	}
    	if(e.getSource() == DoneDeposit)
    	{
    		gridDeposit.setVisible(false);
    		mainPage();
    	}
    	if(e.getSource() == balance)
    	{
    		grid1.setVisible(false);
    		checkBalance();
    	}
    	if(e.getSource() == Donecheck)
    	{
    		gridCheck.setVisible(false);
    		mainPage();
    	}
    	if(e.getSource() == changePass)
    	{
    		grid1.setVisible(false);
    		changePass();
    	}
    	if(e.getSource() == change)
    	{
    		String checkPass = password.getText();
    		String newPass = nPass.getText();
    		String newPass1 = nPass2.getText();
    		if(checkPass.equals(FullClient.getPassword()) && newPass.equals(newPass1))
    		{
    			FullClient.changePassword(newPass);
    		}
    	}
    	if(e.getSource() == changeDone)
    	{
    		gridPass.setVisible(false);
    		mainPage();
    	}
    	
    	if(e.getSource() == transfer)
    	{
    		grid1.setVisible(false);
    		transfer();
    	}
    	
    	if(e.getSource() == compTrans)
    	{
    		String newID = tAccnt.getText();
    		int NewID = Integer.parseInt(newID);
    		
    		String entered = tAmnt.getText();
    		Double inputTransfer = Double.parseDouble(entered);
    		
    		FullClient.withdraw(inputTransfer);
    		
    		
    	}
    	
    	if(e.getSource() == compDone)
    	{
    		gridTran.setVisible(false);
    		mainPage();
    	}
    	
    	if(e.getSource() == logout)
    	{
    		System.out.println("done");
    		grid1.setVisible(false);
    		setLogin();
    		
    	}
    	
    	
    }
    
    
    public static void main(String[] args) 
	{
		RunProgram ed = new RunProgram();
		ed.setLogin();
	}

    
    
}