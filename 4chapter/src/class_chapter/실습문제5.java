package class_chapter;
import java.util.Scanner;
class circle{
	private double x,y;
	private int radius;
	public circle(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius= radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+ radius);
	}
}

public class 실습문제5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		circle c[] = new circle[3];
		for( int i = 0 ; i<c.length; i++)
		{
			System.out.print("x,y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new circle(x,y,radius);
		}
		for (int i = 0 ; i<c.length; i++) c[i].show();
		sc.close();
	}
}
