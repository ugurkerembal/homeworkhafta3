package homework3;

public class InstructorManager {
	 public void addCourse(User user, Course course){
	        System.out.println("E�itmen : " + user.getFirstName() + " " + course.getName() + " e�itimini ekledi.");
	    }
	    public void addHomework(Instructor instructor, Course course){
	        System.out.println("E�itmen : " + instructor.getFirstName() + " " + course.getName() + " kursuna yeni bir �dev ekledi.");
	    }
}
