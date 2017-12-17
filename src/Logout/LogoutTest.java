package Logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LogoutTest {
@Test
public void userquit() throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//µÇÂ¼Ò³Ãæ
		wd.findElement(By.name ("username")).sendKeys("xixi0101");
		wd.findElement(By.name ("password")).sendKeys("xixi0101");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//µÇÂ¼³É¹¦
		wd.findElement(By.xpath("html/body/div[1]/div/ul[2]/li[1]/a[2]")).click();
		//ÍË³öµÇÂ¼
		wd.quit();
}
}
