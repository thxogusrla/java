package class_chapter;

import java.util.Scanner;

class phone {
	String name, tel, key = null;

	void setdata(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	String get_name() {
		return name;
	}

	String get_tel() {
		return tel;
	}
}

class phonebook {
	static phone[] p;
	Scanner sc = new Scanner(System.in);

	phonebook(int num) {
		p = new phone[num];
		for (int i = 0; i < num; i++) {
			p[i] = new phone();
		}
	}

	void input() {
		for (int i = 0; i < p.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			p[i].setdata(sc.next(), sc.next());
		}
	}

	void search() {
		String search_name;
		while (true) {
			int i = 0;
			System.out.print("검색할 이름>>");
			search_name = sc.next();
			for (i = 0; i < p.length; i++) {
				if (p[i].name.equals(search_name) == true)
					System.out.println(p[i].name + "의 번호는" + p[i].tel);
				
			}
			if (search_name.equals("그만"))
				break;
		}
	}
}

public class 실습문제7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원을 입력하세여  :");
		int num = sc.nextInt();
		phonebook pb = new phonebook(num);
		pb.input();
		pb.search();
		sc.close();
	}
}
