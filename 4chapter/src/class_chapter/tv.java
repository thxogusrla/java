package class_chapter;
class tv1{
	int a,b;
	String c;
	tv1(String model, int x, int y) {
		a = x; 
		b = y;
		c = model;
	}
	void show() {
		System.out.println(c+"에서    만든      " + a + "년형 	 " + b + "인치   TV");
	}
}
public class tv {
	public static void main(String [] args) {
		tv1 mytv = new tv1("LG", 2017, 32);
		mytv.show();
	}
}


