package array_exception;

public class 실습문제1 {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		while (i < 100) {
			sum = sum + i;
			i+=2;
		}
		System.out.println(sum);
		int sum1 = 0  ;
		for(int i2 = 0 ; i2<100; i2+=2) {
			sum1+=i2;
		}
		System.out.println(sum1);
	}
}
