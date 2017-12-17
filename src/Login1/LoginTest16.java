package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest16 {
	@Test
public void testForget() throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//后台登录
	
		wd.findElement(By.name ("username")).sendKeys("a1b1c1");
		wd.findElement(By.name ("password")).sendKeys("a1b1c1");
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div/div[4]/input[2]")).click();
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div/div[5]/input")).click();
		//16.安全控件登录
		Thread.sleep(5000);
	//	wd.quit();
}
}
