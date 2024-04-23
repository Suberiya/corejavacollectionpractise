package methodoverrrideingassignment;

public class Audi extends BMW{
	
	public void startwithmusic()
	{
		System.out.println("stsrt with music from audi");
	}
	@Override
	public void offlightwithsensor()
	{
		System.out.println("off light with sensor from BMW");
	}
	
	
	public void speedalert()
	{
		System.out.println("speed alert from audi");
	}


}
