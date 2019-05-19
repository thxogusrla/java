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

public class �ǽ�����8 { //move �Լ��� ������ ���ִ� ����.
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10); 
		System.out.println(p.toString() + "�Դϴ�.");

		p.move(-5, 5);
		System.out.println(p.toString() + "�Դϴ�.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}
}
