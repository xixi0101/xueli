package Login2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {



public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//后台登录
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//6.直接点击登录按钮
		wd.quit();
}
}
