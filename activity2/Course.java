package activity2;

public class Course {
    String courseCode;
    String courseTitle;
    Student[] enrolledStudents;
    int enrollmentCount;
    static String schoolName = "My University";
    
    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];
        this.enrollmentCount = 0;
    }
    
    public void enrollStudent(Student student) {
        enrolledStudents[enrollmentCount] = student;
        enrollmentCount++;
    }
    
    public void displayCourseInfo() {
        System.out.println("School: " + schoolName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Enrolled Students:");
        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println("- " + enrolledStudents[i].firstName + " " + 
                             enrolledStudents[i].middleName + " " + 
                             enrolledStudents[i].lastName);
        }
    }
    
    public static String getSchoolName() {
        return schoolName;
    }
}