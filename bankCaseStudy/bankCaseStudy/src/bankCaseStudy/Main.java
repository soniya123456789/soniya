package bankCaseStudy;

public class Main {

	public static void main(String[] args) {
		
		BankFactory bf = new MMBankFactory();
		
		SavingAcc sa = bf.getNewSavingAccount(101, "Rohan", 1000, true);
		CurrentAcc ca = bf.getNewCurrentAccount(102, "Pooja", 2000, 5000);
		
		System.out.println(sa);
		System.out.println(ca);
		
		sa.deposit(500);
		ca.deposit(1000);
		sa.withdraw(200);
		ca.withdraw(3000);
		
		System.out.println(sa);
		System.out.println(ca);

	}

}
