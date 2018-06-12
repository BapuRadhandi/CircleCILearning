package CircleCIIntegration.CircleCIIntegration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CircleCiTest {
	
	public static void main(String[]args) {
		
		
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/Drivers/linux/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		System.out.println("Hello World");
		System.out.println("test");

		
		
		
	}

}
