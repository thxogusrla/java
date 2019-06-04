package challenge;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
	static void pb(PersonVO a){
		a.setLast_name("kth");
	}
	public static void main(String[] args) {

		List<PersonVO> apvo = new ArrayList<PersonVO>();
		for (int i = 0; i < 10; i++) {
			apvo.add(new PersonVO()); // °´Ã¼ ¼±¾ð
		}
		pb(apvo.get(0));
		System.out.println(apvo.get(0).toString());
	}
}