package challenge;

public class Stringclass {
	public static void main(String[] args) {
		String str = "hello world";
		//1.hello ���
		//2. world ���
		//3. �������� ���
		String str1 = str.substring(str.indexOf('h'),str.indexOf('o')+1);
		String str2 = str.substring(str.indexOf('w'), str.indexOf('d')+1);
		String str3 = str1.concat(str2);
		
		System.out.println(str1.charAt(1));
		System.out.println(str2);
		System.out.println(str3);
	}

}
