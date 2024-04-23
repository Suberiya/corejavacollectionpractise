package encapsulationassignment;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount ba= new BankAccount();
		
		ba.setAccountNumber("1212232345456767");
		
			ba.setBalance(200);
//		ba.setOwner("john");
//		ba.printStatement();
//		
//		ba.deposit(10);
//	ba.printStatement();
	
		
		System.out.println(ba.deposit(10) + "deposited");
		
		System.out.println(ba.withdraw(20, 5) + "withdraw");;
		
		System.out.println(ba.getBalance() + " current balance");
		
		
		
		
	}

}
