package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class �ǽ�����2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> ch = new ArrayList<Character>();
		System.out.println("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>>");
		for (int i = 0; i < 6; i++) {
			String s = sc.next();
			if (s.length() < 1) {
				System.out.println("invalid value");
				return;
			}
			char c = s.charAt(0);
			if ((c >= 'A' && c <= 'D') || c == 'F') {
				ch.add(c);
			}
		}
		double score = 0.0;
		for (int i = 0; i < ch.size(); i++) {
			char c = ch.get(i);
			switch (c) {
			case 'A': score += 4.0; break;
			case 'B': score += 3.0; break;
			case 'C': score += 2.0; break;
			case 'D': score += 1.0; break;
			case 'F': score += 0.0; break;
			
			}
		}
		System.out.println("������ ����� "+score/6);
		sc.close();
	}
}
