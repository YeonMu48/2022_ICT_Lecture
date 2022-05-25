package abstractEx;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	
	//final을 사용하여 템플릿 고정(재정의 불가)
	public final void run() {
		startCar();
		drive();
		stop();
		turnoff();
	}
}
