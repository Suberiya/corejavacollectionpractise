package exceptionHandling;

import webDriverArch.ChromeDriver;
import webDriverArch.FirefoxDriver;
import webDriverArch.SafariDriver;
import webDriverArch.WebDriver;

public class AppTest {

	
	
	public static void main(String[] args) {
		String browser = "IE";

		WebDriver driver= null;
		
		switch(browser.toLowerCase().trim()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
			
		case "firefox":
		driver= new FirefoxDriver();
		break;
		
		case "safari":
			
			driver= new SafariDriver();
			
		break;
		default: 
			System.out.println("Plz pass the right browser");
			
			throw new MyException (" browser not  found");
			
		}
		System.out.println("passs the URL");
		
		

	}

}
