package chapter6;
import java.util.Scanner;
public class �ǽ�����8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� �Է�");
		String st = sc.nextLine();
		for(int i = 0 ; i<st.length(); i++) {
			String first = st.substring(0,1);
			String last = st.substring(1); 
			st = last+first;
			System.out.println(st);
		}
		sc.close();
	}
}
