package hello;
import java.util.Scanner;

public class report312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = { "java", "c++", "html5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		while (true) {
			System.out.print("과목이름>>");
			String name = sc.next();
			if (name.equals("그만")) break; // 문자열 비교는 == 사용하면c 안되고 equals를 이용해야함.
			for (int i = 0; i < course.length; i++ ) 
			{
				if (course[i].equals(name)) 
				{
					System.out.println(course[i] + "의 점수는" + " " + score[i] + "입니다.");
					break;
				} 
				else if( i == 4 ) System.out.println("잘못입력하셨습니다.");
			}	
		}
		sc.close();
	}
}