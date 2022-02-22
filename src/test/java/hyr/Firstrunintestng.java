package hyr;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstrunintestng 
{
	@Test
	public void TestGoogle() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize()	;
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("hyrtutoriol",Keys.ENTER);
		Thread.sleep(5000);
		driver.close();

}
	@Test
	public void TestFacebook()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize()	;
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("hyrtutotorial",Keys.ENTER);
		System.out.println(driver.getTitle());
		
	}
	}

