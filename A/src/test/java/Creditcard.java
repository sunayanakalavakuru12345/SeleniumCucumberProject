import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Creditcard {
@Test
public void cardcount() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.hdfcbank.com");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
	Thread.sleep(3000);
	action.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards']"))).perform();
	action.click(driver.findElement(By.xpath("//a[@href='/personal/products/cards/credit_cards']"))).perform();
	Assert.assertTrue(driver.getCurrentUrl().endsWith("credit_cards"));
	
}
}
