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
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
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
		System.out.print("날짜(1~30)?");
		int input_day = sc.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String input_work = sc.next();
		d[input_day].set(input_work);
	}

	void view() {
		System.out.print("날짜(1~30)");
		int view_day = sc.nextInt();
		System.out.print(view_day + "일의 할 일은 ");
		d[view_day].show();
	}

	void finish() {
		System.out.println("프로그램을 종료합니다.");
	}

	void run() {
		System.out.println("이번달 스케쥴 관리프로그램.");
		while (true) {
			System.out.print("할일(입력 : 1, 보기 : 2, 끝내기 : 3>>)");
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

public class 실습문제6 {
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
