package projectten;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) 

	{
			
			System.out.println("Enter number1: ");
			Scanner scanner = new Scanner(System.in);
			int number1 =  scanner.nextInt();
			System.out.println("The number you entered is - " + number1);
			
			
			System.out.println("Enter number2: ");
			int number2 = scanner.nextInt();
			System.out.println("The number entered is: " + number2);
	
			System.out.println("Enter Choice");
			System.out.println("Choice 1 - Add");
			System.out.println("Choice 2 - Substract");
			System.out.println("Choice 3 - Multiply");
			System.out.println("Choice 4 - Divide");
	
			
			
			System.out.println("Your Choice = ");
			int choice = scanner.nextInt();
			System.out.println("Your choices are");
			System.out.println("Number1: " +  number1);
			System.out.println("Number2: " +  number2);
			System.out.println("Choice: " +  choice);
		
			
			
			
	
	

	//private static void performOperationUsingNestedIfElse(int number1, int number2, int choice) {
		//if(choice == 1)
		
			//System.out.println("Result " + (number1 + number2));
		
		//else if(choice == 2)
		
			//System.out.println("Result " + (number1 - number2));
		
		//else if(choice == 3)
		
			//System.out.println("Result " + (number1 * number2));
		
		//else if(choice == 4)
		
			//System.out.println("Result " + number1 / number2);
		
		
		switch (choice)
		{
		case 1: System.out.println("Result " + (number1 + number2));
		break;
		case 2: System.out.println("Result " + (number1 - number2));
		break;
		case 3: System.out.println("Result " + (number1 * number2));
		break;
		case 4: System.out.println("Result " + (number1 / number2));
		break;
		default: System.out.println("Invalid entry");
		
		}
		
	
		
	}
}