package challenge;
import java.util.Scanner;
class Circle1 {
	private double x,y;
	private int radius;
	public Circle1(double x, double y, int radius)
	{
		this.x = x; this.y=y; this.radius=radius;
	}
	public void show() {
		System.out.println("가장 면적이 큰 원은 "+"("+x+","+y+")"+radius);
	}
	public double getarea() {
		return 3.14*radius*radius;
	}
}
public class Circlereport {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Circle1 manager [] = new Circle1[3];
		double result[] = new double[3];

		for(int i = 0 ; i<manager.length ;i++)
		{
			System.out.println("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			manager[i] = new Circle1(x ,y ,radius);
			result[i] = manager[i].getarea();
		}
		double big = result[0];
		for (int i = 0 ; i<result.length; i++) {
			
			if(big < result[i]) big = result[i];
		}
		for(int i = 0 ; i<result.length; i++)
		{
			if(big == result[i]) manager[i].show();
		}
		sc.close();
	}
}