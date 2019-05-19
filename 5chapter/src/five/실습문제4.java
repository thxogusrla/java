package five;

import java.util.Scanner;

abstract class Converter1 { // 디폴트로 되어있으면 자동으로 public
	abstract protected double convert(double src);

	abstract protected String getSrcString();

	abstract protected String getDestString();

	protected double ratio;

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과:" + res + getDestString() + "입니다.");
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
public class 실습문제4 {
	public static void main(String []args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
