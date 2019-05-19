package array_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 실습15예외 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("곱하고자하는 두수 입력:");
		try {
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("두 수의 곱은=" + n*m);
		sc.close();
		}
		catch (InputMismatchException e) {
			System.out.println("실수 입력하면 안됨.");
			sc.nextLine();
		}
	}
}
