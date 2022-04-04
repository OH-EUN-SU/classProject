package classProject;
import java.util.Scanner;

public class LessonManagementSystem {
	Lesson lesson = new Lesson();
	
	Scanner input = new Scanner(System.in);
	
	Lesson_Manager() {

	}
	
	public void addStudents() {                                  //과외생을 추가하는 함수
		System.out.print("이름을 입력하시오 : ");
		lesson.name.add(input.nextLine());
		System.out.print("전화번호를 입력하시오 : ");
		lesson.phone_number.add(input.nextLine());
		System.out.print("과목 입력하시오 : ");
		lesson.subject.add(input.nextLine());
		System.out.print("목표등급 입력하시오 : ");
		lesson.goal.add(input.nextLine());
		System.out.println("");
		
		lesson.count++;                                          //과외생의 수를 늘림
	}

	public void deleteLesson() {                                 //과외생을 삭제하는 함수
		System.out.print("몇 번째 수업을 삭제하시겠습니까?: ");
		int number = input.nextInt();
		input.nextLine();
		
		if (number < lesson.count) {
			lesson.name.remove(number);
			lesson.phone_number.remove(number);
			lesson.subject.remove(number);
			lesson.goal.remove(number);
			System.out.println("수업이 삭제되었습니다.");
			lesson.count--;                                      //과외생의 수를 줄임
		}
		else {
			System.out.println("수업이 존재하지 않습니다.");
		}
	}

	public void editLesson() {                                   //과외생 정보를 수정하는 함수
		System.out.print("몇 번째 수업을 수정하시겠습니까?: ");
		int number = input.nextInt();
		input.nextLine();
		if(number > lesson.count) {
			System.out.println("수업이 존재하지 않습니다.");
		}
		else {
			System.out.print("이름을 입력하시오 : ");
			lesson.name.add(number, input.nextLine());
			System.out.print("전화번호를 입력하시오 : ");
			lesson.phone_number.add(number, input.nextLine());
			System.out.print("과목 입력하시오 : ");
			lesson.subject.add(number, input.nextLine());
			System.out.print("목표등급 입력하시오 : ");
			lesson.goal.add(number, input.nextLine());
			
			System.out.println("");
		}
	}

	public void viewLesson() {                                    //모든 과외생들의 정보를 출력하는 함수 
			lesson.printInfo();
	}
}

