package inheritenceassignment;

public class Fortis extends Hospital{
	
	
	public void Fortis(int a) 
	{
		System.out.println(" Fortis const");
	}
	
	public void MRiScan()
	{
		System.out.println("Fortis MRI Scan Available");
	}
	
	@Override
	public void  covidsheild()
	{
		System.out.println("Fotis no vaccine");
	}

	@Override
	public void Pfizer()
	{
		System.out.println("Fortis  MRi Shield");
	}
}
