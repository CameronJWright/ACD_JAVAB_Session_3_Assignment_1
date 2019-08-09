package hello.world;

class Student {

	int rollno;
	String name;
	static String college = "UNG";

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

}

public class IntClassVar {

	public static void main(String[] args) {

		Student stu1 = new Student(1, "Jim");
		Student stu2 = new Student(2, "Jill");
		
		stu1.display();
		stu2.display();

	}

}
