package homework3;

public class InstructorManager {
	 public void addCourse(User user, Course course){
	        System.out.println("Eðitmen : " + user.getFirstName() + " " + course.getName() + " eðitimini ekledi.");
	    }
	    public void addHomework(Instructor instructor, Course course){
	        System.out.println("Eðitmen : " + instructor.getFirstName() + " " + course.getName() + " kursuna yeni bir ödev ekledi.");
	    }
}
