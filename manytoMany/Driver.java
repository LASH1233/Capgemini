package manytoMany;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  


        int maxSubjectsPerStudent = 5;

        Student[] students = new Student[numberOfStudents];
        Subject[] subjects = new Subject[100]; 
        int subjectCount = 0;

 
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i+1) + ": ");
            String studentName = scanner.nextLine();
            
            String email;
            System.out.println("Enter the email id: ");
            email=scanner.next();
			students[i] = new Student(studentName,email, maxSubjectsPerStudent);

            System.out.print("Enter the number of subjects for " + studentName + ": ");
            int numberOfSubjects = scanner.nextInt();
            scanner.nextLine(); 

            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print("Enter subject " + (j + 1) + " name: ");
                String subjectName = scanner.nextLine();

                Subject subject = findOrCreateSubject(subjects, subjectName, subjectCount);
                if (subject == null) {
                    subject = new Subject(subjectName,email, numberOfStudents);
                    subjects[subjectCount++] = subject;
                }

                students[i].addSubject(subject);
            }
        }
        for (int i = 0; i < numberOfStudents; i++) {
        	System.out.println("Student's email id: " + students[i].getEmail());
            System.out.println(students[i].getName() + " is enrolled in " + students[i].getNumberOfSubjects() + " subjects.");
        }

        for (int i = 0; i < subjectCount; i++) {
            System.out.println(subjects[i].getName() + " has " + subjects[i].getNumberOfStudents() + " students enrolled.");
        }

        scanner.close();
    }

    public static Subject findOrCreateSubject(Subject[] subjects, String name, int currentSubjectCount) {
        for (int i = 0; i < currentSubjectCount; i++) {
            if (subjects[i].getName().equals(name)) {
                return subjects[i];
            }
        }
        return null;
    }
}

