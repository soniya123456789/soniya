package shoppingCaseStudyy;

public abstract class NormalAcc extends ShopAcc{

	private float deliveryCharge;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}

	public abstract void bookProduct(float amount);

	@Override
	public String toString() {
		return super.toString()+", deliveryCharge::"+deliveryCharge;
	}

	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	
	
}
