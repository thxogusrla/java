package chapter6;
import java.util.Scanner;
public class 실습문제7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(">>");
			String st = sc.nextLine();
			if(st.equals("그만")) {
				System.out.println("프로그램 종료"); break;
			}
			String array [] = st.split(" ");
			System.out.println("어절의 개수는 "+ array.length);
		}
		sc.close();
	}
}
