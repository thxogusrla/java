package five;

import java.util.Scanner;

abstract class Shape{
   private Shape next;
   public Shape() {next=null;}
   public void setNext(Shape obj) {next=obj;}
   public Shape getNext() {return next;}
   public abstract String draw();
}

class Line extends Shape{
	public String draw() {
		return "Line";
	}
}

class Rect extends Shape{
	public String draw() {
		return "Rect";
	}
}

class Circle extends Shape{
	public String draw() {
		return "Circle";
	}
}
class run{
	Shape head;
	Shape tail;
	int count=0;
	
	//����
	public void insert(Shape beauty, int num) {
		switch(num) {
		case 1: //Line
			beauty = new Line();
			break;
		case 2:
			beauty = new Rect();
			break;
		case 3:
			beauty = new Circle();
			break;
		}
		if(head==null) {
			head=beauty;
			tail=beauty;
		}
		else {
			tail.setNext(beauty);
			tail=beauty;
		}
		count++;
	}
	
	//����
	public void delete(int num) {
		Shape temp=head;
		Shape x=null;
		
		for(int i=0; i<num-1; i++) {
			if(i==num-2)	x=temp;	//x�� ���� �� ���
			temp=temp.getNext();	//temp�� ������ ���		
		}
		
		if(num==1) {	//���� ó�� ��� ����
			if(head==tail)	head=tail=null;
			else	head=head.getNext();
		}
		
		
		else if(temp==null) {
			System.out.println("������ �� �����ϴ�.");
		}
		
		else if(temp==tail) {	//������ ��� ����
			tail=x;
			x.setNext(null);
		}
		
		else {	//�߰� ��� ����
			x.setNext(temp.getNext());
		}
	}
	
	//���
	public void show() {
		Shape temp=head;
		if(temp==null) {
			System.out.println("����� ������ �����ϴ�.");
		}
		else {
			System.out.println("====================");
			while(true) {
				System.out.print(temp.draw()+"  ");
				if(temp==tail)	break;
				temp=temp.getNext();
			}
			System.out.println();
			System.out.println("====================");
		}
	}
	
}
public class GraphicEditor {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Shape beauty = null;
		run test=new run();
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		boolean TF=true;
		
		while(TF) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int user=scanner.nextInt();
			
			switch(user) {
			case 1:	//����
				System.out.print("Line(1), Rect(2), Circle(3)>> ");
				int input=scanner.nextInt();
				test.insert(beauty, input);
				break;
				
			case 2:	//����
				System.out.print("������ ������ ��ġ>> ");
				int x=scanner.nextInt();
				test.delete(x);
				break;
				
			case 3:	//��� ����
				test.show();
				break;
				
			case 4:	//����
				System.out.println("beauty�� �����մϴ�.");
				TF=false;
				break;
			}
			System.out.println();
		}
	scanner.close();
	}
}