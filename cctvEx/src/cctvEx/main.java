package cctvEx;

public class main {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc(); // 인스턴스는 CompleteCalc 이지만 선언이 Calc. Calc 인터페이스에 showInfo가 있는가? 없음 그래서 사용할 수 없다. 
										// 상위 클래스로 묵시적 형 변환 했을때도 상위 클래스에 없는 메소드가 하위 클래스에 구현 되어있다면, 해당 메소드는 사용 할 수 없다. 
		System.out.println(calc.add(num1, num2));
	}
}
