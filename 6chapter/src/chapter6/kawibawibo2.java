package chapter6;

import java.util.Scanner;
import java.lang.Math;

class players {
	private Scanner sc = new Scanner(System.in);
	private String name;

	public players(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int turn() {
		System.out.println(name + "[����(1), ����(2), ��(3), ������(4)]");
		return sc.nextInt();
	}
}

class computers extends players {
	public computers(String name) {
		super(name);
	}

	public int turn() {
		return (int) Math.random() * 3 + 1;
	}
}

public class kawibawibo2 {
	private final String s[] = { "����", "����", "��" };
	private players[] player = new players[2];

	public kawibawibo2() {

		player[0] = new players("ö��");
		player[1] = new computers("��ǻ��");
	}

	public void run() {
		int userchoice, computerchoice;
		while (true) {
			userchoice = player[0].turn();
			if (userchoice == 4) {
				System.out.println("���α׷� ����");
				break;
			}
			computerchoice = player[1].turn();

			if (userchoice < 1 || userchoice > 4) {
				System.out.println("�߸��� �� �Է��ߴ� �̽�Ű��~");
			} else {
				System.out.print(player[0].getName() + "(" + s[userchoice - 1] + ")");
				System.out.println(player[1].getName() + "(" + s[computerchoice - 1] + ")");

				int diff = userchoice - computerchoice;
				switch (diff) {
				case 0:
					System.out.println("�����ϴ�.");
					break;
				case -1:
				case 2:
					System.out.println(player[1].getName() + "�� �̰���ϴ�.");
					break;
				case 1:
				case -2:
					System.out.println(player[0].getName() + "�� �̰���ϴ�.");
				}
			}
		}

	}

	public static void main(String[] args) {
		kawibawibo2 game = new kawibawibo2();
		game.run();

	}
}
