package chapter7;

import java.util.Scanner;
import java.util.Vector;

public class �ǽ�����1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("����(-1�� �Է� �� ������)>>");
		while (true) {
			int n = sc.nextInt();
			if (n == -1)
				break;
			v.add(n);
		}
		int big = v.get(0);
		for (int i = 0; i < v.size(); i++) {
			if (big < v.get(i)) {
				big = v.get(i);
			}
		}
		System.out.println(big);
		sc.close();
	}
}
