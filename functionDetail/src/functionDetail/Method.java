package functionDetail;

public class Method {
	public void setData(String data, String data2) { // ( __ ) 인자부분 메인문에서 data로 썼다 하더라도 다른 메모리에 저장되는 글자만 같은 다른 친구. 
		data = "데이터1";
		data2 = "데이터2";
		System.out.println("Method.setData Data : " + data); // 이 메소드는 받은 인자를 출력해준다.  
		System.out.println("Method.setData Data : " + data2);
		
	}
	public void setInt(int num) {
		num = 11;
		System.out.println("Method.setData num : " + num);
	}
}
