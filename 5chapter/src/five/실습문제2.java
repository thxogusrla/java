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
		System.out.println(tvsize + "��ġ " + colorsize + "�÷�");
	}
}

class IPTV extends ColorTV1 {
	public String ipaddress;
	IPTV(String address, int b, int c){
		super(b,c);
		this.ipaddress = address;
	}
	void printProperty() {
		System.out.println("���� iptv�� " + ipaddress + "�ּ���" +get_tvsize()+ "��ġ " + get_colorsize()+"�÷�");
	}
}

public class �ǽ�����2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
