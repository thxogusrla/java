package chapter6;

class Point_p344 {
	private int x, y;

	public Point_p344(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class 예제6_1 {
	/*
	 * boolean equals(Object obj) a.equals(obj) a와 obj 를 비교해서 ture or false로 리턴함.
	 * class getClass() 현 객체의 런타임 클래스를 리턴 int hashCode() 현 객체에 대한 해시 코드 값 리턴 String
	 * toString() 현 객체에 대한 문자열을 표현을 리턴. void notify() 현 객체에 대기하고 있는 하나의 스레드를 깨운다.
	 * void notifyAll() 현 객체에 대해 대기하고 있는 모든 스레드를 깨움. void wait() 다른 스레드가 깨울 떄까지 현재
	 * 스레드를 대기하게 한다.
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
