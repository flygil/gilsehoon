package day13.exam;

public class CashPayment extends Payment {
	private String cashReceiptNumber;
	
	public CashPayment (String shopName, String productName, long productPrice, String cashReceiptNumber) {
		super.shopName = shopName;
		super.productName = productName;
		super.productPrice = productPrice;
		this.cashReceiptNumber = cashReceiptNumber;
	}
	public void pay() throws PayException {
		if (super.productPrice <= 0)
		{
			throw new PayException("가격이 잘못되었습니다.");
		}
		System.out.println("현금이 정상적으로 지불되었습니다.");
		System.out.println("[ 현금 결제 정보 ]");
		}
	
	public String toString() {
		String result = String.format("상점명 : %s\n상품명 : %s\n상품가격 : %d\n현금영수증번호 : %s\n",
				super.shopName, super.productName, super.productPrice, this.cashReceiptNumber);
		return result;
	}
}
