package classProject;

public class CalculusStudent extends Student {
	private String subject;
	
	public void setSubject()
	{
		this.subject = "Calculus";
	}
	
	public String getSubject()
	{
		return this.subject;
	}
	
	public void printInfo()
	{
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPN());
		System.out.println("과목: " + getSubject());
		System.out.println("목표등급: " + getGoal());
		System.out.println();
	}
}
