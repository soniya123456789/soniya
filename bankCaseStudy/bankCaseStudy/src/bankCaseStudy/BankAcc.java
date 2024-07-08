//Abstract Bank Account

package bankCaseStudy;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public void deposit(float amount) {
		if(amount > 0) {
			accBal+=amount;
		}
	}
	@Override
	public String toString() {
		return "BankAcc [Account number=" + accNo + ", Account Name=" + accNm + ", Account Balance=" + accBal + "]";
	}
	
}
