package chapter6;

import java.util.StringTokenizer;
import java.util.Scanner;

public class 실습문제7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(">>");
			String s = sc.nextLine();
			if (s.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println("어절의 개수는" + st.countTokens());
		}
		sc.close();
	}
}
