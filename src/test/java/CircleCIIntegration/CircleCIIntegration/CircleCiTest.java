package CircleCIIntegration.CircleCIIntegration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CircleCiTest {
	
	
	@Test
	public void googleTest() throws InterruptedException {
		
		
		PhantomJSDriver driver = new PhantomJSDriver();
		//driver.setJavascriptEnabled(true);

//		driver.navigate().to("http://google.com");
		driver.navigate().to("http://pkr4jm9q0slz.live.wavemakeronline.com/LIS/#/Login");
//		http://a4a031c3f6a2311e8a8060a9f3430e67-834246212.us-east-2.elb.amazonaws.com/LIS/#/Login
		
		
		System.out.println("Hello World");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		

		System.out.println("page source--------------------\n"+driver.getPageSource());
		driver.findElement(By.xpath(".//*[@id='wm-app-content']/div/div/div/div/div/div/div/div/div/form/div/div[2]/div/div/input")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='wm-app-content']/div/div/div/div/div/div/div/div/div/form/div/div[3]/div/div/button")).click();
		System.out.println("test is completely passed");
		
		
	}

}
