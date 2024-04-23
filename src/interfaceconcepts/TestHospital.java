
package interfaceconcepts;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.physioServices();
		fh.dentalServices();
//		fh.oncologyServices();
//		fh.OPTServices();
		fh.emergencyServices();
		System.out.println(USMedical.min_fee);
		USMedical.billing();
		
		fh.covidVaccincation();
		
		fh.oncologyServices();
		fh.physioServices();
		fh.emergencyServices();
		
				
		
		System.out.println("------");
		
		//can not create the object of Interface
		//USMedical us = new USMedical();
		
		//top casting:
		//child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.cardioServices();
		uk.dentalServices();
		uk.emergencyServices();
		
		//down casting:
		//FortisHospital fh1 = new USMedical();
	}

	}


