package chapter6;

class Rect{
	int width, height;
	public Rect(int a, int b) {
		this.height = a; this.width = b;
	}
	public boolean equals(Object obj) {
		Rect a = (Rect)obj; //���� ���϶�.
		if(width*height == a.height*a.width)
			return true;
		else return false;
	}
}
public class ����6_4{
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(b.equals(c)) System.out.println("b is equal to c");
	}
}
