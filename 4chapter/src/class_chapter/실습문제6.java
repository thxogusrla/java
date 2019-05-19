package class_chapter;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}

class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	Day[] d;

	MonthSchedule(int day) {
		d = new Day[day];
		for (int i = 0; i < day; i++) {
			d[i] = new Day();
		}
	}

	void input() {
		System.out.print("��¥(1~30)?");
		int input_day = sc.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String input_work = sc.next();
		d[input_day].set(input_work);
	}

	void view() {
		System.out.print("��¥(1~30)");
		int view_day = sc.nextInt();
		System.out.print(view_day + "���� �� ���� ");
		d[view_day].show();
	}

	void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}

	void run() {
		System.out.println("�̹��� ������ �������α׷�.");
		while (true) {
			System.out.print("����(�Է� : 1, ���� : 2, ������ : 3>>)");
			int x = sc.nextInt();
			if (x == 1)
				input();
			else if (x == 2)
				view();
			else {
				finish();
				break;
			}
		}
	}
}

public class �ǽ�����6 {
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
