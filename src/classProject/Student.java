package classProject;

public class Student {
	private String name;
	private String pn;
	private String goal;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public void setPN(String pn)
	{
		this.pn = pn;
	}
	
	public String getPN()
	{
		return this.pn;
	}
	public void setGoal(String goal)
	{
		this.goal = goal;
	}
	
	public String getGoal()
	{
		return this.goal;
	}
	
	public void printInfo()
	{
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPN());
		System.out.println("목표등급: " + getGoal());
		System.out.println();
	}
}

