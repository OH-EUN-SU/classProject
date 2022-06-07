package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import classProject.CalculusStudent;
import classProject.LessonManagementSystem;

public class StudentViewer extends JPanel {
	
	WindowFrame frame;
	LessonManagementSystem lessonmanger;
	
	public StudentViewer(WindowFrame frame, LessonManagementSystem lessonmanger) {
		
		this.frame = frame;
		this.lessonmanger = lessonmanger;
		
		System.out.println("***"+lessonmanger.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("����");
		model.addColumn("�̸�");
		model.addColumn("��ȭ��ȣ");
		model.addColumn("��ǥ���");
		
		for(int i=0; i<lessonmanger.size(); i++) {
			Vector row = new Vector();
			CalculusStudent cs = lessonmanger.get(i);
			row.add(cs.getSubject());
			row.add(cs.getName());
			row.add(cs.getPN());
			row.add(cs.getGoal());
			model.addRow(row);
		} 
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
		
}


