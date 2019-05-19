package chapter7;

import java.util.*;

class Student {
	private int id;
	private String tel;

	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}
}

public class ����7_7 {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("Ȳ����", new Student(1, "010-111-1111"));
		map.put("Ȳ����", new Student(2, "010-222-2222"));
		map.put("Ȳ����", new Student(3, "010-333-3333"));
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�˻��� �̸�?");
			String name = sc.nextLine();
			if (name.equals("exit"))
				break;
			Student student = map.get(name); //map�� String �̶� Student �� ���µ� 
			if (student == null)
				System.out.println(name + "�� ���� ����Դϴ�.");
			else
				System.out.println("id:" + student.getId() + ", ��ȭ:" + student.getTel());
		}
		sc.close();
	}
}