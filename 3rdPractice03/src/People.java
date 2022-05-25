import java.util.ArrayList;

public class People {
	public String name;
	public double grade;
	
	
	
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
	public void checkGrade() {
		if(this.grade >= 4.0) {
			System.out.println("¿Ã∏ß : " + getName());			
		}
}
