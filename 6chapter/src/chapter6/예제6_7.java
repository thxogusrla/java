package chapter6;

public class 예제6_7 {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");

		System.out.println((a + "의 길이는 " + a.length()));
		System.out.println(a.contains("#")); // a.contains("???") ???안에 검색할 단어를 쓰고 해당하는 단어가 a에 포함되어있으면 True를 출력 그렇지 않으면
												// False 출력됨.

		a = a.concat(b); // a.concat(b) a에 b를 붙이는 거자나. 그러면 a = {", C#, C++"};
		System.out.println(a);

		a = a.trim(); // 앞뒤 공백 문자를 제거해준다. a.trim();
		System.out.println(a);

		a = a.replace("C#", "java"); // a.replace("C#", "java");
		System.out.println(a);

		String s[] = a.split(","); // ,를 기준으로 분리시킴.
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		}
		a = a.substring(5);
		System.out.println(a);

		char c = a.charAt(2);
		System.out.println(c);
	}
}
