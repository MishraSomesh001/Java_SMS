package SMS_app;

import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private String studentID;
	private String gradeLevel;
	private String course;
	private int tutionBalance;
	private int costCourse=600;
	private static int id=1000;
	public Student() {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the First Name: ");
		this.firstName=in.nextLine();
		System.out.print("Enter the Last Name: ");
		this.lastName=in.nextLine();
		System.out.print("\n1. F - Freshers\n2. SP - Sophomore\n3. J - Junior\n4. S - Senior\nChoose the Grade Level: ");
		this.gradeLevel=in.nextLine();
		
		setStudentID();
		
		System.out.println(firstName+" "+lastName+" "+gradeLevel+" "+studentID);
	}
	
	private void setStudentID()
	{
		id++;
		this.studentID=gradeLevel+id+"";
	}
}
