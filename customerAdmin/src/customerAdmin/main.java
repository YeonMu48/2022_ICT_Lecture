package customerAdmin;

public class main {
	public static void main(String[] args) {
		 
		Customer customerLee = new Customer(10100, "이지윤");
		VIPCustomer customerHan = new VIPCustomer(10101, "한지호");
		Customer vc = new VIPCustomer(88888, "한솔");

		System.out.println("지불 금액 : " + customerLee.calcPrice(1000) +"원");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
		
		System.out.println("지불 금액 : " + customerHan.calcPrice(1000) + "원");
		System.out.println(customerHan.showCustomerInfo());
		System.out.println("전담 상담사 Id : " + customerHan.getAgentId());
		System.out.println();
		
		System.out.println("지불 금액 : " + vc.calcPrice(1000) +"원");
		System.out.println(vc.showCustomerInfo());
	}
}
