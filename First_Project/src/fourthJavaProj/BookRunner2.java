package fourthJavaProj;

public class BookRunner2 {

	// start filling in the form
	
	//Declaring variables directly in the Body of a class - Allowed
	// int x;
	
	//Declaring and Initialising variables directly in the Body of a class - Allowed
	// int y = 2;
	
	//Creating a new instance of object "Book" in the Body of a class - Allowed
	static Book2 lime = new Book2(50, "Lime", "x");
	static Book2 pickles = new Book2(50, "x", "x");
	static Book2 olives = new Book2(50, "y", "y");
	
	//Only Variable Initialising statements directly in the Body of the Class  - Not Allowed
	//x = 3;
	
	//Calling method directly in the body of the Class - Not Allowed
	//lime.setTitle(Lime);
	
	
	public static void main(String[] args) {
		
		lime.setTitle("Lime");
		pickles.setTitle("Pickles");
		olives.setTitle("Olives");
		
		lime.setAuth("Elicha");
		pickles.setAuth("Kiora");
		olives.setAuth("Stella");
		
		lime.setNoOfCop(200);
		pickles.setNoOfCop(300);
		olives.setNoOfCop(150);
		
		lime.incCop(90);
		System.out.println(lime.getNoOfCop());
		System.out.println(pickles.getAuth() + pickles.getTitle() + pickles.getNoOfCop());
		
	}

}
