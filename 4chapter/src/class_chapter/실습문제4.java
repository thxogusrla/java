package class_chapter;

class rectangle{
	int x, y, width, height;
	rectangle(int a,int b,int w,int h){
		x = a; y = b; width = w; height = h;
	}
	void show() {
		System.out.println("(" + x + ","+y+")���� ũ�Ⱑ "+width+"*"+ height+"�� �簢��");
	}
	int square() {
		return width*height;
	}
	boolean contains(rectangle r) {
		if (r != null) return true;
		else return false;
	}
}

public class �ǽ�����4 {
	public static void main(String args[])
	{
		rectangle r = new rectangle(2,2,8,7);
		rectangle s = new rectangle(5,5,6,6);
		rectangle t = new rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ "+ s.square());
		if(t.contains(r)) System.out.println("t�� r�� ����");
		if(t.contains(s)) System.out.println("t�� s�� ����");
	}
}
