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
public class ����7_2 {
	public static void main(String[] args) {
		Vector<Point1> v = new Vector<Point1>(); //Point ��ü�� �ٷ�� ���͸� ����.
		v.add(new Point1(2,3));
		v.add(new Point1(-5,20)); //1��° �ε����� ���������� �ش� ������ ������.
		v.add(new Point1(30,-8));
		
		v.remove(1); //1 �ε����� �ִ� ��� ����.
		for(int i = 0 ; i<v.size(); i++) {
			Point1 p = v.get(i); //������ i��° �� Point ��ü ����.
			System.out.println(p);
		}
	}
}
