package class_chapter;
import java.util.Scanner;
class grade{
	int a,b,c;
	grade(int x, int y , int z){
		a = x; b = y ; c = z;		
	}
	int average() {
		return (a+b+c)/3;
	}
}
public class 실습문제2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		grade me = new grade(math, science, english);
		System.out.println("평균은 " + me.average());
		sc.close();
	}
}
