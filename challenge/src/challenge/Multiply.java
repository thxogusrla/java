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
			System.out.println("���ϰ��� �ϴ� �� �� �Է�>>");	
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(n + "x" + m + "=" + "=" + n*m);
			start=false;
			}
			catch(InputMismatchException e)
			{
				System.out.println("������ �Է��ϼ���");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
