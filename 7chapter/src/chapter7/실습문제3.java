package chapter7;

import java.util.HashMap;
import java.util.Scanner;

public class 실습문제3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nation = new HashMap<String, Integer>(); // String 과 Integer 로 저장해준다.
		System.out.println("나라 이름과 인구를 입력하라.");
		while (true) {
			System.out.println("나라이름, 인구 >>");
			String name = sc.next();
			if (name.equals("그만"))
				break;
			int pop = sc.nextInt();
			nation.put(name, pop); // add가 아닌 put으로 저장해준다.
		}
		System.out.println(" 인구검색 >>");
		String s = sc.next();
		Integer n = nation.get(s); // HashMap<String, Integer>로 되어있기 때문에 Integer 로 해주어야 한다.
		if (n == null)
			System.out.println(s + "의 나라는 없습니다.");
		else
			System.out.println(s + " 나라의 인구는 " + n + "입니다.");
		sc.close();
	}
}
