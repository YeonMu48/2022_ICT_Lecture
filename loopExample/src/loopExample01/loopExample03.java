package loopExample01;

public class loopExample03 {
	public static void main(String[] args) {
//		int i = 1;
//		int j = -2;
//		int total = 0;
//		
//		while(true) {
//			while(true) {
//				if(total >= 100) {
//					total = (i+j);	
//					break;
//				}
//			i+=2;
//			j+=-2;
//		}
//			System.out.println(total);
//		}
		int num = 1;
		int sum = 0;
		
		while(true) {
			
			if(num % 2 == 1) {
				sum+=num;
			}
			else {
				sum-=num;
			}
			
			System.out.println("num의 값 : " + num);
			System.out.println("sum의 값 : " + sum);
			if(sum >= 100) {
				break;
			}
			num++;
		}
	}
}	