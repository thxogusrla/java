package chapter7;

import java.util.*;

public class 실습문제4 {
	public static void print(Vector<Integer> v) {
		int sum = 0;
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			int n = it.next(); //다음 요소 값을 n에 저장한다.
			System.out.println(n + " ");
			sum += n;
		}
		System.out.println();
		System.out.println("현재 평균 " + sum / v.size());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while (true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int rain = sc.nextInt();
			if (rain == 0)
				break;
			v.add(rain);
			print(v);
		}
	sc.close();
	}
}
