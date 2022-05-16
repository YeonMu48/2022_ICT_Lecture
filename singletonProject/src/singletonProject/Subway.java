package singletonProject;

public class Subway {
	private static Subway instance;
	private int studentFee = 720;
	private int employeeFee = 1250;
	private int subPassenger = 0;
	private int subTotalFee = 0;

	
	public static Subway getInstance() { 
		if(instance==null) {				
			instance = new Subway(); 
			System.out.println("ÁöÇÏÃ¶ 1È£¼± ÃÖÃÊ »ı¼º!");
		}
	return instance;
	}
	
	public void setSubInfo(int studenetFee, int employeeFee, int subPassenger, int subTotalFee) {
		this.studentFee = studentFee;
		this.employeeFee = employeeFee;
		this.subPassenger = subPassenger;
		this.subTotalFee = subTotalFee;
	}
	
	public void showSubInfo() { 
		System.out.println("ÁöÇÏÃ¶ÀÌ ¹ø ¼öÀÔ : " + subTotalFee);
		System.out.println("ÁöÇÏÃ¶¿¡ Åº »ç¶÷ ¼ö : " + subPassenger);
	}
	
	
	public void takeSubway(People people) {
		if(people.money < this.studentFee) {
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
			System.out.println(people.name + "´ÔÀÇ ÀÜ¾× : " + people.money);
			showSubInfo();
			System.out.println();
		}else {
			if(people.job == "Á÷ÀåÀÎ") {
				this.subTotalFee += this.employeeFee;
				people.money -= employeeFee;
				subPassenger++;
				System.out.println("»ß»à! " + people.job + " ÀÔ´Ï´Ù.");
				System.out.println(people.name + "´ÔÀÇ ÀÜ¾× : " + people.money);
				showSubInfo();
				System.out.println();
			}else {
				this.subTotalFee += this.studentFee;
				people.money -= studentFee;
				subPassenger++;
				System.out.println("»ß»à! " + people.job + " ÀÔ´Ï´Ù.");
				System.out.println(people.name + "´ÔÀÇ ÀÜ¾× : " + people.money);
				showSubInfo();
				System.out.println();
			}
		}
	}
}
