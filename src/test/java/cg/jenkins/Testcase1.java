package cg.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
	
	
	@Test
	public void testcase1()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-testing\\Maven_with_Bat_file\\chromedriver.exe");//mandate
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com/");
		
		System.out.println("title of google using chrome test1="+ driver.getTitle());
		driver.quit(); 
	}

}
