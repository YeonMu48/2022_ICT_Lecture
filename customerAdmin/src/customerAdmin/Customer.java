package customerAdmin;

public class Customer {
	protected int customerId; // ��ӹ��� Ŭ������ ����&����� �� �ְ� ��ȣ
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
		return customerName + "���� ����� (" + customerGrade + ")�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
}
