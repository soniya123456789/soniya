package shoppingCaseStudyy;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
	}

	public void bookProduct(float amount) {
		
		System.out.println("Normal account booking product with amount::"+ amount +"and delivery charges::"+getDeliveryCharge());
	}
	
	
	public String toString() {
		return super.toString();
	}
}
