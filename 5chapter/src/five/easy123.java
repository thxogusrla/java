package five;

public class easy123 {
	public static void main(String[] args) {
		int a = 5;
		int i = 0;
		for (i = 0; i < a; i++) { // 현재 배열에 저장된 원소 개수만큼 반복
			if (i == 3)
				break;
		}
		System.out.println(i);
	}
}
