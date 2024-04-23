package methodoverrrideingassignment;

public class Car extends Vehicle{
	

	public void gear()
	{
		System.out.println();
	}
	
	public void startwithsensor()
	{
		System.out.println("stsrt with senso from car class");
	}
	
	
	@Override
	public void stop()
	{
		System.out.println("this is stop method car ");
	}
	
}
