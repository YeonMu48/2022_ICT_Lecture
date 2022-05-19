package arrayList;

import java.util.ArrayList;

public class mian {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.clear();

		strList.add("aaaaa");
		strList.add("bbbbb");
		strList.add("ccccc");
		// strList.add(12345)
		
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));			
		}
		
		System.out.println("삭제 한 값 : " + strList.remove(1));
		
		System.out.println("---- 삭제 완료 ----");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));			
		}
		
		strList.add("한지호 사랑해");
		
		System.out.println("---- 추가 완료 ----");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));			
		}
	}
}
