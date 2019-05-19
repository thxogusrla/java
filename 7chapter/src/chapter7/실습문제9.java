package chapter7;
import java.util.ArrayList;

interface IStack<T> {
	public T pop();
	public boolean push(T ob);
}

// MyStack은 push() 새로 추가되는 아이템을 항상 맨 앞에 삽입한다.
// 그러므로 pop() 역시 맨 앞에 있는 아이템을 삭제한다. 
class MyStack<T> implements IStack<T> {
	ArrayList<T> l = null;
	public MyStack() {
		l = new ArrayList<T>();
	}

	@Override
	public T pop() {
		if (l.size() == 0)
			return null; 
		else {
			return l.remove(0); // 맨 앞에 있는 아이템 삭제
		}
	}

	@Override
	public boolean push(T ob) {
		l.add(0, ob); // 맨 끝에 삽입 
		return true;
	}
}
public class 실습문제9 {
	public static void main (String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0; i<10; i++) stack.push(i); // 10개의 정수 푸시
		while (true) { // 스택이 빌 때까지 pop
			Integer n = stack.pop();
			if(n == null) break; // 스택이 빈 경우
			System.out.print(n + " ");
		}
	}
	
}