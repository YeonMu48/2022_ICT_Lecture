package loopExample01;

public class loopExample01 {
	public static void main(String[] args) {
		
		int dan = 2;
		
		
		while(dan < 10) {
			int gob = 1;
			while(gob < 10) {
				System.out.println(dan + "*" + gob + "=" + dan*gob);
				gob++;
				continue; // ���� �̰� �� �־�����?? 
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
