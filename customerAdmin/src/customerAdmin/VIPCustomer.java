package customerAdmin;

public class VIPCustomer extends Customer {
	private int agentId;
	private double saleRatio;
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentId = 3000;
	}
	
	public int getAgentId() {
		return this.agentId;
	}
	
	// 생성자 오버라이딩 : 생성자가 있는데 하나 더 만들어서 새로 정의하는 거  
	// 메소드 오버라이딩 : 부모클래스에 있는 메서드를 상속받은 자식클래스에서 수정 변환등의 가공을 통해 재 정립하는 것
	
	public int calcPrice(int price) {
		bonusPoint += price * this.bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
