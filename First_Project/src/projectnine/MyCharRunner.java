package projectnine;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('j');
		
		System.out.println(myChar.isVowel());
		// 'a' 'e' 'i' 'o' 'u' and capitals
		
		System.out.println(myChar.isDigit());
		
		System.out.println(myChar.isAlphabet());
		
		System.out.println(myChar.isConsonant());
		
		MyChar.printLowercaseAlpha();
		MyChar.printUppercaseAlpha();

	}

}
