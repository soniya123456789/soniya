package shoppingCaseStudyy;

public class GoShoppingApp {

	public static void main(String[] args) {
		
		ShopFactory factory = new GSShopFactory();
		
		PrimeAcc primeAcc = factory.getNewPrimeAccount(1, "prime user", 1000, true);
		
		NormalAcc normalAcc = factory.getNewNormalAccount(2, "Normal user", 500, 50);
		
		
		System.out.println(primeAcc);
		primeAcc.bookProduct(500);
		
		System.out.println(normalAcc);
		normalAcc.bookProduct(300);
	}

}
