package customerAdmin;

public class Customer {
	protected int customerId; // 상속받은 클래스만 접근&사용할 수 있게 보호
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	// method
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 (" + customerGrade + ")이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
