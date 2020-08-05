package eightJavaProj;

public class Management {

	// field variables 
	 
	private String name;
	private int empID;
	private double salary;
	private String role;
	
	//setter method
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEmpID(int empID)
	{
		this.empID = empID;
	}
	
	public void setSalary (double salary)
	{
		this.salary =  salary;
		
	}
	
	public void setRole(String role)
	{
		this.role = role;
		
		if(this.role == "Engineer")
		{
			this.salary = 30000;
		}
		
		if(this.role == "Manager")
		{
			this.salary = 50000;
		}
	}
	
	
	//getters
	
	public String getName()
	{
		return this.name;
	}
	
	public int getEmpID()
	{
		return this.empID;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public String getRole()
	{
		return this.role;
	}
	
	//additional methods
	
	public void incSal(int howMany)
	{
		 setSalary(this.salary * howMany/100 + this.salary);
	}
	
	
}
	
