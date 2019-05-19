package chapter6;

class MyPoint1 {
	private int x, y;

	MyPoint1(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public String toString() {
		
		return "Point ("+x+","+y+")";
	}
	public boolean equals(Object obj) {
			MyPoint1 my = (MyPoint1)obj;
			if(x == my.x && y == my.y) return true;
			else return false;		
	}
}

public class 실습문제1 {
	public static void main(String[] args) {
		MyPoint1 p = new MyPoint1(3, 50);
		MyPoint1 q = new MyPoint1(4, 50);
		System.out.println(p.toString());

		if (p.equals(q))
			System.out.println("같은점");
		else
			System.out.println("다른점");
	}
}
