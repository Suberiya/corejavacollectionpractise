package corejavaconceptsmethodsoverloading;

import java.util.ArrayList;

public class FuctionTestStudentMarks {

	
	public int getStudentMarks(String studentName)
	
	
	{
		System.out.println("getting marks for student" +studentName);
	
		int marks=-1;
		
		if(studentName.equalsIgnoreCase("devika"))
		{
			//return 90;
		marks=	90;
			
		}
		else if(studentName.equalsIgnoreCase("Ravi"))
		{
			//return 70;
			marks=	90;
		}
		else if (studentName.equalsIgnoreCase("Sahul"))
		{
			//return 100;
			marks=	79;
		}
		
		else
		{
			System.out.println("Studentname not found pass the right the student name"+ studentName);
		}
		return marks;
		
	}
	
	public int getmarks(String studentname)
	{
		
		System.out.println("get the student marks" + studentname);
		
		
		switch(studentname.toLowerCase().trim())
		{
		
		case "john":
			return 90;
			
		case "Sahul":
		
		return 89;
		
		case "Sam":
			return 78;
		
			
			default:
				System.out.println("student name not found plz pass the right student name" + studentname);
				
				return -1;
		}
		
		
		
	}
	
	
	
	public boolean getBrowser(String browserName)
	{
		System.out.println("get browser name");
		
		switch(browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched succesfully");
			
			return true;
			
		case "firefox":
			System.out.println("FireFox launched successfully");

			return true;
			
		case "edge":
			System.out.println("dege browser launched succeefully");
			
		default:
			return false;
		}
		
	}
	
	// Write a function getlisr device form employee
	
	// wirye function name
	// give input param
	
	// create arraylist add iten in array 
	
	public ArrayList<String> getdevices(String employeename)
	{
		System.out.println("gettings devices list for employee " + employeename);

		ArrayList<String> deviceList = new ArrayList<String>();
		
		switch(employeename.toLowerCase().trim())
		
		{
		
		case "pallavi":
		deviceList.add("MacBook pro");
		deviceList.add("MacBook pro");
		
		deviceList.add("MacBook pro");
		
		break;
		
		case "sahana":
			deviceList.add("Mac");
			deviceList.add("Windows");
			break;
		case "rifaya":
			deviceList.add("AirtelSim");
			deviceList.add("Vodafone");
		
			default:
				System.out.println("plz pass the right emp name --- jemp name not found " +employeename);
		}
		return deviceList;
	
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Write name of function
		
		// input params student names
		// return marks
		// student not found - > retuen something
		
		FuctionTestStudentMarks obj = new FuctionTestStudentMarks();
		
int m1= obj.getStudentMarks("sahul");
System.out.println(m1); 

int m2= obj.getmarks("Sahul");
System.out.println(m2);

boolean  browser= obj.getBrowser("chrome");

System.out.println(browser);

ArrayList<String> employeelist =obj.getdevices("rifaya");

System.out.println(employeelist.size());








System.out.println(employeelist );






		if (m1==-1)
		{
			System.out.println("no need print thbamrks sheet");
			
			
		}

		else
		{
			System.out.println("print the marks sheet");
		}
	}

}
