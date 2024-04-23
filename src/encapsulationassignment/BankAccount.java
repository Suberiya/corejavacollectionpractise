package encapsulationassignment;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private String owner;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double deposit(double addbalance)
	{
	
		return addbalance +balance;
		
		
		
	}
	
	public double withdraw(double substract, double addbalance)
	
	{
		return addbalance - substract;


	}
	
	public void printStatement()
	{
		System.out.println(accountNumber + " " + owner + " " + balance);
	}
	
}
