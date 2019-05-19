package hello;

class Rect<T extends Number> implements Comparable<T> {
	String name; // my name
	private T w, h; // width, height

	Rect(String rectName, T width, T height) {
		name = rectName;
		w = width;
		h = height;
	}

	public int compareTo(Rect o) {
		var r = name.compareTo(o.name);
		return (r==0) ? name.compareTo(o.name);
	}

}

public class 김태현_3 {
	// compare
	public static void main(String[] args) {
		System.out.println("이름 김태현:학번 201533005 ");
		var r1 = new Rect<Integer>("r1", 2, 5);
		var r2 = new Rect<Integer>("r2", 3, 3);
		compare(r1, r2);
		compare(r2, r1);
		compare(r1, r1);
	}
}
