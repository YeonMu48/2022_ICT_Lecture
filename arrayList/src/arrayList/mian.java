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
		
		System.out.println("���� �� �� : " + strList.remove(1));
		
		System.out.println("---- ���� �Ϸ� ----");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));			
		}
		
		strList.add("����ȣ �����");
		
		System.out.println("---- �߰� �Ϸ� ----");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));			
		}
	}
}
