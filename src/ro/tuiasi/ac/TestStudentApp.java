package ro.tuiasi.ac;

public class TestStudentApp {

	public static void main(String[] args) {
		System.out.println("Main for Student App project");
		//declares a student
		Student s1 = new Student(10,"Popescu","Ionut");
		Student s2 = new Student(10,"Ionescu","Raluca");
		Student s3 = new Student(9,"Aaa","B");

		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher(); //222
		Teacher t3 = new Teacher(); //222
		
		System.out.println(s1);
		s1.print3();
		s2.print3();
		
		System.out.println(t1);
		
	}

}
