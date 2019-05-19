package five;

class Point4 {
	private int x, y;

	public Point4(int x, int y) {
		if(x < 0 ) x = -x;
		if(y < 0 ) y = -y;
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

class PositivePoint extends Point4 {
	PositivePoint() {
		super(0, 0);
	}
	PositivePoint(int a , int b){
		super(a,b);
		if(a<0 || b < 0 ) super.move(0,0);
	}
	public String toString() {
		return(getx()+","+gety());
	}
	public void move(int a, int b) {
		if(a > 0 && b > 0) 
			super.move(a,b);
		else
			return ;
	}
}

public class 실습문제8 { //move 함수를 재정의 해주는 문제.
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10); 
		System.out.println(p.toString() + "입니다.");

		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}
