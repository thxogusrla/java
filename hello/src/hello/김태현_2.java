package hello;
import java.lang.Math;
abstract class Shape {
	private int x, y; // location

	Shape(int x_loc, int y_loc) {
		x = x_loc;
		y = y_loc;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	abstract double area();
}

class Circle extends Shape {
	double r; // radius

	Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	double area() {
		return this.r * this.r * Math.PI;
	}

	public String toString() {
		return "(" + getX() + "," + getY() + "," + this.r + ")";
	}
}

class Rect extends Shape {
	double w, h; // width, height

	Rect(int x, int y, double w, double h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}
	double area() {
		return this.w*this.h;
	}
	
	public String toString() {
		return "(" + getX() + "," + getY() + "," + this.w + "," + this.h + ")";
	}
}

public class 김태현_2 {
	static void show(Shape[] a) {
		System.out.println(a[0].toString());
		System.out.println(a[1].toString());
	}
	static double totalArea(Shape[] a) {
		return a[0].area() + a[1].area();
	}
	public static void main(String[] args) {
		System.out.println("이름:학번");
		Shape[] a = { new Circle(1, 1, 1), new Rect(2, 2, 2, 2) };
		show(a);
		System.out.println("total area = " + totalArea(a));
	}
}
