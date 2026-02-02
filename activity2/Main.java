package activity2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Total students: " + Student.getTotalStudents());

        Student student1 = new Student(1001, "John", "Michael", "Doe", "Male", "john.doe@myuniversity.edu");
        Student student2 = new Student(1002, "Jane", "Elizabeth", "Smith", "Female", "jane.smith@myuniversity.edu");
        Student student3 = new Student(1003, "Robert", "James", "Johnson", "Male", "robert.johnson@myuniversity.edu");

        System.out.println("Total students: " + Student.getTotalStudents());

        System.out.println("\nStudent 1 Information:");
        student1.displayStudentInfo();

        System.out.println("\nSchool Name: " + Course.getSchoolName());

        Course course1 = new Course("CS101", "Introduction to Programming");
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        System.out.println("\nCourse Information:");
        course1.displayCourseInfo();
    }
}