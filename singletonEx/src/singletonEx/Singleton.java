package singletonEx;

public class Singleton {
	private static Singleton instance; // 멤버변수로 자신의 자료형인 싱글톤의 인스턴스를 쓰겠다고 선언
	
	private Singleton() {
		System.out.println("Singleton 생성자 호출!");
	}
	 // 클래스는 인스턴스를 생성해야 하고, 미 생성시 스태틱 예약어가 없는 메소드는 사용 할 수 없다. 그러나 현재 생성자를 프라이빗으로 설정해서 인스턴스은 불가하다. 
	public static Singleton getInstance() { // 그럼 인스턴스를 만들어줘야 하는데 어떻게 해야 하는가? 답은 스태틱 메소드로 인스턴스를 생성하는 것이다.  
		if(instance==null) {				// 인스턴스 대용 메서드, 반환 값 자료형 싱글톤 
			instance = new Singleton(); 	// 여기서는 왜 private Singleton이 사용 가능한가? 프라이빗은 자기 내부에선 사용 가능하기 때문에. 
		}
	return instance;
	}
}
