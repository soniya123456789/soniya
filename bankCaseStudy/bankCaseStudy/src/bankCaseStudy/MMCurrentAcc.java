//Money Current Account

package bankCaseStudy;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
	
	public void withdraw(float amount) {
		
		if(amount > 0 && (getAccBal()+getCreditLimit())>=amount) {
			
			setAccBal(getAccBal()-amount);
		}
		else {
			System.out.println("credit limit exceeded");
		}
	}
	@Override
	public String toString() {
		return "MMCurrentAcc:"+super.toString();
}

}
