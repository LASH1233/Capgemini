package manytoMany;

public class Subject {
    private String name;
    private String email;
    private Student[] students;
    private int studentCount; 
    

    public Subject(String name,String email, int maxStudents) {
        this.name = name;
        this.email=email;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
    	return this.email;
    }
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        }
    }

    public int getNumberOfStudents() {
        return studentCount;
    }
}
