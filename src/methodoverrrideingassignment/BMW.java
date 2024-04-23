package methodoverrrideingassignment;

public class BMW extends Car{
	
	public void automaticstart()
	{
		System.out.println("automatic strat car from bmw ");
	}
	
	@Override
	public void startwithsensor()
	{
		System.out.println("stsrt with senso from car class");
	}
	
	public void offlightwithsensor()
	{
		System.out.println("off light with sensor from BMW");
	}
	}
