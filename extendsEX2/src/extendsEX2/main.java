package extendsEX2;

public class main {
	public static void main(String[] args) {
		Developer devPark = new Developer("박재현", 32, "대전", 200, 100, 7);
		devPark.showInfo();
		devPark.showLang();
		
		Writer writerLee = new Writer("이지윤", 28, "대전", 160, 50, 2);
		writerLee.showInfo();
		writerLee.showExper();
	}
}
