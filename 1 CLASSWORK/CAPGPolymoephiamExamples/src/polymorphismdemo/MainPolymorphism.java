package polymorphismdemo;

public class MainPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa=new SavingsAccount();
		sa.openAccount();
		sa.calculateInterest();
		sa.viewAccountDetails();
		
		SavingsAccount aa=new SavingsAccount();
		aa.openAccount();
		aa.calculateInterest();
		aa.viewAccountDetails();
		aa.calculateInterest(2);
		
		Account acc=new Account();
		acc.calculatenterest();//this call super class calculate interest method
	}

}
