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
		System.out.println("�̸�: " + getName());
		System.out.println("��ȭ��ȣ: " + getPN());
		System.out.println("����: " + getSubject());
		System.out.println("��ǥ���: " + getGoal());
		System.out.println();
	}
}
