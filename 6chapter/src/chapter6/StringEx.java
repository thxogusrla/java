package chapter6;
//���� 6.7
public class StringEx {
	public static void main(String[] args) {
		String a = new String("C#");
		String b = new String(",C++");
		System.out.println(a + "�� ���̴� " + a.length());
		System.out.println(a.contains("#"));

		a = a.concat(b);
		System.out.println(a);

		a = a.trim();
		System.out.println(a);

		a = a.replace("C#", "java");
		System.out.println(a);

		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++)
			System.out.println("�и��� ���ڿ�" + i + ":" + s[i]);
		a = a.substring(5);
		System.out.println(a);
		char c = a.charAt(2);
		System.out.println(c);
	}
}