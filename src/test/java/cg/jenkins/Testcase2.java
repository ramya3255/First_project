package cg.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 {
	
	@Test
	public void testcase2()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-testing\\Maven_with_Bat_file\\chromedriver.exe");//mandate
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.amazon.com/");
		
		System.out.println("title of amazon using chrome test2="+ driver.getTitle());
		driver.quit(); 
	}

}
