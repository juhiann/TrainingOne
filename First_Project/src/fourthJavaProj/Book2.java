package fourthJavaProj;

public class Book2 {

	// creating field variables 
		private String title;
		private int noOfCop;
		private String auth;
		
	// creating a constructor method with no parameter 
		
		Book2()
		{
			
		}
	// constructer method is created with multiple parameters
	// this will initialte default values which will be set during the initialisation of the object. 
		Book2(int noOfCopies, String title, String auth)
		{
			this.noOfCop = noOfCopies;
			this.auth = auth;
			this.title = title;
		}
		
	//encapsulate using setter method
		public void setTitle(String title)
		{
			this.title = title;
		}
		
		public void setNoOfCop (int noOfCop)
		{
			if(noOfCop >0)
			{
				this.noOfCop = noOfCop;
		
			}
		}
		// pass an if statement to the noOfCop setter method.
		
	
		public void setAuth (String auth)
		{
			this.auth = auth;
		}
		
		// second stage encapsulation, creating a method using the setter method. 
		// this method increases and decreases the number of copies of the book.
		
		
		//void method to increase the number of books 
		
		public void incCop (int howMany)
		{
			setNoOfCop(this.noOfCop + howMany);
		}
		
		// void method to decrease the number of copies 
		
		public void decCop(int howMany)
		{
			setNoOfCop(this.noOfCop - howMany);
		}
		
	// creating getter methods to retrieve the values assigned using the setter method
		
		public String getTitle()
		{
			return this.title;
		}
		
		public int getNoOfCop()
		{
			return this.noOfCop;
		}
		
		public String getAuth()
		{
			return this.auth;
		}
		
	
	
}

