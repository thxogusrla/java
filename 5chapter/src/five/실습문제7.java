package five;

class Point3 {
	private int x, y;

	public Point3(int x, int y) {
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

class Point3D extends Point3 {
	private int z;

	Point3D(int a, int b, int c) {
		super(a, b);
		this.z = c;
	}

	void moveUP() {
		this.z += 1;
	}

	void moveDown() {
		this.z -= 1;
	}

	public String toString() {
		return ("("+getx()+","+gety()+","+getz()+")의 점");
	}

	void move(int a, int b, int c) {
		move(a,b);
		this.z = c;
	}
	int getz() { return this.z;}
}

public class 실습문제7 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "입니다.");

		p.moveUP();
		System.out.println(p.toString() + "입니다.");
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(100, 200, 300);
		System.out.println(p.toString());
	}
}
