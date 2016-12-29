package day13.exam;

public class CardPayment extends Payment {
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;
	
	public CardPayment(String shopName, String productName, 
			long productPrice, String cardNumber, 
			String cardPassword, int monthlyInstallment) {
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
		super.shopName = shopName;
		super.productName = productName;
		super.productPrice = productPrice;
	
	}
	
	public void pay() throws PayException {
		if (monthlyInstallment < 0)
		{
			throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
		}
	System.out.println("신용카드가 정상적으로 지불되었습니다.");
	System.out.println("[ 신용카드 결제 정보 ]");
	}
	public String toString() {
		String result = String.format("상점명 : %s\n상품명 : %s\n상품가격 : %d\n신용카드번호 : %s\n할부개월 : %d\n",
				super.shopName, super.productName, super.productPrice, this.cardNumber, this.monthlyInstallment);
	
		return result;
		
	}
	
}
