package thirdJavaProj;

public class EmployeeRunner 
{
	
	public static void eotm(Employee x, Employee y)
	{
		if(x.getScore() > y.getScore())
		{
			System.out.println(x.getEmpID());
		}
		else 
		{
			System.out.println(y.getEmpID());
		}
	}
	
	
	public static void main(String[] args) 
	{
		Employee tom = new Employee();
		tom.setEmpID(12271319);
		tom.setAge(47);
		tom.setRole("Driver");
		tom.setScore(89);
		
		
		System.out.println(tom.getEmpID());
		System.out.println(tom.getAge());
		System.out.println("Tom is a " + tom.getRole());
		
		Employee lynn = new Employee();
		lynn.setEmpID(12261319);
		lynn.setAge(43);
		lynn.setRole("Chef");
		lynn.setScore(92);
		
		System.out.println(lynn.getEmpID());
		System.out.println(lynn.getAge());
		System.out.println("Lynn is a " + lynn.getRole());
		
		eotm(tom, lynn);
	}

}
