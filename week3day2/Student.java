package week3day2;

public class Student extends Department {
	public void studentName() {
		System.out.println("SANJAI");
	}
public void studentDepartment() {
	System.out.println("EEE");
	
}
public void studentId() {
	System.out.println("NO:17967");
}
 public static void main(String[] args) {
	 Student student=new Student();
	 student.studentName();
	 student.studentDepartment();
	 student.studentId();
	 student.departName();
	 student.collegeName();
	 student.collegeCode();
	 student.collegeRank();
	 
}
}

