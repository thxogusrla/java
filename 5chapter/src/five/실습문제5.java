package five;

class Point1 {
	private int x, y;

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point1 {
	String color;

	ColorPoint(int a, int b, String c) {
		super(a, b);
		color = c;
	}

	void setxy(int a, int b) {
		move(a, b);
	}

	void setcolor(String color) {
		this.color = color;
	}

	public String toString() {
		return (this.color + "색의" + "(" + getx() + "," + gety() + ")" + "의 점");
	}

}

public class 실습문제5 {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setxy(10, 20);
		cp.setcolor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
