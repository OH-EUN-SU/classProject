package classProject;
import java.util.*;

public class Lesson {
		
	ArrayList<String> name = new ArrayList<String>();                   //���ܻ��� �̸��� �����ϴ� �迭
	ArrayList<String> phone_number = new ArrayList<String>();           //���ܻ��� ��ȭ��ȣ�� �����ϴ� �迭
	ArrayList<String> subject = new ArrayList<String>();                //���� ������ �����ϴ� �迭
	ArrayList<String> goal = new ArrayList<String>();                   //���ܻ��� ��ǥ�� �����ϴ� �迭
	int count = 0;                                                      //���ܻ��� ���� �����ϴ� ����
		
		public Lesson() {
			
		}
		
		public void printInfo() {
			for(int i = 0; i < count; i++) {
				System.out.println("�̸�: " + name.get(i));               //����� �̸��� ���
				System.out.println("��ȭ��ȣ: " + phone_number.get(i));    //����� ��ȭ��ȣ�� ���
				System.out.println("����: " + subject.get(i));            //����� ������ ���
				System.out.println("��ǥ ���: "+ goal.get(i));            //����� ����� ���
				System.out.println();
			}
		}
}
