package customerAdmin;

public class main {
	public static void main(String[] args) {
		 
		Customer customerLee = new Customer(10100, "������");
		VIPCustomer customerHan = new VIPCustomer(10101, "����ȣ");
		Customer vc = new VIPCustomer(88888, "�Ѽ�");

		System.out.println("���� �ݾ� : " + customerLee.calcPrice(1000) +"��");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
		
		System.out.println("���� �ݾ� : " + customerHan.calcPrice(1000) + "��");
		System.out.println(customerHan.showCustomerInfo());
		System.out.println("���� ���� Id : " + customerHan.getAgentId());
		System.out.println();
		
		System.out.println("���� �ݾ� : " + vc.calcPrice(1000) +"��");
		System.out.println(vc.showCustomerInfo());
	}
}
