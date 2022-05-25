import java.util.ArrayList;

public class calMethod {
	// 내가 하려는 것 : 평균을 구하는 함수 
	// 필요한 값 : 배열의 요소(더해서 나눌 값)
	// 우선 가져와야 할 것 : 배열에서 각 요소의 값(더해야 함) --> 요소에 어떻게 접근할 것인가? 
	// 최종적으로 목표한 것 : 요소를 다 더하고 나눠서 평균치를 내야 함 
	double sum = 0;
	
	public void calcAvg(ArrayList<People> arrayList) {
		for(int i = 0; i < arrayList.size(); i++) {
			sum += arrayList.get(i).getGrade();
		}
		System.out.println(sum / arrayList.size());
	}
}
