package extendsEX2;

public class main {
	public static void main(String[] args) {
		Developer devPark = new Developer("������", 32, "����", 200, 100, 7);
		devPark.showInfo();
		devPark.showLang();
		
		Writer writerLee = new Writer("������", 28, "����", 160, 50, 2);
		writerLee.showInfo();
		writerLee.showExper();
	}
}
