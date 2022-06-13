package classProject;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Logger;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		LessonManagementSystem lesson_m = getObject("lesson_m.ser");
		if(lesson_m == null) {
			lesson_m = new LessonManagementSystem(input);
		} else {
			lesson_m.input = input;
		}
		
		WindowFrame frame = new WindowFrame(lesson_m);
		
		int n = 0;

		while(n != 5)
		{
			System.out.println("*** Private Lesson Management System Menu ***");
			System.out.println("1. Add Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Edit Students");
			System.out.println("4. View Students");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 5 :  ");
			n = input.nextInt();
			input.nextLine();
			System.out.println();
			if(n == 1) {
				lesson_m.addStudents();
				logger.log("add a student");
			}
			else if(n == 2) {
				lesson_m.deleteLesson();
				logger.log("delete a lesson");
			}
			else if(n == 3) {
				lesson_m.editLesson();
				logger.log("edit a lesson");
			}
			else if(n == 4) {
				lesson_m.viewLesson();
				logger.log("view a list of lesson");
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
		
		putObject(lesson_m, "lesson_m.ser");
		System.out.println("End.");
	}

	public static LessonManagementSystem getObject(String filename) {
		LessonManagementSystem lesson_m = null;

		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			lesson_m = (LessonManagementSystem)in.readObject();

			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return lesson_m;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return lesson_m;
	}

	public static void putObject(LessonManagementSystem lesson_m, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(lesson_m);

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//
