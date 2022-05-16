package java_lecture01;

public class FunctionEx {
	public static void main(String[] args) { 
		int num1 = 10;
		int num2 = 20;
		FunctionEx a = new FunctionEx();
		int sum = a.add(num1, num2);
		
		System.out.println(sum);
	}
	
	public int add(int n1, int n2) {
		int result = n1 + n2;
		
		return result;
	}
}