package PersonalInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PITest6 {
	@Test
public void information() throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//登录页面
		wd.findElement(By.name ("username")).sendKeys("a1b1c1");
		wd.findElement(By.name ("password")).sendKeys("a1b1c1");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//登录成功
		wd.findElement(By.xpath("html/body/div[1]/div/ul[2]/li[1]/a[1]")).click();
		//6.点开个人信息 可以查看
		Thread.sleep(5000);
		wd.quit();
		}
}
		