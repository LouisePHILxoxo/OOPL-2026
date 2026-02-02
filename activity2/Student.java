package activity2;

public class Student {
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;
    static int totalStudents = 0;
    
    public Student(int studentId, String firstName, String middleName, 
                   String lastName, String gender, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        totalStudents++;
    }
    
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
    }
    
    public static int getTotalStudents() {
        return totalStudents;
    }
}