package challenge;

import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xpath.internal.operations.Equals;
//1. str �迭�� �����
//2. �ߺ�

public class hash {

	public static void main(String[] args) {
		String str = "��� �� ���� ������ �� ��� �� ���� ���";
		String[] str2 = str.split(" ");
		for (String string : str2)
			System.out.println(string);

		Map<String, Integer> map = new HashMap();

		for (int i = 0; i < str2.length; i++) {
			if (map.containsKey(str2[i])) {
				map.put(str2[i], map.get(str2[i]) + 1);
			} else
				map.put(str2[i], 1);

		}
		map.put("�ؼ�", 1);
		
		System.out.println(map.get("�ؼ�"));

	}
}