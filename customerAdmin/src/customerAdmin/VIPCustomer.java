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
	
	// ������ �������̵� : �����ڰ� �ִµ� �ϳ� �� ���� ���� �����ϴ� ��  
	// �޼ҵ� �������̵� : �θ�Ŭ������ �ִ� �޼��带 ��ӹ��� �ڽ�Ŭ�������� ���� ��ȯ���� ������ ���� �� �����ϴ� ��
	
	public int calcPrice(int price) {
		bonusPoint += price * this.bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
