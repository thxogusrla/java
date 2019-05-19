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
	
	//삽입
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
	
	//삭제
	public void delete(int num) {
		Shape temp=head;
		Shape x=null;
		
		for(int i=0; i<num-1; i++) {
			if(i==num-2)	x=temp;	//x는 삭제 전 노드
			temp=temp.getNext();	//temp는 삭제할 노드		
		}
		
		if(num==1) {	//제일 처음 노드 삭제
			if(head==tail)	head=tail=null;
			else	head=head.getNext();
		}
		
		
		else if(temp==null) {
			System.out.println("삭제할 수 없습니다.");
		}
		
		else if(temp==tail) {	//마지막 노드 삭제
			tail=x;
			x.setNext(null);
		}
		
		else {	//중간 노드 삭제
			x.setNext(temp.getNext());
		}
	}
	
	//출력
	public void show() {
		Shape temp=head;
		if(temp==null) {
			System.out.println("출력할 도형이 없습니다.");
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
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		boolean TF=true;
		
		while(TF) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int user=scanner.nextInt();
			
			switch(user) {
			case 1:	//삽입
				System.out.print("Line(1), Rect(2), Circle(3)>> ");
				int input=scanner.nextInt();
				test.insert(beauty, input);
				break;
				
			case 2:	//삭제
				System.out.print("삭제할 도형의 위치>> ");
				int x=scanner.nextInt();
				test.delete(x);
				break;
				
			case 3:	//모두 보기
				test.show();
				break;
				
			case 4:	//종료
				System.out.println("beauty를 종료합니다.");
				TF=false;
				break;
			}
			System.out.println();
		}
	scanner.close();
	}
}