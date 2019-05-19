package five;

abstract class PairMap1 {
	protected String keyArray[]; // 키값을 저장하고 함수가 아니었자나 ㅅㅂ
	protected String valueArray[]; // value 값을 저장.

	abstract String get(String key);// key 값을 반환하고.

	abstract void put(String key, String value); // 키와 value 값을 스택에 저장하지.

	abstract String delete(String key); // key 값을 제거해주네.

	abstract int length();
}

class Dictionary extends PairMap1 {
	protected int count = 0;

	public Dictionary(int num) {
		keyArray = new String[num];
		valueArray = new String[num];
	}

	public String get(String key) {
		for (int i = 0; i < count; i++) {
			if (keyArray[i].equals(key))
				return valueArray[i];
		}
		return null;
	}

	void put(String key, String value) {
		int i = 0;
		for (i = 0; i < count; i++)
			if (keyArray[i].equals(key))
				break;
		if (i == count) {
			keyArray[i] = key;
			valueArray[i] = value;
			count++;
		} else {
			keyArray[i] = key;
			valueArray[i] = value;
		}

	}

	String delete(String key) {
		int i = 0;
		for (i = 0; i < count; i++)
			if (keyArray[i].equals(key))
				break;
		if (i == count) //삭제 하려는 키값을 찾지 못했을 때 null을 반환.
			return null;
		
		String value = valueArray[i];
		int last = count-1; //앞으로 한칸씩 당김.
		for(int j = i; j<last; j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		count--;
		return value;
	}
	int length() {
		return count;
	}
}

public class 실습문제10 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("현재 count의 값은 " + dic.count);
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은" + dic.get("황기태"));
	}
}
