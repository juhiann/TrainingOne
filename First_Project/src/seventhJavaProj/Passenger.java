package seventhJavaProj;

public class Passenger {

	//field variables 
	
	private String name;
	private int passportNo;
	private int seatNo;
	
	//constructors 
	
	public Passenger(String name, int passportNo, int seatNo)
	{
		this.name = name;
		this.passportNo = passportNo;
		this.seatNo = seatNo;
	}
	
	// setters
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPassportNo(int passportNo)
	{
		this.passportNo = passportNo;
	}
	
	public void setSeatNo(int seatNo)
	{
		this.seatNo = seatNo;
	}
	
	//getters
	
	public String getName()
	{
		return this.name;
	}
	
	public int getPassportNo()
	{
		return this.passportNo;
	}
	
	public int getSeatNo()
	{
		return this.seatNo;
	}
	
}

