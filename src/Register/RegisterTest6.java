package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RegisterTest6 {
	@Test
public void register() throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Reg/index");
		//后台登录
		
		wd.findElement(By.name ("username")).sendKeys("123456");
		wd.findElement(By.name ("password")).sendKeys("123456");
		wd.findElement(By.name ("password2")).sendKeys("123456");
		
		Thread.sleep(5000);
		//20.不点击注册按钮
		
		wd.quit();
}
}