package five;

import java.util.Scanner;

abstract class Converter { // 디폴트로 되어있으면 자동으로 public
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

class Won2Dollar extends Converter {
	double src;
	Won2Dollar (double a){
		this.src = a;
	}
	protected double convert(double src) { // 1 달러 = 1200원; src = 원화를 입력
		ratio = src / 1200;
		return ratio;
	}

	protected String getSrcString() { // 원화가 반환되어야 한다.
		return "원";
	}

	protected String getDestString() {
		return "달러";
	}

}

public class 실습문제3 {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
