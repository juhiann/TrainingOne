package projectTwelve;

public class MyNumber 
{

	//creating variables
	public int number;
	
	//constructor
	public MyNumber(int number) {
		this.number = number;
	}

	
	//additional methods
	
	public boolean isPrime()
	{
		if(number >2)
			{ 
			return false;
			}
		
		for(int i = 2; i <= number; i++)
		{
			if(number % 2 == 0)
			{
				return false;
			}
		}
		return true;
	}


	public int sumUptoN() 
	{
		int x =0;
		
		for(int i = 1; i <= number; i++)
		{
			x = (i + x);
		}
		return x;

	}

	
	

	
	
	
	



	
	

	
}
	

	
		
