package classProject;

import java.util.Scanner;

public class CalculusStudent extends Student implements Subject {
	private String subject;
	
	public void setSubject() {
		this.subject = "Calculus";
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void printInfo() {	
		TeacherName("담당");
		TeacherName("선생님 :", "오은수");
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPN());
		System.out.println("과목: " + getSubject());
		System.out.println("목표등급: " + getGoal());
		System.out.println("");
	}
}//

