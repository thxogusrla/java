package hello;
import java.util.Scanner;
public class cal {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǽ� �Է�:");
		double a = sc.nextDouble();
		String calcu = sc.next();
		double b = sc.nextDouble();
		
		//sc.nextLine(); ���ۿ� �����ִ� ����Ű ���� �����ؾ� ���� nextLine ���� �ν��Ѵ�.
		switch(calcu) {
		
		case "+": System.out.println(a+"+"+b+"�� ���� " +(a+b)+"�Դϴ�."); break;
		case "-": System.out.println(a+"-"+b+"�� ���� " +(a-b)+"�Դϴ�."); break;
		case "*": System.out.println(a+"*"+b+"�� ���� " +(a*b)+"�Դϴ�.")	; break;
		case "/":
			if( b == 0 ) System.out.println("0���� ���� �� �����ϴ�.");
			else
			System.out.println(a+"/"+b+"�� ���� " +(a/b)+"�Դϴ�."); break;
		
		default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
		
		}
		sc.close();
	}		
	
}
