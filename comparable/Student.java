package comparable;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	double percentage;
	
	public Student(int rollno,String name,double percentage) {
		this.rollno=rollno;
		this.name=name;
		this.percentage=percentage;
	}
	
	@Override
	public String toString() {
		return rollno+"\t"+name+"\t"+percentage;
	}
	@Override
	public int compareTo(Student s) {
//		Student s = (Student)o;
//		if(this.rollno>s.rollno)return 1;
//		else if(this.rollno<s.rollno)return -1;
//		else if(this.rollno==s.rollno) return 0;
		return Double.compare(s.percentage, this.percentage);
	}
}
