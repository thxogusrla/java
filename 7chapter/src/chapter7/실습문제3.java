package chapter7;

import java.util.HashMap;
import java.util.Scanner;

public class �ǽ�����3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nation = new HashMap<String, Integer>(); // String �� Integer �� �������ش�.
		System.out.println("���� �̸��� �α��� �Է��϶�.");
		while (true) {
			System.out.println("�����̸�, �α� >>");
			String name = sc.next();
			if (name.equals("�׸�"))
				break;
			int pop = sc.nextInt();
			nation.put(name, pop); // add�� �ƴ� put���� �������ش�.
		}
		System.out.println(" �α��˻� >>");
		String s = sc.next();
		Integer n = nation.get(s); // HashMap<String, Integer>�� �Ǿ��ֱ� ������ Integer �� ���־�� �Ѵ�.
		if (n == null)
			System.out.println(s + "�� ����� �����ϴ�.");
		else
			System.out.println(s + " ������ �α��� " + n + "�Դϴ�.");
		sc.close();
	}
}
