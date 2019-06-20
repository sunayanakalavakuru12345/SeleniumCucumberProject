

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	public class Selenium_Register {
	
		@Test
		public void googlepage() {
			System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get("http://demowebshop.tricentis.com");
			d.manage().window().maximize();
			d.findElement(By.linkText("Register")).click();
			String title=d.getTitle();
			Assert.assertTrue(title.contains("Register"));
			//d.findElement(By.id("gender-male")).sendKeys("M");
			d.findElement(By.id("gender-female")).click();
			d.findElement(By.id("FirstName")).sendKeys("abcd");
			d.findElement(By.id("LastName")).sendKeys("efgh");
			//d.findElement(By.id("Email")).sendKeys("askmails@email.com");
			//d.findElement(By.id("Email")).getText();
			d.findElement(By.id("Email")).clear();
			//d.findElement(By.id("Password")).sendKeys("abc123");
			d.findElement(By.id("Password")).getText();
			d.findElement(By.id("ConfirmPassword")).getText();
			//d.findElement(By.id("ConfirmPassword")).sendKeys("abc123");
			//Assert.assertEquals(, expected);
			d.findElement(By.cssSelector("input[value='Register']")).click();
			
//			d.close();
		}
}
