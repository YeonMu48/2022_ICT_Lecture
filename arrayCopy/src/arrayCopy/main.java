package arrayCopy;

public class main {
	public static void main(String[] args) {
		System.out.println("ArrayCopy 시작!");
		
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};

		System.arraycopy(array1, 0, array2, 1, array1.length-1); // 같은 배열의 크기일땐 length 애용
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
