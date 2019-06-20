import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IE {
	@Test
	public void googlepage() {
			System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().window().maximize();
		String title=d.getTitle();
		Assert.assertEquals(title, "google");
}
}
