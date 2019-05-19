package chapter6;

class Point1 {
	public int x, y;

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) {
		Point1 p = (Point1) obj; // Point1 클래스로 강제 형변환.
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class 예제6_3 {
	public static void main(String[] args) {
		Point1 a = new Point1(2, 3);
		Point1 b = new Point1(2, 3);
		Point1 c = new Point1(3, 4);
		if (a == b)
			System.out.println("a==b");
		if (a.equals(b))
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");

	}
}
