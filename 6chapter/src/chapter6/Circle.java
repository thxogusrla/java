package chapter6;

public class Circle {
	private int x, y, z;

	public Circle(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}
	public String toString() {
		return "Circle ("+x+","+y+")"+" 반지름"+z; 
	}
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(this.x == c.x && this.y == c.y) return true;
		else return false;
		}

	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b)) System.out.println("같은 원");
		else System.out.println("다른 원");
	}
}
