package singletonEx;

public class main {
	public static void main(String[] args) {
		System.out.println("메인문이 구동 중입니다.");
		System.out.println();
		
	// 객체 두개를 인스턴스 한것과 싱글톤이 두개가 있는 것은 본질적으로 다르다. 
	//인스턴스는 다른 이름과 다른 그릇이기 때문에 값이 각각 들어가지만 인스턴스는 하나의 몸에 이름이 두개 인 셈이다. 이해하는 것이 중요!!!
		
		Singleton stInstance1 = Singleton.getInstance();
		Singleton stInstance2 = Singleton.getInstance();
		Singleton stInstance3 = Singleton.getInstance();
		
		Basic basic1 = new Basic();
		Basic basic2 = new Basic();
		
		System.out.println();
		System.out.println(basic1);
		System.out.println(basic2);
		System.out.println();
		System.out.println(stInstance1);
		System.out.println(stInstance2);
		System.out.println(stInstance3);
	
	}
}
