package chapter7;
import java.util.Vector;
class Point1{
	private int x,y;
	public Point1(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}
public class 예제7_2 {
	public static void main(String[] args) {
		Vector<Point1> v = new Vector<Point1>(); //Point 객체를 다루는 벡터를 생성.
		v.add(new Point1(2,3));
		v.add(new Point1(-5,20)); //1번째 인덱스를 삭제했으니 해당 값들이 삭제됨.
		v.add(new Point1(30,-8));
		
		v.remove(1); //1 인덱스에 있는 요소 삭제.
		for(int i = 0 ; i<v.size(); i++) {
			Point1 p = v.get(i); //벡터의 i번째 값 Point 객체 얻어내기.
			System.out.println(p);
		}
	}
}
