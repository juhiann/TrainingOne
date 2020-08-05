package secondJavaProj;

public class Student 
{

	// class/field variables 
	private int studentID;
	private String firstName;
	private String lastName;
	private int grade;
	
	/////// constructor
	
	// setter
	public void setStudentID(int studentID)
	{
		this.studentID = studentID;	
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;	
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
	
	// getters	

	public int getStudentID()
	{
		return this.studentID;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public int getGrade()
	{
		return this.grade;
	}
	
	
	
	
}


