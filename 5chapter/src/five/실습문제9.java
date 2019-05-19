package five;

import java.util.Scanner;

interface Stack1 {
	int length(); // ���� ���ÿ� ����� ���� ����.

	int capacity(); // ������ ��ü ���� ������ ���� ����.

	String Pop(); // ������ top�� �Ǽ� ����

	boolean push(String val); // ������ top�� ����� �Ǽ� ����.
}

class StringStack1 implements Stack1 {
	String stack[];
	int size, top;

	public StringStack1(int size) { // ������ ���� ������ش�.
		this.size = size;
		this.stack = new String[this.size]; // ��ü �迭�� ������ �־���.
		this.top = -1; // top�� 0�̸� ���� ������ �ִٴ� ���� �ȴ�.
	}

	public int length() { // ���� ���ÿ� ����� ���� ����.
		return this.top + 1;
	}

	public int capacity() {
		return this.size - (this.top + 1);
	}

	public String Pop() { // ž�� ������ ��ȯ.
		this.top = this.top - 1;
		return this.stack[this.top + 1];
		// ������ ž�� �ϳ� �������� ���� �����߱� ������ 1�� ���� �־�� �Ѵ�.
	}

	public boolean push(String val) { // ���ÿ� ���� �����ϴ� �Լ�.
		if (top < size - 1) {
			this.top++;
			this.stack[top] = val;
			return true;
		} else {
			System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			return false;

		}
	}
}

public class �ǽ�����9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >>");
		int size = sc.nextInt();
		StringStack1 stack = new StringStack1(size);

		while (true) {

			System.out.print("���ڿ� �Է� >>");
			String input = sc.next();
			if (input.equals("�׸�"))
				break;
			stack.push(input);
			System.out.println("top�� ũ���?" + stack.top);
			System.out.println("������ ũ���?"+stack.length());

		}
		for (int i = 0; i < 3; i++) {
			System.out.print("top�� ũ���?" + stack.top);
			System.out.println(stack.Pop() + " ");
		}
		System.out.print("Stack�� ũ��=" + stack.length());
		sc.close();
	}
}
