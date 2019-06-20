import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DragAndDrop {
@Test
public void drag(){
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx.com");
	driver.manage().window().maximize();
	WebElement from=driver.findElement(By.xpath(""));
	WebElement to=driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
}
}
