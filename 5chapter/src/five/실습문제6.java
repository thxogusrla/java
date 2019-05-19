package five;
class Point2 {
	private int x, y;

	public Point2(int x, int y) {
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
class ColorPoint1 extends Point2{
	String color;
	ColorPoint1(){
		super(0,0);
	}
	ColorPoint1(int a, int b){
		super(a,b);
	}
	void setxy1(int a, int b) {
		move(a,b);
	}
	void setColor(String c) {
		this.color = c;
	}
	public String toString() {
		return (this.color+"색의"+ "(" + getx()+","+gety()+")의 점");
	}
}
public class 실습문제6 {
	public static void main(String[] args) {
		ColorPoint1 zeroPoint = new ColorPoint1();
		System.out.println(zeroPoint.toString()+"입니다");
		
		ColorPoint1 cp = new ColorPoint1(10,10);
		cp.setxy1(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	}
}
