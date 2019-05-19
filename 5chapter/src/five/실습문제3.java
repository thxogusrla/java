package five;

import java.util.Scanner;

abstract class Converter { // ����Ʈ�� �Ǿ������� �ڵ����� public
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

class Won2Dollar extends Converter {
	double src;
	Won2Dollar (double a){
		this.src = a;
	}
	protected double convert(double src) { // 1 �޷� = 1200��; src = ��ȭ�� �Է�
		ratio = src / 1200;
		return ratio;
	}

	protected String getSrcString() { // ��ȭ�� ��ȯ�Ǿ�� �Ѵ�.
		return "��";
	}

	protected String getDestString() {
		return "�޷�";
	}

}

public class �ǽ�����3 {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
