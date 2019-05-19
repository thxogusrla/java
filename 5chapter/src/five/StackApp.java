package five;

import java.util.Scanner;

interface Stack2 {
	int length(); // 현재 스택에 저장된 개수 리턴

	int capacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 top에 실수 저장

	boolean push(String val); // 스택의 top에 저장된 실수 리턴
}

class StringStack2 implements Stack2 {
	int size, top;
	String stack1[];

	public StringStack2(int size) {
		this.size = size;
		this.top = -1;
		this.stack1 = new String[this.size]; // 객체 배열이 아니네 ㅅㅂ;;

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
		if (top < size - 1) { //스택이 비었는지 체크하고 비어 있다면 top을 하나 증가 시키고 val을 저장.
			this.top++;
			this.stack1[top] = val;
			return true;
		} else {
			System.out.println("스택이 가득 참.");
			return false;
		}
	}
}

public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		int size = sc.nextInt();
		StringStack1 stack = new StringStack1(size);
		while(true) {
			System.out.print("문자열 입력 >>");
			String temp = sc.next();
			if(temp.equals("그만")) break;
			stack.push(temp);
		}
		for(int i = 0 ; i<size; i++) {
			System.out.println(stack.Pop() + " ");
		}
		sc.close();
		
	}
}