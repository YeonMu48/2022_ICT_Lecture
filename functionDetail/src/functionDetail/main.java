package functionDetail;

public class main {
	public static void main(String[] args) {
		System.out.println("프로그램이 시작 되었습니다.");
		
		/*
		Method function = new Method(); // 'Method function' -> 변수 선언 '= new Method' -> 인스턴스 생성
		String data = "데이터"; // 이렇게 하거나 'function.setData("데이터");' 를 해도 값은 같다. 값을 대입하는 방식을 직접적이냐 인자에 담아 넣었냐의 차이
		function.setData(data, data); // 선언과 사용은 다르다. 함수에 값을 넣는것은 선언이 아님. 
									 //  같은 data 값을 넣었을지라도 함수의 인자로써 다른 포장지에 쌓여 들어가는 것. 
									//   인자는 이름이 같으면 안된다? 왜 ? 이름이 같으면 컴퓨터가 호출했을 때 여럿이 다 대답할 것이기 때문. 
								   //    인자는 값을 전달하는 용도. 
		System.out.println("main data : " + data); 
		*/
		
		Method function = new Method();
		int num = 10;
		function.setInt(num); 
		System.out.println("main int : " + num); // 이름이 같을지라도 함수의 인자와 넣는 실제 값은 다른거다. 
												//  인자를 늘릴 땐 ',' 를 사용해 자료형과 이름을 붙여 선언을 한다. 
	}
}
