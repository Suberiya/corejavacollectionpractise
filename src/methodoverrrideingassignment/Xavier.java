package methodoverrrideingassignment;

public class Xavier extends University {
	
	
	public void robotics()
	{
		System.out.println("Robotics course available");
	}

	
	public void placements()
	{
		System.out.println("placements assurance from xavier");
	}
	
	
	@Override
	public void engwitharts()
	{
		System.out.println("engineering with arts from University");
	}
}
