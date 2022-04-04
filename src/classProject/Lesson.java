package classProject;
import java.util.*;

public class Lesson {
		
	ArrayList<String> name = new ArrayList<String>();                   //과외생의 이름을 저장하는 배열
	ArrayList<String> phone_number = new ArrayList<String>();           //과외생의 전화번호를 저장하는 배열
	ArrayList<String> subject = new ArrayList<String>();                //과외 과목을 저장하는 배열
	ArrayList<String> goal = new ArrayList<String>();                   //과외생의 목표를 저장하는 배열
	int count = 0;                                                      //과외생의 수를 조절하는 변수
		
		public Lesson() {
			
		}
		
		public void printInfo() {
			for(int i = 0; i < count; i++) {
				System.out.println("이름: " + name.get(i));               //저장된 이름을 출력
				System.out.println("전화번호: " + phone_number.get(i));    //저장된 전화번호를 출력
				System.out.println("과목: " + subject.get(i));            //저장된 과목을 출력
				System.out.println("목표 등급: "+ goal.get(i));            //저장된 등급을 출력
				System.out.println();
			}
		}
}
