package shoppingCaseStudyy;

//Abstract Shopping Account

public abstract class ShopAcc {

	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	public abstract void bookProduct(float amount);
	
	public void items(float amount) {
		System.out.println("Items booked with amount::"+amount);	
	}

	@Override
	public String toString() {
		return "ShopAcc [Account No=" + accNo + ", Account Name=" + accNm + ", Charges=" + charges + "]";
	}

	//Getter and Setter
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	
	
}

