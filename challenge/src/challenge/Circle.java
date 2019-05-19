package challenge;

public class Circle { //c++�� ġ�� public class Circle �ȿ� ���Ե� �͵��� �ҽ����Ͽ� �ۼ��� �Ŷ�� ���� �ǳ�?
	int radius;
	String name;

	public Circle() { //���ڰ� ���� �������̰�
		radius = 1; name ="";
	}
	
	public Circle(int r, String n) { //���ڰ� �ΰ��� ������ �̱� ������ �����ε��� �����Ͽ� �ΰ��� ���� �ϳ�. 
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args)
	{
		Circle pizza = new Circle(10, "�ڹ�����"); //Circle pizza�� class Circle�� ��ü�� �Ǿ ���ڰ� �ΰ��� ������ Circle�� �޾� �ʱ�ȭ �Ȱǰ�?
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������"+area);
		
		Circle donut = new Circle();
		donut.name="��������";
		area = donut.getArea();
		System.out.println(donut.name+"�� ������"+area);
	}
}

