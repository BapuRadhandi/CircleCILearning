package CircleCIIntegration.CircleCIIntegration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CircleCiTest {
	
	
	@Test
	public void googleTest() {
		
		
		System.out.println("launching chrome browser");
		System.out.println("user.dir");
		System.out.println("usr.dir");
		System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/CircleCIIntegration/Drivers/linux/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		System.out.println("Hello World");
		System.out.println("test");
		System.out.println("sample test");
		
		
		
	}

}
