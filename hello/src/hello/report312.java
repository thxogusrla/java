package hello;
import java.util.Scanner;

public class report312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = { "java", "c++", "html5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };
		while (true) {
			System.out.print("�����̸�>>");
			String name = sc.next();
			if (name.equals("�׸�")) break; // ���ڿ� �񱳴� == ����ϸ�c �ȵǰ� equals�� �̿��ؾ���.
			for (int i = 0; i < course.length; i++ ) 
			{
				if (course[i].equals(name)) 
				{
					System.out.println(course[i] + "�� ������" + " " + score[i] + "�Դϴ�.");
					break;
				} 
				else if( i == 4 ) System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}	
		}
		sc.close();
	}
}