package interfaceconcepts;

public class MIET extends HeadCollege implements UKCollege, USCollege, IndiaCollege{

	public static void main(String[] args) {

	}

	@Override
	public void iit() {
	
		System.out.println("India collge -- IIt courses available");
		
	}

	@Override
	public void medical() {
		
		System.out.println("India College interface -- Medical course available In MIET collge");
		
	}

	@Override
	public void robotics() {
		
		System.out.println("US collge Interface --- robotics are available in MIET College ");
		
	}

	@Override
	public void arts() {
		
		System.out.println("US Collge Interface ----- arts courses are available in MIET");
		
	}

	@Override
	public void ielsmust() {
	
		System.out.println("UK College interface --------  iels must be done");
		
	}

	@Override
	public void ielsgradeabovefive() {

		System.out.println("UK college interface ---------------iels grade above five should be ");
	}

//	@Override
//	public void engineering() {
//
//	System.out.println("");
//	
//	
//	}

	@Override
	public void nursing() {
	
		System.out.println("UK College interface ------------nursing course are availabel");
		
	}

	@Override
	public void musttwelth() {
	
		System.out.println("WEO must complete twelth");
		
		
	}

}
