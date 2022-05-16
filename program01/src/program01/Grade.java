package program01;

public class Grade {

	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public int average() {
		int k = (this.math + this.science + this.english) / 3;
		return k;
	}
}
