package homework3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setId(10);
        instructor.setEmail("engin@demirog.com");
        instructor.setPassword("eng123");
        instructor.setResume("Yazılım geliştirme eğitmeni");

        Student student = new Student();
        student.setDepartment("Yönetim Bilişim Sistemleri");
        student.setEmail("ugurkerem@bal.com");
        student.setFirstName("Uğur");
        student.setLastName("Bal");
        student.setId(50);
        student.setEducationLevel(2);
        student.setPassword("ugur123456");

        Student student1 = new Student();
        student1.setDepartment("Yazılım Mühendisliği");
        student1.setEmail("berkan@kaba.com");
        student1.setFirstName("Berkan");
        student1.setLastName("Kaba");
        student1.setId(51);
        student1.setEducationLevel(3);
        student1.setPassword("berkan123456");

        Course course1 = new Course();
        course1.setName("Angular ile Web Geliştirme");
        course1.setLong("17 Saat");

        Course course2 = new Course();
        course2.setName("React ile Web Geliştirme");
        course2.setLong("18 Saat");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(instructor,course1);
        instructorManager.addHomework(instructor,course2);

        StudentManager studentManager = new StudentManager();
        studentManager.addCourse(student1,course1);
        studentManager.doneHomework(student,course2);

        UserManager userManager = new UserManager();
        userManager.createAccount(student);
        userManager.delete(instructor);
        userManager.logOut(student1);
        userManager.profileEdit(instructor);
        userManager.signIn(student1);
	}

}
