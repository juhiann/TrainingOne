package projecteleven;

public class SwitchMonthDaysRunner {

	public static int nameOfDay(int dayNumber)
	{
		
		 switch(dayNumber)
		 {
		 
		 case 0: System.out.println("Sunday");
		 break;
		 case 1: System.out.println("Monday");
		 break;
		 case 2: System.out.println("Tuesday");
		 break;
		 case 3: System.out.println("Wednesday");
		 break;
		 case 4: System.out.println("Thursday");
		 break;
		 case 5: System.out.println ("Friday");
		 break;
		 case 6: System.out.println("Saturday");
		 break;
		 default: System.out.println("Invalid expression");
		 
		 }
		return dayNumber;
	}

		 public static int nameOfMonth(int monthNumber)
		 {
			 switch(monthNumber)
			 {
			 case 1:   System.out.println("January");
			 break;
			 case 2:   System.out.println("February");
			 break;
			 case 3:   System.out.println("March");
			 break;
			 case 4:   System.out.println("April");
			 break;
			 case 5:   System.out.println("May");
			 break;
			 case 6:   System.out.println("June");
			 break;
			 case 7:   System.out.println("July");
			 break;
			 case 8:   System.out.println("August");
			 break;
			 case 9:   System.out.println("September");
			 break;
			 case 10:   System.out.println("October");
			 break;
			 case 11:   System.out.println("November");
			 break;
			 case 12:   System.out.println("December");
			 break;
			 }
			 
			return monthNumber;
		 }
		
		 //isWeekDay
		 
		 public static boolean isWeekDay(int dayNumber)
		 {
			 switch(dayNumber)
			 {
	
			 case 1: System.out.println("Weekday");
			 break;
			 case 2: System.out.println("Weekday");
			 break;
			 case 3: System.out.println("Weekday");
			 break;
			 case 4: System.out.println("Weekday");
			 break;
			 case 5: System.out.println ("Weekday");
			 break;
			 
			 default: System.out.println("Invalid expression");
			 }
			 
			 return true; 
			 
		 }

	
	public static void main(String[] args) 
	{
		nameOfDay(3);
		nameOfMonth(12);
		isWeekDay(3);
	}

}
