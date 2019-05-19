package five;

import java.util.Scanner;

interface Stack1 {
	int length(); // 현재 스택에 저장된 개수 리턴.

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴.

	String Pop(); // 스택의 top에 실수 저장

	boolean push(String val); // 스택의 top에 저장된 실수 리턴.
}

class StringStack1 implements Stack1 {
	String stack[];
	int size, top;

	public StringStack1(int size) { // 스택을 새로 만들어준다.
		this.size = size;
		this.stack = new String[this.size]; // 객체 배열을 선언해 주었네.
		this.top = -1; // top이 0이면 값을 가지고 있다는 것이 된다.
	}

	public int length() { // 현재 스택에 저장된 개수 리턴.
		return this.top + 1;
	}

	public int capacity() {
		return this.size - (this.top + 1);
	}

	public String Pop() { // 탑을 제거후 반환.
		this.top = this.top - 1;
		return this.stack[this.top + 1];
		// 위에서 탑을 하나 제거해준 값을 저장했기 때문에 1을 더해 주어야 한다.
	}

	public boolean push(String val) { // 스택에 값을 저장하는 함수.
		if (top < size - 1) {
			this.top++;
			this.stack[top] = val;
			return true;
		} else {
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return false;

		}
	}
}

public class 실습문제9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		int size = sc.nextInt();
		StringStack1 stack = new StringStack1(size);

		while (true) {

			System.out.print("문자열 입력 >>");
			String input = sc.next();
			if (input.equals("그만"))
				break;
			stack.push(input);
			System.out.println("top의 크기는?" + stack.top);
			System.out.println("스택의 크기는?"+stack.length());

		}
		for (int i = 0; i < 3; i++) {
			System.out.print("top의 크기는?" + stack.top);
			System.out.println(stack.Pop() + " ");
		}
		System.out.print("Stack의 크기=" + stack.length());
		sc.close();
	}
}
