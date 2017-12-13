package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterTest4 {


public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Reg/index");
		//后台登录
		
		wd.findElement(By.name ("username")).sendKeys("123456");
		wd.findElement(By.name ("password")).sendKeys("123456");
		wd.findElement(By.name ("email")).sendKeys("123456@qq.com");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//18.不确认密码
		
		wd.quit();
}
}