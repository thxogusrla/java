package chapter6;
import java.util.Calendar;
import java.util.Scanner;

class Player {
	private Scanner scanner = new Scanner(System.in);
	private String name;
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() { return name; }
	
	public int turn() {
		System.out.print(name + " ���� <Enter>Ű>>");
		// ������ �� �ð� ���
		String key = scanner.nextLine(); // <Enter>Ű�� ����
		Calendar c = Calendar.getInstance();
		int startSecond = c.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " +  startSecond);
			
		System.out.print("10�� ���� �� <Enter>Ű>>");
		// <Enter> Ű ������ ��ٸ�
		key = scanner.nextLine(); // <Enter>Ű�� ����
		c = Calendar.getInstance();
		int endSecond = c.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " +  endSecond);
		
		if(endSecond < startSecond)
			endSecond += 60; // 60�� �ķ� ������ ��
		
		return Math.abs(startSecond-endSecond);  // ���밪 ���ϱ�		
	}	
}

public class GuessSecondGame {
	public GuessSecondGame() {
		
	}
	public void run() {
		Player player[] = new Player[2];
		player[0] = new Player("Ȳ����");
		player[1] = new Player("���繮");
	
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		int duration1 = player[0].turn();
		int duration2 = player[1].turn();
		
		System.out.print(player[0].getName()+"�� ��� " + duration1 + ", ");
		System.out.print(player[1].getName()+"�� ��� " + duration2);		
		
		System.out.print(", ���ڴ� ");
		if(Math.abs(10-duration1) < Math.abs(10-duration2)) // �ð� ������ ���� ����� �̱�
			System.out.println(player[0].getName());
		else
			System.out.println(player[1].getName());			
	}
	
	public static void main(String[] args) {
		GuessSecondGame game = new GuessSecondGame();
		game.run();
	}

}