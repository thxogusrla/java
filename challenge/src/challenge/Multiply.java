package challenge;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		boolean start = true;
		while(start){
			try 
			{
			System.out.println("곱하고자 하는 두 수 입력>>");	
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(n + "x" + m + "=" + "=" + n*m);
			start=false;
			}
			catch(InputMismatchException e)
			{
				System.out.println("정수만 입력하세요");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
