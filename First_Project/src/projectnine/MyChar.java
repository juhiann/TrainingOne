package projectnine;

public class MyChar {

	public char ch;
	
	//constructor 
	
	MyChar(char ch)
	{
		this.ch = ch;
	}
	
	public boolean isVowel()
	{
		if((isAlphabet()== true) && ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u'|| ch=='A'||
				ch=='E'||ch=='I'||ch=='O'||ch=='U')
			return true;
			return false;
	}

	public boolean isDigit()
	{
		if(ch >= 48 && ch<= 57) //means between '0' and '9'
			return true;
			return false;
	}
	
	public boolean isAlphabet()
	{
		if((ch >= 97 && ch<= 122) || (ch >= 65 && ch<= 90))// between 'a' to 'z' or 'A' to 'Z'
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	public boolean isConsonant()
	{
		if((isAlphabet() == true) && !isVowel())
		{
			return true;
			
		}
		else 
		{
			return false;
		}
	}

	public static void printLowercaseAlpha() 
	{
		for(char ch ='a'; ch <= 'z'; ch++)
		{
			System.out.println(ch);
		}
		
	}

	public static void printUppercaseAlpha() {
		for(char ch='A'; ch<='Z'; ch++)
		{
			System.out.println(ch);
		}
	}
	
	
}
