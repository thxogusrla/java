package array_exception;
import java.util.Scanner;
public class 실습3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("정수를 입력하시오:");
		int a = sc.nextInt();
		for(int i =a ; i>0; i--) {
			for(int j = 0 ; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
}
