//Abstract Saving Account

package bankCaseStudy;

public abstract class SavingAcc extends BankAcc{
	
	private boolean isSalary;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	
	public boolean isSalary() {
		return isSalary;
	}
	
	public abstract void withdraw(float amount);

	@Override
	public String toString() {
		return super.toString()+",Salary Account:"+isSalary;
	}

}
