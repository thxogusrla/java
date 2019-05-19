package challenge;

public class Circle { //c++로 치면 public class Circle 안에 포함된 것들이 소스파일에 작성된 거라고 봐도 되나?
	int radius;
	String name;

	public Circle() { //인자가 없는 생성자이고
		radius = 1; name ="";
	}
	
	public Circle(int r, String n) { //인자가 두개인 생성자 이기 때문에 오버로딩이 가능하여 두개가 존재 하넴. 
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args)
	{
		Circle pizza = new Circle(10, "자바피자"); //Circle pizza가 class Circle의 객체가 되어서 인자가 두개인 생성자 Circle을 받아 초기화 된건가?
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은"+area);
		
		Circle donut = new Circle();
		donut.name="도넛피자";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은"+area);
	}
}

