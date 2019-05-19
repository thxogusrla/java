package chapter6;

public class 예제6_6 {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; //자동 박싱이 이뤄짐. 기본타입인 n을 wrapper타입인 intObject 에 대입해준다.
		System.out.println("intObject = "+intObject);
		int m = intObject + 10;
		System.out.println("m = "+m); // 20
		String var1 = Integer.toString(100); //정수 100을 문자열로 변환한다. 
		System.out.println(var1+"sadz");
		
	}
}
