package chapter7;

import java.util.*;

public class �ǽ�����4 {
	public static void print(Vector<Integer> v) {
		int sum = 0;
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			int n = it.next(); //���� ��� ���� n�� �����Ѵ�.
			System.out.println(n + " ");
			sum += n;
		}
		System.out.println();
		System.out.println("���� ��� " + sum / v.size());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while (true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int rain = sc.nextInt();
			if (rain == 0)
				break;
			v.add(rain);
			print(v);
		}
	sc.close();
	}
}
