package classProject;

import java.util.*;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LessonManagementSystem std_m = new LessonManagementSystem();
		int n = 0;
		while(n != 5)
		{
			System.out.println("*** Private Lesson Management System Menu ***");
			System.out.println("1. Add Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Edit Students");
			System.out.println("4. View Students");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 5 : ");
			n = input.nextInt();
			input.nextLine();
			System.out.println("");
			if(n == 1) {
				std_m.addStudents();
			}
			else if(n == 2) {
				std_m.deleteLesson();
			}
			else if(n == 3) {
				std_m.editLesson();
			}
			else if(n == 4) {
				std_m.viewLesson();
			}
			else if(n == 5) {
				continue;
			} 
	         else if(n >= 6)
	         {
	            System.out.println("1-5 사이의 숫자를 고르시오");
	            System.out.println("");
	         }
		}
		 System.out.println("End.");
	}
}
