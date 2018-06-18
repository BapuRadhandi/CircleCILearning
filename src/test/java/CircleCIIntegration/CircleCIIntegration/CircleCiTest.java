package CircleCIIntegration.CircleCIIntegration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class CircleCiTest {
	
	
	@Test
	public void googleTest() throws InterruptedException {
		
		
//		System.out.println("launching chrome browser");
//		System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "/Drivers/linux/chromedriver");
//		WebDriver driver = new ChromeDriver();

//		System.out.println("launching chrome browser");
//		System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "/Drivers/linux/chromedriver");
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.navigate().to("http://google.com");
		driver.navigate().to("http://pkr4jm9q0slz.live.wavemakeronline.com/LIS/#/Login");
//		http://a4a031c3f6a2311e8a8060a9f3430e67-834246212.us-east-2.elb.amazonaws.com/LIS/#/Login
		
		
		System.out.println("Hello World");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		
			 //  driver.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[2]/input")));
		driver.findElement(By.xpath("//input[@name='usernametext']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='wm-app-content']/div/div/div/div/div/div/div/div/div/form/div/div[2]/div/div/input")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='wm-app-content']/div/div/div/div/div/div/div/div/div/form/div/div[3]/div/div/button")).click();
		System.out.println("test is completely passed");
		
		
	}

}
