import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMeApp {
@Test
public void testme() {
	System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.partialLinkText("AboutUs"))).perform();
	action.moveToElement(driver.findElement(By.partialLinkText("Our Offices"))).perform();
	action.click(driver.findElement(By.partialLinkText("Bangalore"))).perform();
	String title=driver.getTitle();
	System.out.println(title);
	//String home=driver.getWindowHandle();
	Set<String> window=driver.getWindowHandles();
	//driver.switchTo().window(home);
	/*for(String s:window) {
		System.out.println(driver.switchTo().window(s));
	}*/
	Object[] obj=window.toArray();
	
	driver.switchTo().window((String) obj[1]);
	String title1=driver.getTitle();
	System.out.println(title1);
	driver.switchTo().frame(driver.findElement(By.name("main_page")));
	WebElement address=driver.findElement(By.id("demo3"));
	String address1=address.getText();
	System.out.println(address1);
	Assert.assertTrue(address1.contains("Bangalore"));
	driver.switchTo().window((String) obj[0]);
	driver.quit();
	
}
}
