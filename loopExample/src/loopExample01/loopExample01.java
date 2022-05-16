package loopExample01;

public class loopExample01 {
	public static void main(String[] args) {
		
		int dan = 2;
		
		
		while(dan < 10) {
			int gob = 1;
			while(gob < 10) {
				System.out.println(dan + "*" + gob + "=" + dan*gob);
				gob++;
				continue; // 내가 이걸 왜 넣었을까?? 
			}		
			dan++;
		}
			
//		for(dan=2; dan<10; dan++) {
//			for(gob = 1; gob <10; gob++) {
//				System.out.println(dan + "*" + gob + "=" + dan*gob);
//			}
//		}
	}
}
