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
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			p[i].setdata(sc.next(), sc.next());
		}
	}

	void search() {
		String search_name;
		while (true) {
			int i = 0;
			System.out.print("�˻��� �̸�>>");
			search_name = sc.next();
			for (i = 0; i < p.length; i++) {
				if (p[i].name.equals(search_name) == true)
					System.out.println(p[i].name + "�� ��ȣ��" + p[i].tel);
				
			}
			if (search_name.equals("�׸�"))
				break;
		}
	}
}

public class �ǽ�����7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� �Է��ϼ���  :");
		int num = sc.nextInt();
		phonebook pb = new phonebook(num);
		pb.input();
		pb.search();
		sc.close();
	}
}
