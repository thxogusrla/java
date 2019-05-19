//package chapter6;
//class Rect{
//	int width;
//	int height;
//	public Rect(int width, int height) {
//		this.width = width; this.height = height;
//	}
//	public boolean equals(Object obj) {
//		Rect p = (Rect)obj; //모든 클래스의 상위에는 object 클래스가 있으므로 다운캐스팅이 이뤄짐.
//		if(width*height == p.width*p.height) return true;
//		else return false;
//	}
//}
//public class 예제6_4 {
//	public static void main(String[] args) {
//		Rect a = new Rect(2,3);
//		Rect b = new Rect(3,2);
//		Rect c = new Rect(3,4);
//		if(a.equals(b)) System.out.println("a is equal to b");
////		if(a.equals(c)) System.out.println("a is equal to c");
//		if(b.equals(c)) System.out.println("b is equal to c");
//	}
//}