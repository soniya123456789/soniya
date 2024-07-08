package shoppingCaseStudyy;

public class GSShopFactory extends ShopFactory{

	public PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isPrime) {
		
		return new GSPrimeAcc(accNo,accNm,charges,isPrime);
	}
	
	public NormalAcc getNewNormalAccount(int accNo,String accNm,float charges,float deliveryCharges) {
	
		return new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
	}
}
