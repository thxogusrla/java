package five;

import java.util.Scanner;

abstract class Converter1 { // ����Ʈ�� �Ǿ������� �ڵ����� public
	abstract protected double convert(double src);

	abstract protected String getSrcString();

	abstract protected String getDestString();

	protected double ratio;

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "��" + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���:" + res + getDestString() + "�Դϴ�.");
		sc.close();
	}
}
class Km2Mile extends Converter1{
	Km2Mile(double a){
		ratio = a;
	}
	protected double convert(double src) {
		ratio = src / 1.6;
		return ratio;
	}
	protected String getSrcString() {
		return "km";
		}
	protected String getDestString() {
		return "mile";
	}
	
}
public class �ǽ�����4 {
	public static void main(String []args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
