package projectThirteen;

public class NumberSeq {

	//field variables 
	
	public static int n = 0;
	
	//additional method1
	public static void allEven(int x)
	{
		for(int i = 1; i <= x; i++)
		{
			
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		allEven(24); 
		
	}

}
