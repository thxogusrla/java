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
public class �ǽ�����2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		grade me = new grade(math, science, english);
		System.out.println("����� " + me.average());
		sc.close();
	}
}
