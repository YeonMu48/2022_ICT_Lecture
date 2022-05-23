
public class People {
	String name;
	double grade;
	
	
	
	public People(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String getName() {
		return this.name;
	}
	public double getGrade() {
		return this.grade;
	}
	
	public void showInfo() {
		System.out.println("¿Ã∏ß : " + this.getName());
	}

}
