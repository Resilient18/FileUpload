package learntoupload;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFileUpload {
	
	WebDriver driver; 
	
	@Before
	public void init() { 
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver102.exe");
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void uploadFiles() { 
		
		driver.findElement(By.xpath("//*[@id=\"photo\"]")).sendKeys("C:\\Rajasree\\Selenium\\2022-02-12--Session 7.pptx");
		System.out.println("File Upload Successful.");
	}

}
