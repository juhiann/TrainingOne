package projectThirteen;

public class Fibonacci 
{
	// Field Variables
	
	private int fib;
	
	
	// Constructors
	
	public Fibonacci( int fib)
	{
		this.fib = fib;
	}
	
	//Setters
	
	public void setFib(int fib)
	{
		this.fib = fib;
	}
	
	//Getters
	
	public int getFib()
	{
		return this.fib;
	}
	
	
	//Additional Methods
	
	public void fibonacciNumba(int num)
	{
		 int x = 0;
		 int y = 1;
		 int z;
		 int k;
		 
		System.out.println(x);
		System.out.println(y);
		z = x + y;
		System.out.println(z);
		
		for(int i = 1; i <= num; i=z)
		{
			 k = z; // k = 1 >>>  k = 2 >>> k = 3 >>> 
			 
			 z = y + z; // 1 + 1 = 2 : z = 2 >>> 1 + 2 = 3 >>> 2 + 3 = 5 >>>
			 System.out.println(z); //2 >>> 3 >>> 5
			
			 y = k; //2 : y = 1 >>> y = 2 >>> y = 3 >>> 
		}
	 }
	 
	 public void fibonacciNumba()
	 {
		 fibonacciNumba(getFib());
	 }
	 
	 public int primeFibonacci()
	 {
		return 0;
	 }
	 
	 public void evenFibonacci()
	 {
		 int x = 0;
		 int y = 1;
		 int z;
		 int k;
		 
		System.out.println(x);
		System.out.println(y);
		
		z = x + y;
		System.out.println(z);
		
	
		for(int i = 1; i <= getFib(); i=z)
			// 1<=25 >> i is now 2 >> a 
		{
			 k = z; // k = 1 >>>  k = 2 >>> k = 3 >>> 
			 
			 z = y + z; // 1 + 1 = 2 : z = 2 >>> 1 + 2 = 3 >>> 2 + 3 = 5 >>>
			 
			 if(z % 2 != 0)
			 {
			 System.out.println(z); //2 >>> 3 >>> 5
			 }
			 
			 y = k; //2 : y = 1 >>> y = 2 >>> y = 3 >>> 
		}
	 }
	 
	 public int maxPrimeFibo()
	 {
		 return 0;
	 }
	 
}
