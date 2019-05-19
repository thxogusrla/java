package five;


class ColorTV1  {
	private int tvsize;
	private int colorsize;
	ColorTV1(int a, int b) {
		
		this.tvsize = a;
		this.colorsize =b; 
	}
	int get_colorsize() {
		return this.colorsize;
	}
	int get_tvsize() {
		return this.tvsize;
	}
	void printProperty() {
		System.out.println(tvsize + "인치 " + colorsize + "컬러");
	}
}

class IPTV extends ColorTV1 {
	public String ipaddress;
	IPTV(String address, int b, int c){
		super(b,c);
		this.ipaddress = address;
	}
	void printProperty() {
		System.out.println("나의 iptv는 " + ipaddress + "주소의" +get_tvsize()+ "인치 " + get_colorsize()+"컬러");
	}
}

public class 실습문제2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
