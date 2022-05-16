package singletonProject;

public class Bus {
	private static Bus instance;
	private int studentFee = 720;
	private int employeeFee = 1250;
	private int busPassenger = 0;
	private int busTotalFee = 0;


	
	public static Bus getInstance() { 
		if(instance==null) {				
			instance = new Bus(); 
			System.out.println("103¹ø ¹ö½º ÃÖÃÊ »ý¼º!");
		}
	return instance;
	}
	
	public void setBusInfo(int studenetFee, int employeeFee, int busPassenger, int busTotalFee) {
		this.studentFee = studentFee;
		this.employeeFee = employeeFee;
		this.busPassenger = busPassenger;
		this.busTotalFee = busTotalFee;
	}

	public void showBusInfo() { 
		System.out.println("¹ö½º°¡ ¹ø ¼öÀÔ : " + busTotalFee);
		System.out.println("¹ö½º¿¡ Åº »ç¶÷ ¼ö : " + busPassenger);
	}
	
	public void takeBus(People people) {
		if(people.money < this.studentFee) {
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
			System.out.println(people.name + "´ÔÀÇ ÀÜ¾× : " + people.money);
			showBusInfo();
			System.out.println();
		}else {
			if(people.job == "Á÷ÀåÀÎ") {
				this.busTotalFee += this.employeeFee;
				people.money -= employeeFee;
				busPassenger++;
				System.out.println("»ß»à! " + people.job + " ÀÔ´Ï´Ù.");
				System.out.println(people.name + "´ÔÀÇ ÀÜ¾× : " + people.money);
				showBusInfo();
				System.out.println();
			}else {
				this.busTotalFee += this.studentFee;
				people.money -= studentFee;
				busPassenger++;
				System.out.println("»ß»à! " + people.job + " ÀÔ´Ï´Ù.");
				System.out.println(people.name + "´ÔÀÇ ÀÜ¾× : " + people.money);
				showBusInfo();
				System.out.println();
			}
		
		}

	}
}
