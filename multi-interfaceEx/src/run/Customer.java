package run;

import Architecture.Buy;
import Architecture.Sell;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("구매하기");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("판매하기");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("고객 주문");
	}



}
