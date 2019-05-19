package five;

abstract class PairMap1 {
	protected String keyArray[]; // Ű���� �����ϰ� �Լ��� �ƴϾ��ڳ� ����
	protected String valueArray[]; // value ���� ����.

	abstract String get(String key);// key ���� ��ȯ�ϰ�.

	abstract void put(String key, String value); // Ű�� value ���� ���ÿ� ��������.

	abstract String delete(String key); // key ���� �������ֳ�.

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
		if (i == count) //���� �Ϸ��� Ű���� ã�� ������ �� null�� ��ȯ.
			return null;
		
		String value = valueArray[i];
		int last = count-1; //������ ��ĭ�� ���.
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

public class �ǽ�����10 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���� count�� ���� " + dic.count);
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ����" + dic.get("Ȳ����"));
	}
}
