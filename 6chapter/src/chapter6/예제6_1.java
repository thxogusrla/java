package chapter6;

class Point_p344 {
	private int x, y;

	public Point_p344(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ����6_1 {
	/*
	 * boolean equals(Object obj) a.equals(obj) a�� obj �� ���ؼ� ture or false�� ������.
	 * class getClass() �� ��ü�� ��Ÿ�� Ŭ������ ���� int hashCode() �� ��ü�� ���� �ؽ� �ڵ� �� ���� String
	 * toString() �� ��ü�� ���� ���ڿ��� ǥ���� ����. void notify() �� ��ü�� ����ϰ� �ִ� �ϳ��� �����带 �����.
	 * void notifyAll() �� ��ü�� ���� ����ϰ� �ִ� ��� �����带 ����. void wait() �ٸ� �����尡 ���� ������ ����
	 * �����带 ����ϰ� �Ѵ�.
	 * 
	 */
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}

	public static void main(String[] args) {
		Point_p344 p = new Point_p344(2, 3);
		print(p);
	}
}
