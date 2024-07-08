package shoppingCaseStudyy;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
	
	public void bookProduct(float amount) {
		
		System.out.println("Prime account booking product with amount::"+amount);
	}
	
	public String toString() {
		
		return super.toString();
	}

}
