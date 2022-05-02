package classProject;

import java.util.ArrayList;
import java.util.Scanner;

public class LessonManagementSystem {
	
	ArrayList<CalculusStudent> cslist = new ArrayList<>();
	
	Scanner input = new Scanner(System.in);
	
	LessonManagementSystem() {
		
	}
	
	public void addStudents() {									//과외생을 추가하는 함수
		CalculusStudent cs = new CalculusStudent();
		
		System.out.print("이름을 입력하시오 : ");
		cs.setName(input.nextLine());
		System.out.print("전화번호를 입력하시오 : ");
		cs.setPN(input.nextLine());
		System.out.print("목표등급 입력하시오 : ");
		cs.setGoal(input.nextLine());
		cs.setSubject();
		System.out.println("");
		
		this.cslist.add(cs);                            	     //과외생의 수를 늘림
	}

	public void deleteLesson() {                                 //과외생을 삭제하는 함수
		System.out.print("몇 번째 수업을 삭제하시겠습니까?: ");
		int number = input.nextInt();
		input.nextLine();
		
		if (number < cslist.size()) {							//과외생의 수를 줄임
			cslist.remove(number);
		}
		else {
			System.out.println("수업이 존재하지 않습니다.");
		}
	}

	public void editLesson() {                                   //과외생 정보를 수정하는 함수
		System.out.print("몇 번째 수업을 수정하시겠습니까?: ");
		int number = input.nextInt();
		input.nextLine();
		if(number > cslist.size()) {
			System.out.println("수업이 존재하지 않습니다.");
		}
		else {
			cslist.remove(number);
			CalculusStudent cs = new CalculusStudent();
			
			System.out.print("이름을 입력하시오 : ");
			cs.setName(input.nextLine());
			System.out.print("전화번호를 입력하시오 : ");
			cs.setPN(input.nextLine());
			System.out.print("목표등급 입력하시오 : ");
			cs.setGoal(input.nextLine());
			cs.setSubject();
			System.out.println("");
			System.out.println("");
			this.cslist.add(number, cs);
		}
	}

	public void viewLesson() {									//모든 과외생들의 정보를 출력하는 함수 
		for(int i =0;i <cslist.size(); i++)	{
			cslist.get(i).printInfo();
		}
	}
}


