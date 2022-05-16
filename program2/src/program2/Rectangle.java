package program2;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		int k = this.width * this.height;
		return k;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	public boolean contains(Rectangle r) {
		if(r.square() <= this.square()) {
			if(r.x + r.y >= this.x + r.y && r.x + r.width <= this.x + this.width && r.y + r.height <= this.y + this.height ) {		
				return  true;
			}else {
				return false; }
		}else {
			return false;
		}
	}
}