package classProject;

import java.io.Serializable;  
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LessonManagementSystem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3669365244745928074L;

	ArrayList<CalculusStudent> cslist = new ArrayList<>();

	transient Scanner input;

	LessonManagementSystem() {

	}
	
	LessonManagementSystem(Scanner input) {
		this.input = input;
	}

	public void addStudents() {						//���ܻ��� �߰��ϴ� �Լ�
		CalculusStudent cs = new CalculusStudent();

		System.out.print("�̸��� �Է��Ͻÿ� : ");
		cs.setName(input.nextLine());
		System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� : ");
		cs.setPN(input.nextLine());
		System.out.print("��ǥ��� �Է��Ͻÿ� : ");
		cs.setGoal(input.nextLine());
		cs.setSubject();
		System.out.println("");

		this.cslist.add(cs);                        //���ܻ��� ���� �ø�
	}

	public void deleteLesson() {   					//���ܻ��� �����ϴ� �Լ�
		try {
			System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�?: ");
			int number = input.nextInt();
			input.nextLine();

			if (number < cslist.size()) {			//���ܻ��� ���� ����
				cslist.remove(number);
				System.out.println("������ �����Ǿ����ϴ�.");
				input.nextLine();
			}
			else {
				System.out.println("������ �������� �ʽ��ϴ�.");
				input.nextLine();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
			input.nextLine();
		}

	}

	public void editLesson() {                      //���ܻ� ������ �����ϴ� �Լ�
		try {
			System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�?: ");
			int number = input.nextInt();
			input.nextLine();
			if(number > cslist.size()) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				System.out.println("");
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
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
			input.nextLine();
		}
	}

	public void viewLesson() {						//��� ���ܻ����� ������ ����ϴ� �Լ� 
		for(int i =0;i <cslist.size(); i++)	{
			cslist.get(i).printInfo();
		}
	}
}//


