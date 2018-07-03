package CircleCIIntegration.CircleCIIntegration;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


 
public class HeadlessBrowser {
 
	
 	
 	@Test
 	public void googleTest() throws InterruptedException {
 		
		Capabilities caps = new DesiredCapabilities();
		((DesiredCapabilities) caps).setJavascriptEnabled(true);
//		((DesiredCapabilities) caps).setCapability(“takesScreenshot”, true);
		((DesiredCapabilities) caps).setCapability(
		PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		"/Users/bapur/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs"
		);
		WebDriver driver = new PhantomJSDriver(caps);
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		System.out.println("driver instance :" + driver);
 		
		
 	}

 }

