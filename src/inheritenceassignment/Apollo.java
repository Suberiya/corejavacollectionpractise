package inheritenceassignment;

public class Apollo extends Hospital{
	
	public void onlycovisheild()
	{
		System.out.println("Apollo only covid sheild available");
	}

	
	@Override
	public void  covidsheild()
	{
		System.out.println("Apollo pfizer");
	}
	
	@Override
	public void Pfizer()
	{
		System.out.println("Appollo hospital covaccine");
	}
	
}
