package thirdJavaProj;

public class Employee {

	// creating variables 
	
	private int empID;
	private int age;
	private String role;
	private int score;
	
	// encapsulating using setter method
	
	public void setEmpID(int empID) 
	{
		this.empID = empID;
	}
	
	public void setAge(int age)
	{
		this.age = age;
		
	}
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	// creating getters to get the setter values 
	
	public int getEmpID()
	{
		return this.empID;
	}
	
	public int getAge()
	{
		return this.age;
	}
	public String getRole()
	{
		return this.role;	
	}
	
	
	public int getScore()
	{
		return this.score;
	}
	
	
}
