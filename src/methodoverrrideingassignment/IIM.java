package methodoverrrideingassignment;

public class IIM extends University{

	public void artsonly()
	{
		System.out.println("Arts only from IIM");
	}
	
	public void alm()
	{
		System.out.println("robotic course from IIM");
	}
	
	@Override
	public void engwitharts()
	{
		System.out.println("engineering with arts from IIM");
	}
	
}
