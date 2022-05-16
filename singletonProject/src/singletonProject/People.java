package singletonProject;

public class People {
	public String name; // 이거 접근제어자 왜 쓰는거지?
	public int age;
	public int money;
	public String job;
	
	public People(String name, int age, int money, String job) {
		System.out.println("Student Initialize");
		System.out.println();
		
		this.name = name;
		this.age = age;
		this.money = money;
		this.job = job;
	}
	
	public boolean payFee(int price) {
		if(money < price) {
			return false;
		}else {
			money -= price;
			return true;
		}
	}
	
	public void takeBus() {
		Bus a = Bus.getInstance();
		a.takeBus(this);
	}
	
	
	public void takeSubway() {
		Subway a = Subway.getInstance();
	    a.takeSubway(this);
		}
		// 환승 고민해보기
	}

