package hello;

import java.util.*;

public class 김태현_1 {
	static double[] input() throws Exception {
		Scanner sc = new Scanner(System.in);
		Vector<Double> v = new Vector<Double>();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		v.add(a);
		v.add(b);
		v.add(c);
		double[] d = new double[v.size()];
		if (d.length == 0)
			throw new Exception("no data");
		for (int i = 0; i < v.size(); i++) {
			d[i] = v.get(i);
		}
		sc.close();
		return d;
	}

	static double average(double[] a) {
		double avr = 0.0;
		for (var i = 0; i < a.length; i++) {
			avr += a[i];
		}
		return avr / a.length;
	}

	public static void main(String[] args) {
		try {
			System.out.println("이름 김태현:학번 201533005");
			System.out.print("Enter numbers: ");
			var a = input();
			System.out.println("Average = " + average(a));
		} catch (Exception a) {
			System.out.println("no data");
		}
	}
}