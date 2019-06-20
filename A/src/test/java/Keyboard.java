import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Keyboard {
	@Test
	public void keyboarddrag() {
	System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/");
	driver.manage().window().maximize();
	
}
}
