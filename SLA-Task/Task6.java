package JavaTask;

//Create a class Student with a parameterized constructor that initializes name and age.

class StudentInfo{
	String name;
	int age;
	 StudentInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo student = new StudentInfo("Lokesh",20);
		System.out.println("Student name:"+student.name);
	}

}
