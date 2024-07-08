//Abstract Current Account

package bankCaseStudy;

public abstract class CurrentAcc extends BankAcc{
	
	private float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	public abstract void withdraw(float amount);
	
	@Override
	public String toString() {
		return super.toString()+",Credit Limit:"+creditLimit;
}
}
