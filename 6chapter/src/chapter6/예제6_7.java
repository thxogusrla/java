package chapter6;

public class ����6_7 {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");

		System.out.println((a + "�� ���̴� " + a.length()));
		System.out.println(a.contains("#")); // a.contains("???") ???�ȿ� �˻��� �ܾ ���� �ش��ϴ� �ܾ a�� ���ԵǾ������� True�� ��� �׷��� ������
												// False ��µ�.

		a = a.concat(b); // a.concat(b) a�� b�� ���̴� ���ڳ�. �׷��� a = {", C#, C++"};
		System.out.println(a);

		a = a.trim(); // �յ� ���� ���ڸ� �������ش�. a.trim();
		System.out.println(a);

		a = a.replace("C#", "java"); // a.replace("C#", "java");
		System.out.println(a);

		String s[] = a.split(","); // ,�� �������� �и���Ŵ.
		for (int i = 0; i < s.length; i++) {
			System.out.println("�и��� ���ڿ�" + i + ": " + s[i]);
		}
		a = a.substring(5);
		System.out.println(a);

		char c = a.charAt(2);
		System.out.println(c);
	}
}
