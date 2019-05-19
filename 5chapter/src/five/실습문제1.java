package five;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getsize() {
		return size;
	}

}

//class ColorTV extends TV {
//	public int size;
//
//	ColorTV(int a, int b) {
//		super(a);
//		this.size = b;
//	}
//
//	void printProperty() {
//		System.out.println(getsize() + "인치 " + size + "컬러");
//	}
//}
//
//public class 실습문제1 {
//	public static void main(String[] args) {
//		ColorTV myTV = new ColorTV(32, 1024);
//		myTV.printProperty();
//	}
//}
