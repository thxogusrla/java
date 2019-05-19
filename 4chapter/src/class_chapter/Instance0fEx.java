package class_chapter;
class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class Instance0fEx 
{
	static void print(Person p) 
	{
		if(p instanceof Person) // a instanceof b -> 
			System.out.print("person");
		if(p instanceof Student)
			System.out.print("Student");
		if(p instanceof Researcher)
			System.out.print("Researcher");
		if(p instanceof Professor)
			System.out.print("Professor");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() ->\t");	print(new Student()); //student가 person을 상속 받았기 때문에 person + Student가 출력이 된다.
		System.out.print("new Researcher() ->\t");	print(new Researcher());
		System.out.print("new professor() ->\t");	print(new Professor());
	}
}
