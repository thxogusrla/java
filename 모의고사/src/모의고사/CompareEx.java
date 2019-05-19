package 모의고사;

import java.util.*;

class Pair<T extends Comparable<T>> implements Comparable<Pair<T>> {
	T v1, v2;

	Pair(T v1, T v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public int compareTo(Pair<T> o) {
		var r = v1.compareTo(o.v1);
		return (r == 0) ? v2.compareTo(o.v2) : r;
	}

	public String toString() {
		return "(" + v1 + "," + v2 + ")";
	}
}

class PairWithName<T extends Comparable<T>> extends Pair<T> {
	String name;

	PairWithName(String name, T v1, T v2) {
		super(v1, v2);
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

class DoublePair extends Pair<Double> {
	DoublePair(Double v1, Double v2) {
		super(v1, v2);
	}
}

class IntPair implements Comparable<IntPair> {
	int v1, v2;

	IntPair(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public int compareTo(IntPair o) {
		return (v1 != o.v1) ? v1 - o.v1 : v2 - o.v2;
	}

	public String toString() {
		return "(" + v1 + "," + v2 + ")";
	}
}

public class CompareEx {
	static <T extends Comparable<T>> void compare(T e1, T e2) {
		var r = e1.compareTo(e2);
		String s = (r < 0) ? " < " : (r > 0) ? " > " : " = ";
		System.out.println(e1 + s + e2);
	}

	public static void main(String[] args) {
		compare(new Pair<Integer>(1, 2), new Pair<Integer>(1, 3));
		compare(new Pair<Double>(1.0, 1.0), new Pair<Double>(1.0, 1.0));
		compare(new PairWithName<String>("p1", "Lee", "student"), new PairWithName<String>("p2", "Kim", "worker"));
		compare(new DoublePair(1.0, 2.0), new DoublePair(2.0, 1.0));
		compare(new IntPair(1, 1), new IntPair(1, 1));
		var v = new Vector<Pair<Integer>>();
		v.add(new Pair<Integer>(3, 1));
		v.add(new Pair<Integer>(2, 3));
		v.add(new Pair<Integer>(2, 2));
		v.add(new Pair<Integer>(1, 1));
		Collections.sort(v);
		for (var p : v)
			System.out.println(p);
	}
}