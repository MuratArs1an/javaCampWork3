package javaInheritanceWork;

public class Main {

	public static void main(String[] args) {
		Student student= new Student();
		student.id=1;
		student.name="Murat";
		student.surname="Arslan";
		student.studentNumber=1431;
		
		Instructor instructor= new Instructor();
		instructor.id=10;
		instructor.name="Engin";
		instructor.surname="DEMIROG";
		instructor.email="enginhoca@gmail.com";
		
		UserManager userManager= new UserManager();
		userManager.add(instructor);
		
		userManager.add(student);
		
		

	}

}
