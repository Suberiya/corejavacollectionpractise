package methodoverrrideingassignment;

public class Scorpio extends Audi{
	
	public void sparklight()
	{
		System.out.println("SparkLight from scorpio");
	}
	
	@Override
	public void speedalert()
	{
		System.out.println("speed alert from audi");
	}
	
	public void  autolock()
	{
		System.out.println("autolock from scorpio");
	}

}
