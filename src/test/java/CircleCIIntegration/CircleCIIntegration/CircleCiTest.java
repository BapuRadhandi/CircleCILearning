package CircleCIIntegration.CircleCIIntegration;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class CircleCiTest {
	
	
	@Test
	public void googleTest() throws InterruptedException {
		
 		
	

			Capabilities caps = new DesiredCapabilities();
			((DesiredCapabilities) caps).setJavascriptEnabled(true);
			((DesiredCapabilities) caps).setAcceptInsecureCerts(true);
//			((DesiredCapabilities) caps).setCapability(“takesScreenshot”, true);
			
			((DesiredCapabilities) caps).setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			((DesiredCapabilities) caps).setCapability(
			PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"Drivers/mac/phantomjs_linux");
							
			WebDriver driver = new PhantomJSDriver(caps);	
		Thread.sleep(2000);
		System.out.println("driver instance is :"+ driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.get("http://pk54ysqfjstw.cloud.wavemakeronline.com/s4_lis_accessioning/#/Login?redirectTo=Accession");
		driver.get("https://lplus-qa.sema4genomics.com/s4-lis-accessioning/#/Login");
		Thread.sleep(5000);
		System.out.println("Title is : "+driver.getTitle());
		driver.findElement(By.xpath("//input[@name='usernametext']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@name='passwordtext']")).sendKeys("user");
		driver.findElement(By.name("loginButton")).click();
		
		Thread.sleep(3000);
		System.out.println("name is : "+driver.findElement(By.xpath(".//*[@id='wm-app-content']/div/header/div/section/div/div/div/div/div/div[2]/label[1]")).getText());
		
		System.out.println("title is :" +driver.getTitle());

}
	
}
