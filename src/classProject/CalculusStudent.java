package classProject;

import java.io.Serializable;

public class CalculusStudent extends Student implements Subject, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5533066819552575457L;
	private String subject;
	
	public void setSubject() {
		this.subject = "Calculus";
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void printInfo() {	
		TeacherName("���");
		TeacherName("������ :", "������");
		System.out.println("����: " + getSubject());
		System.out.println("�̸�: " + getName());
		System.out.println("��ȭ��ȣ: " + getPN());
		System.out.println("��ǥ���: " + getGoal());
		System.out.println("");
	}
}//

