package homework3;

public class StudentManager {
    public void addCourse(Student student, Course course) {
        System.out.println("Öðrenci Ýsmi: " + student.getFirstName() + " " + course.getName() + " eðitimini kurslarýna ekledi.");
    }


    public void doneHomework(Student student, Course course) {
        System.out.println(student.getFirstName() + " isimli öðrenci " + course.getName() + " kursunun ödevlerini tamamladý.");
    }
}
