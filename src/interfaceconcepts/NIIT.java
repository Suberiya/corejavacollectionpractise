package interfaceconcepts;

public class NIIT extends HeadCollege implements UKCollege, USCollege, IndiaCollege{

	public static void main(String[] args) {


	
	}

	@Override
	public void musttwelth() {
		System.out.println("NIIT must be completed twelth standard");
		
	}

	@Override
	public void iit() {
	
		System.out.println("IIT Courses are available in NIIT");
	}

	@Override
	public void medical() {
		
		System.out.println("Mediacal course are available in NIIT ");
		
	}

	@Override
	public void robotics() {
		
		System.out.println("Robotics aciurse are available in NIIT");
		
	}

	@Override
	public void arts() {
		
		System.out.println("Arts course are availabe in NIIIT");
	}

	@Override
	public void ielsmust() {

		System.out.println("IELS are must be completed from uk rules");
	
	
	}

	@Override
	public void ielsgradeabovefive() {
		
		System.out.println("iels are grade above five");
		
		
		
	}

//	@Override
//	public void engineering() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void nursing() {
		System.out.println("nursing csourse are vailable in UK");
		
	}

}
