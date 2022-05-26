package run;

import Architecture.Buy;
import Architecture.Sell;

public class main {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		Sell seller = customer;
		seller.sell();
		
		customer.order();
		buyer.order();
		seller.order();
	}
}
