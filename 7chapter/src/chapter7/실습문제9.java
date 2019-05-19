package chapter7;
import java.util.ArrayList;

interface IStack<T> {
	public T pop();
	public boolean push(T ob);
}

// MyStack�� push() ���� �߰��Ǵ� �������� �׻� �� �տ� �����Ѵ�.
// �׷��Ƿ� pop() ���� �� �տ� �ִ� �������� �����Ѵ�. 
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
			return l.remove(0); // �� �տ� �ִ� ������ ����
		}
	}

	@Override
	public boolean push(T ob) {
		l.add(0, ob); // �� ���� ���� 
		return true;
	}
}
public class �ǽ�����9 {
	public static void main (String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0; i<10; i++) stack.push(i); // 10���� ���� Ǫ��
		while (true) { // ������ �� ������ pop
			Integer n = stack.pop();
			if(n == null) break; // ������ �� ���
			System.out.print(n + " ");
		}
	}
	
}