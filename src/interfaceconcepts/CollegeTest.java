package interfaceconcepts;

public class CollegeTest {

	public static void main(String[] args) {

		
		MIET mt = new MIET();
		
		mt.arts();
		
		mt.ielsmust();
		mt.MBBSPG();
		mt.musttwelth();
		
		
		System.out.println("========================");
		
		NIIT nt= new NIIT();
		
		nt.iit();
		nt.MBBS();
		nt.musttwelth();
		nt.ielsgradeabovefive();
		
		// child class object can be refered by parent interface reference variable
		
		UKCollege uk = new MIET();
		
		uk.ielsmust();
		uk.nursing();
		uk.ielsgradeabovefive();
		uk.musttwelth();
		
		USCollege us= new MIET();
		
		us.arts();
		us.robotics();
		us.musttwelth();
	
		IndiaCollege in = new MIET();
		
		in.medical();
		in.iit();
		in.musttwelth();
		
	}

}
