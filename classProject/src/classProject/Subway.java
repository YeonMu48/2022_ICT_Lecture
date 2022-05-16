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
		System.out.println("ÁöÇÏÃ¶ ³ë¼± : " + subLine);
		System.out.println("Å¾½Â°´ ¼ö : " + subPassenger);
		System.out.println("¹ö½º ¿ä±İ : " + subFare);
		System.out.println();
	}
	
	public void charge(int subFare) {
		this.subTotal += subFare;
		subPassenger++;
		System.out.println("ÇöÀç ÁöÇÏÃ¶ÀÇ ÃÑ Å¾½Â°´Àº : " + subPassenger + "¸í, ÃÑ ¼öÀÔÀº : " + subTotal + "¿ø ÀÔ´Ï´Ù.");
	}
}
