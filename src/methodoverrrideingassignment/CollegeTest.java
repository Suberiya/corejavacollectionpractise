package methodoverrrideingassignment;

public class CollegeTest {

	public static void main(String[] args) {
	
		WEO we = new WEO();
		we.validreg();
		System.out.println("------------------");
		
		University ue= new University();
		ue.engwitharts();
		ue.qualitycheck();
		ue.typescourse();
		System.out.println("--------------------");
		
		IIT it  = new IIT();
		it.engwitharts();
		it.collegetype();
		it.qualitycheck();
 
		System.out.println("--------------");
		IIM im = new IIM();
		im.alm();
		im.artsonly();
		System.out.println("-------------------");
		
		Xavier x= new Xavier();
		x.engwitharts();
		x.isoreg();
		x.placements();
		x.robotics();
		x.typescourse();		
	}

}
