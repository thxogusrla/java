spackage challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SuperEx {
	public static void main(String[] args) {
		Vector<person> p = new Vector<person>();
		p.add(new person());
		p.get(0).setName("준서");
		p.add(new person(24, "학생", "태현"));
		System.out.println(p.get(0).getName() + " " + p.get(1).getName());
	}

}

class person {
	private int age;
	private String job, name;

	person() {
		this.age = 0;
		this.job = "no";
		this.name = "no data";
	}

	person(int age, String job, String name) {
		this.age = age;
		this.job = job;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [age=" + age + ", job=" + job + ", name=" + name + "]";
	}
}