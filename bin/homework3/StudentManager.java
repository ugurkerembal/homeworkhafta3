package homework3;

public class StudentManager {
    public void addCourse(Student student, Course course) {
        System.out.println("��renci �smi: " + student.getFirstName() + " " + course.getName() + " e�itimini kurslar�na ekledi.");
    }


    public void doneHomework(Student student, Course course) {
        System.out.println(student.getFirstName() + " isimli ��renci " + course.getName() + " kursunun �devlerini tamamlad�.");
    }
}
