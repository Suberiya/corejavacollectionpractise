package corejavaconceptsmethodsoverloading;

// Duplicates methods are not allowed 
// when have different method 

// 1. with same name
// 2. with different parametres (diff number of paams diff types params)
// 3. with diffrent number of sequnse incase of same number of params
// 4. returen type doesnt matter



public class MethodOverloading {
	
	public void test(String k, int i)
	{
		
	}
	
public void test(int i, String k)
{
	

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading obj = new MethodOverloading();

		obj.test(12,"John");
		
	System.out.println();
		
	}

}
