//Money Saving Account

package bankCaseStudy;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
	}
	
	public void withdraw(float amount) {
		
		if(amount > 0 && getAccBal()>= amount) {
			
			setAccBal(getAccBal()-amount);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	@Override
	public String toString() {
		return "MMSavingAcc:"+super.toString();

}
}
