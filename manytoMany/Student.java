package manytoMany;

public class Student {
    private String name;
    private String email;
    private Subject[] subjects;
    private int subjectCount; 

    public Student(String name,String email, int maxSubjects) {
        this.name = name;
        this.email=email;
        this.subjects = new Subject[maxSubjects];
        this.subjectCount = 0;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
    	return this.email;
    }
    public void addSubject(Subject subject) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount] = subject;
            subject.addStudent(this); 
            subjectCount++;
        }
    }

    public int getNumberOfSubjects() {
        return subjectCount;
    }
}

