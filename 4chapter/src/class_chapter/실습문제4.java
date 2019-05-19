package class_chapter;

class rectangle{
	int x, y, width, height;
	rectangle(int a,int b,int w,int h){
		x = a; y = b; width = w; height = h;
	}
	void show() {
		System.out.println("(" + x + ","+y+")에서 크기가 "+width+"*"+ height+"인 사각형");
	}
	int square() {
		return width*height;
	}
	boolean contains(rectangle r) {
		if (r != null) return true;
		else return false;
	}
}

public class 실습문제4 {
	public static void main(String args[])
	{
		rectangle r = new rectangle(2,2,8,7);
		rectangle s = new rectangle(5,5,6,6);
		rectangle t = new rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 "+ s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함");
		if(t.contains(s)) System.out.println("t는 s를 포함");
	}
}
