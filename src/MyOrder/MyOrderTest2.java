package MyOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class  MyOrderTest2 {
	@Test
public void order() throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//登录页面
		wd.findElement(By.name ("username")).sendKeys("a1b1c1");
		wd.findElement(By.name ("password")).sendKeys("a1b1c1");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//登录成功
		wd.findElement(By.xpath("html/body/div[1]/div/ul[2]/li[3]/a")).click();
		wd.findElement(By.xpath("html/body/div[2]/div[4]/div/div[3]/div[2]/div[2]/div[1]/div/a[1]/b")).click();
		//2.可以查看猜你喜欢
		Thread.sleep(5000);
		wd.quit();
		}
}
