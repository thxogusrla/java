package five;

abstract class PairMap {
	protected String keyArray []; // key���� �����ϴ� �迭
	protected String valueArray []; // value ���� �����ϴ¹迭
	abstract String get(String key); // key ������ value�� �˻�
	abstract void put(String key, String value); // key�� value�� ������ ����
	abstract String delete(String key); // key ���� ���� ������(value�� �Բ�)�� ����. ������ value �� ����
	abstract int length(); // ���� ����� �������� ���� ����
}

class Dictionarya extends PairMap {
	protected int count = 0; // ���� ����� �������� ����
	
	public Dictionarya(int capacity) { // ������
		keyArray = new String [capacity];
		valueArray = new String [capacity];
	}
	
	@Override
	String get(String key) {
		for(int i=0; i<count; i++) { // ���� �迭�� ����� ���� ������ŭ �ݺ�
			if(keyArray[i].equals(key)) //keyArray key ���� ������ �׿� �ش��ϴ� i���� value���ؼ� �����ϴ°��ݾ�.
				return valueArray[i];
		}
		return null; // key�� �߰��� �� ���ٸ� null����
	}

	@Override
	void put(String key, String value) {
		int i=0;
		for(i=0; i<count; i++) { // ���� �迭�� ����� ���� ������ŭ �ݺ�
			if(keyArray[i].equals(key))	break;
		}

		if(i == count) { // key�� �߰����� ���� ���
			if(i < keyArray.length) { // �迭�� ������ ���� ��쿡�� ����, count �� ����
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
			}		
		}
		else { // key�� �߰��ϰ� value�� �����Ǵ� ���, count�� ������Ű�� �ʴ´�.
			keyArray[i] = key;
			valueArray[i] = value;	
		}
	}

	@Override
	String delete(String key) {
		int i=0;
		for(i=0; i<count; i++) { // ���� �迭�� ����� ���� ������ŭ �ݺ�
			if(keyArray[i].equals(key))
				break;
		}

		if(i==count) // �߰� �ȵ�
			return null;
		
		String value = valueArray[i];
		
		// ������ �� �ڸ��� �̵�
		int last = count-1;
		for(int j=i; j<last; j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		
		count--;
		return value;
	}

	
	@Override
	int length() { return count; }

}

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionarya dic = new Dictionarya(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����		
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");		
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));		
	}
}