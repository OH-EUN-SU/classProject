package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import classProject.LessonManagementSystem;

public class WindowFrame extends JFrame {
	
	LessonManagementSystem lessonmanger;
	
	MenuSelection menuselection;
	StudentAdder studentadder;
	StudentViewer studentviewer;

	public WindowFrame(LessonManagementSystem lessonmanger) {		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.lessonmanger = lessonmanger;
		menuselection = new MenuSelection(this);
		studentadder = new StudentAdder(this, this.lessonmanger);
		studentviewer = new StudentViewer(this, this.lessonmanger);
		
		this.setUpPanel(menuselection);
		
		this.setVisible(true); 
	}
	
	public void setUpPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public StudentAdder getStudentadder() {
		return studentadder;
	}

	public void setStudentadder(StudentAdder studentadder) {
		this.studentadder = studentadder;
	}

	public StudentViewer getStudentviewer() {
		return studentviewer;
	}

	public void setStudentviewer(StudentViewer studentviewer) {
		this.studentviewer = studentviewer;
	}


}


