package Baseclasspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclassfb {
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}

}
