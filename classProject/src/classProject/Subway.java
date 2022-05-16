package classProject;

public class Subway {
	public int subLine;
	public int subPassenger;
	public int subFare;
	private int subTotal;
	
	public Subway() {
		this(999, 0, 0);
		System.out.println("Sub default");
		System.out.println();
	}
	
	
	public Subway(int subLine, int subPassenger, int subFare) {
		System.out.println("Sub Initialize");
		System.out.println();
		
		this.subLine = subLine;
		this.subPassenger = subPassenger;
		this.subFare = subFare;
	}
	
	public void showSubwayInfo() {
		System.out.println("����ö �뼱 : " + subLine);
		System.out.println("ž�°� �� : " + subPassenger);
		System.out.println("���� ��� : " + subFare);
		System.out.println();
	}
	
	public void charge(int subFare) {
		this.subTotal += subFare;
		subPassenger++;
		System.out.println("���� ����ö�� �� ž�°��� : " + subPassenger + "��, �� ������ : " + subTotal + "�� �Դϴ�.");
	}
}
