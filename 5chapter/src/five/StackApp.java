package five;

import java.util.Scanner;

interface Stack2 {
	int length(); // ���� ���ÿ� ����� ���� ����

	int capacity(); // ������ ��ü ���� ������ ���� ����

	String pop(); // ������ top�� �Ǽ� ����

	boolean push(String val); // ������ top�� ����� �Ǽ� ����
}

class StringStack2 implements Stack2 {
	int size, top;
	String stack1[];

	public StringStack2(int size) {
		this.size = size;
		this.top = -1;
		this.stack1 = new String[this.size]; // ��ü �迭�� �ƴϳ� ����;;

	}

	public int length() {
		return this.top + 1;
	}

	public int capacity() {
		return this.size - (this.top + 1);
	}

	public String pop() {
		this.top = this.top - 1;
		return stack1[top + 1];
	}

	public boolean push(String val) {
		if (top < size - 1) { //������ ������� üũ�ϰ� ��� �ִٸ� top�� �ϳ� ���� ��Ű�� val�� ����.
			this.top++;
			this.stack1[top] = val;
			return true;
		} else {
			System.out.println("������ ���� ��.");
			return false;
		}
	}
}

public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >>");
		int size = sc.nextInt();
		StringStack1 stack = new StringStack1(size);
		while(true) {
			System.out.print("���ڿ� �Է� >>");
			String temp = sc.next();
			if(temp.equals("�׸�")) break;
			stack.push(temp);
		}
		for(int i = 0 ; i<size; i++) {
			System.out.println(stack.Pop() + " ");
		}
		sc.close();
		
	}
}