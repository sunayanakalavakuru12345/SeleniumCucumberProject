import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium2 {
	
	@Test
	public void googlepage() {
			System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demowebshop.tricentis.com");
		d.manage().window().maximize();
		d.findElement(By.linkText("Log in")).click();
		String title=d.getTitle();
		Assert.assertTrue(title.contains("Login"));
		d.findElement(By.id("Email")).sendKeys(username);
		d.findElement(By.id("Password")).sendKeys(password);
		d.findElement(By.cssSelector("input[value='Log in']")).click();
		boolean flag=d.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(flag);
		d.findElement(By.linkText("Log out")).click();
		d.close();
		
		
}
	@DataProvider()
	public Object[][] getdata(){
		
		
		return ;
		
	}

	
}
