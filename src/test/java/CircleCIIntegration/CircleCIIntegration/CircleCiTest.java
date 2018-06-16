package CircleCIIntegration.CircleCIIntegration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class CircleCiTest {
	
	
	@Test
	public void googleTest() {
		
		
//		System.out.println("launching chrome browser");
//		System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "/Drivers/linux/chromedriver");
//		WebDriver driver = new ChromeDriver();

//		System.out.println("launching chrome browser");
//		System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "/Drivers/linux/chromedriver");
		WebDriver driver = new HtmlUnitDriver();
		driver.navigate().to("http://google.com");
		System.out.println("Hello World");
		System.out.println(driver.getTitle());
		System.out.println("test is passed");
		
		
	}

}
