package seventhJavaProj;

public class PassengerRunner {

	public static Passenger aria = new Passenger("Aria Jenner", 9087, 37);
	
	
	

	public static void main(String[] args) 
	{
	
		aria.setName("Aria Jenner");
		aria.setPassportNo(909775);
		aria.setSeatNo(37);
		
		
		
	System.out.println(aria.getName());
	System.out.println(aria.getPassportNo());
	System.out.println(aria.getSeatNo());
	

	}

}
