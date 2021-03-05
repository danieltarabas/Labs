package ro.tuiasi.ac;

public class TestStudentApp {

	public static void main(String[] args) {
		System.out.println("Main for Student App project");
		//declares a student
		Student s1 = new Student(10,"Popescu","Ionut");
		Student s2 = new Student(10,"Ionescu","Raluca");
		
		System.out.println(s1);
		s2.print3();
		
	}

}
