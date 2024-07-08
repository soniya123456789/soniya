package shoppingCaseStudyy;

public abstract class PrimeAcc extends ShopAcc{
	
	private boolean isPrime;

	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	public abstract void bookProduct(float amount);

	@Override
	public String toString() {
		return super.toString()+", isPrime::"+isPrime;
	}

	//Getter and Setter methods
	
	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
}
