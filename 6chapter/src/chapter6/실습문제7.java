package chapter6;

import java.util.StringTokenizer;
import java.util.Scanner;

public class �ǽ�����7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(">>");
			String s = sc.nextLine();
			if (s.equals("�׸�")) {
				System.out.println("���α׷� ����");
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println("������ ������" + st.countTokens());
		}
		sc.close();
	}
}
