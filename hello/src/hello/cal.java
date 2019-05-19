package hello;
import java.util.Scanner;
public class cal {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 입력:");
		double a = sc.nextDouble();
		String calcu = sc.next();
		double b = sc.nextDouble();
		
		//sc.nextLine(); 버퍼에 남아있는 엔터키 값을 제거해야 다음 nextLine 값을 인식한다.
		switch(calcu) {
		
		case "+": System.out.println(a+"+"+b+"의 값은 " +(a+b)+"입니다."); break;
		case "-": System.out.println(a+"-"+b+"의 값은 " +(a-b)+"입니다."); break;
		case "*": System.out.println(a+"*"+b+"의 값은 " +(a*b)+"입니다.")	; break;
		case "/":
			if( b == 0 ) System.out.println("0으로 나눌 수 없습니다.");
			else
			System.out.println(a+"/"+b+"의 값은 " +(a/b)+"입니다."); break;
		
		default: System.out.println("잘못입력하셨습니다.");
		
		}
		sc.close();
	}		
	
}
