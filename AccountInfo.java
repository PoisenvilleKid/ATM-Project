import java.util.*;



public class AccountInfo 
{
	private int accountNumber;
	private String lastName;
    private String firstName;
	private double Balance;
	private String Status;
	private String Password;

    public AccountInfo(int iAccountNumber, String ilastName, String iFirstName, double iBalance, String istatus) 
    {
    	accountNumber = iAccountNumber;
    	lastName = ilastName;
    	firstName = iFirstName;
    	Balance = iBalance;
    	Status = istatus;
    	
    }
    public AccountInfo(int iAccountNumber, String ilastName, String iFirstName)
    {
    	accountNumber = iAccountNumber;
    	lastName = ilastName;
    	firstName = iFirstName;
    }
    
    public AccountInfo(int iAccountNumber, String iPassword)
    {
    	accountNumber = iAccountNumber;
    	Password = iPassword;
    }
    
    public AccountInfo()
    {
    	
    }
    public int getID()
    {
    	return accountNumber;
    }
    
    public double getBalance()
    {
    	return Balance;
    }
    public String getPassword()
    {
    	return Password;
    }
    
    public void Deposit(double addFunds)
    {
    	Balance += addFunds;
    }
    
    public void withdraw(double subFunds)
    {
    	Balance -= subFunds;
    }
    
    public String changePassword(String newPass)
    {
    	String temp = " ";
    	temp = Password;
    	Password = newPass;
    	return Password;
    }
    
    
}