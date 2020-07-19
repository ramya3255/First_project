package cg.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase3 {
	
	@Test
	public void testcase3()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-testing\\Maven_with_Bat_file\\chromedriver.exe");//mandate
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com/");
		
		System.out.println("title of facebook using chrome test3="+ driver.getTitle());
		driver.quit(); 
	}

}
