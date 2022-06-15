package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import classProject.CalculusStudent;
import classProject.LessonManagementSystem;
import classProject.MenuManager;
import classProject.Student;

public class StudentAdderListener implements ActionListener {
	
	JTextField fieldSubject;
	JTextField fieldName;
	JTextField fieldPhone;
	JTextField fieldGoal;
	
	LessonManagementSystem lessonmanger;
	MenuManager menuManager;

	public StudentAdderListener( 
			JTextField fieldSubject, 
			JTextField fieldName, 
			JTextField fieldPhone,
			JTextField fieldGoal,
			LessonManagementSystem lessonmanger) {
		this.fieldSubject = fieldSubject;
		this.fieldName = fieldName;
		this.fieldPhone = fieldPhone;
		this.fieldGoal = fieldGoal;
		this.lessonmanger = lessonmanger;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		CalculusStudent student = new CalculusStudent();
		student.setSubject();
		student.setName(fieldName.getText());
		student.setPN(fieldPhone.getText());
		student.setGoal(fieldGoal.getText());
		lessonmanger.addStudents(student);
		menuManager.putObject(lessonmanger, "lesson_m.ser");
		student.printInfo();
	}

}
