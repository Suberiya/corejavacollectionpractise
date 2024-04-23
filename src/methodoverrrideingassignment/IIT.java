package methodoverrrideingassignment;

public class IIT extends University{

	public void collegetype()
	{
		System.out.println("college type Engineering and craft ");
	}
	
	@Override
	public void typescourse()
	{
		System.out.println("Types of course all enginnering From IIT");
	}

	
}
