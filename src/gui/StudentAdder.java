package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import classProject.LessonManagementSystem;
import listener.StudentAdderListener;

public class StudentAdder extends JPanel {

	WindowFrame frame;
	LessonManagementSystem lessonmanger;
	
	public StudentAdder(WindowFrame frame, LessonManagementSystem lessonmanger) {
		
		this.frame = frame;
		this.lessonmanger = lessonmanger;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSubject = new JLabel("Subject : ", JLabel.TRAILING);
		JTextField fieldSubject = new JTextField(10);
		labelSubject.setLabelFor(fieldSubject);
		panel.add(labelSubject);
		panel.add(fieldSubject);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPhone = new JLabel("Phone : ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelName.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelGoal = new JLabel("Goal : ", JLabel.TRAILING);
		JTextField fieldGoal = new JTextField(10);
		labelName.setLabelFor(fieldGoal);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new StudentAdderListener(fieldSubject, fieldName, fieldPhone, fieldGoal, lessonmanger));
		JButton cancelButton = new JButton("cancel");
		
		panel.add(labelGoal);
		panel.add(fieldGoal);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}


