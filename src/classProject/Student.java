package classProject;

abstract public class Student {
	private String name;
	private String pn;
	private String goal;

	public static void TeacherName(String a, String b) {
		System.out.println(a +" "+b);
	}
	
	public static void TeacherName(String c) {
		System.out.print(c);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setPN(String pn) {
		this.pn = pn;
	}
	
	public String getPN() {
		return this.pn;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	
	public String getGoal()	{
		return this.goal;
	}
	
	public abstract void printInfo();
}//


