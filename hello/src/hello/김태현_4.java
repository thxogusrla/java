package hello;

import java.util.*;

import 모의고사.Pair;

class Student implements Comparable<Student> {
	int id;
	String name;
	double score;

	Student(int id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	void output() {
		System.out.println("(" + id + "," + name + "," + score + ")");
	}

	public int compareTo(Student o) {
		var r = id.compareTo(o.id);
	}}

class StudentMap extends HashMap<Integer, Student> {
	void put(Student s) {
		HashMap<Integer, Student> ha = new HashMap<Integer, Student>();
		ha.put(s.id, s);
	}

	void listBestStudents() {
		var bestList = new ArrayList<Student>();
		double big = 0;
		for (int i = 1; i < bestList.size(); i++) {
			
		}
	}
}

public class 김태현_4 {
	public static void main(String[] args) {
		System.out.println("이름:학번");
		var map = new StudentMap();
		map.put(new Student(111, "Kim", 3.4));
		map.put(new Student(222, "Lee", 3.2));
		map.put(new Student(333, "Kay", 3.5));
		map.put(new Student(444, "Cho", 3.3));
		map.put(new Student(555, "Lim", 3.5));
		map.listBestStudents();
	}
}
