package five;
class Shape {
	protected String name;
	public void print() { draw(); }
	public void draw() {
		System.out.println(name);
	}
	
}

public class Circle extends Shape {
	protected String name;
	public void draw() {
		name = "Circle";
		super.name = "shape";
		super.draw();
		System.out.println(name);
	}
	public static void main(String[] args) {
		Shape b = new Circle();
		b.print();
	}
}

