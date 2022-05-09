package classProject;

import java.util.ArrayList;
import java.util.Scanner;

public class LessonManagementSystem {
	
	ArrayList<CalculusStudent> cslist = new ArrayList<>();
	
	Scanner input = new Scanner(System.in);
	
	LessonManagementSystem() {
		
	}
	
	public void addStudents() {									//���ܻ��� �߰��ϴ� �Լ�
		CalculusStudent cs = new CalculusStudent();
		
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		cs.setName(input.nextLine());
		System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� : ");
		cs.setPN(input.nextLine());
		System.out.print("��ǥ��� �Է��Ͻÿ� : ");
		cs.setGoal(input.nextLine());
		cs.setSubject();
		System.out.println("");
		
		this.cslist.add(cs);                            	     //���ܻ��� ���� �ø�
	}

	public void deleteLesson() {                                 //���ܻ��� �����ϴ� �Լ�
		System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�?: ");
		int number = input.nextInt();
		input.nextLine();
		
		if (number < cslist.size()) {							//���ܻ��� ���� ����
			cslist.remove(number);
		}
		else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}

	public void editLesson() {                                   //���ܻ� ������ �����ϴ� �Լ�
		System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�?: ");
		int number = input.nextInt();
		input.nextLine();
		if(number > cslist.size()) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		else {
			cslist.remove(number);
			CalculusStudent cs = new CalculusStudent();
			
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			cs.setName(input.nextLine());
			System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� : ");
			cs.setPN(input.nextLine());
			System.out.print("��ǥ��� �Է��Ͻÿ� : ");
			cs.setGoal(input.nextLine());
			cs.setSubject();
			System.out.println("");
			System.out.println("");
			this.cslist.add(number, cs);
		}
	}

	public void viewLesson() {									//��� ���ܻ����� ������ ����ϴ� �Լ� 
		for(int i =0;i <cslist.size(); i++)	{
			cslist.get(i).printInfo();
		}
	}
}


   