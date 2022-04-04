package classProject;
import java.util.Scanner;

public class LessonManagementSystem {
	Lesson lesson = new Lesson();
	
	Scanner input = new Scanner(System.in);
	
	Lesson_Manager() {

	}
	
	public void addStudents() {                                  //���ܻ��� �߰��ϴ� �Լ�
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		lesson.name.add(input.nextLine());
		System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� : ");
		lesson.phone_number.add(input.nextLine());
		System.out.print("���� �Է��Ͻÿ� : ");
		lesson.subject.add(input.nextLine());
		System.out.print("��ǥ��� �Է��Ͻÿ� : ");
		lesson.goal.add(input.nextLine());
		System.out.println("");
		
		lesson.count++;                                          //���ܻ��� ���� �ø�
	}

	public void deleteLesson() {                                 //���ܻ��� �����ϴ� �Լ�
		System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�?: ");
		int number = input.nextInt();
		input.nextLine();
		
		if (number < lesson.count) {
			lesson.name.remove(number);
			lesson.phone_number.remove(number);
			lesson.subject.remove(number);
			lesson.goal.remove(number);
			System.out.println("������ �����Ǿ����ϴ�.");
			lesson.count--;                                      //���ܻ��� ���� ����
		}
		else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}

	public void editLesson() {                                   //���ܻ� ������ �����ϴ� �Լ�
		System.out.print("�� ��° ������ �����Ͻðڽ��ϱ�?: ");
		int number = input.nextInt();
		input.nextLine();
		if(number > lesson.count) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		else {
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			lesson.name.add(number, input.nextLine());
			System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� : ");
			lesson.phone_number.add(number, input.nextLine());
			System.out.print("���� �Է��Ͻÿ� : ");
			lesson.subject.add(number, input.nextLine());
			System.out.print("��ǥ��� �Է��Ͻÿ� : ");
			lesson.goal.add(number, input.nextLine());
			
			System.out.println("");
		}
	}

	public void viewLesson() {                                    //��� ���ܻ����� ������ ����ϴ� �Լ� 
			lesson.printInfo();
	}
}

