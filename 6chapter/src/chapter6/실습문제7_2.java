package chapter6;
import java.util.Scanner;
public class �ǽ�����7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(">>");
			String st = sc.nextLine();
			if(st.equals("�׸�")) {
				System.out.println("���α׷� ����"); break;
			}
			String array [] = st.split(" ");
			System.out.println("������ ������ "+ array.length);
		}
		sc.close();
	}
}
