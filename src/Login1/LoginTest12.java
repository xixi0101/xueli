package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest12 {
	@Test
public void testForget() throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//后台登录
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div/div[4]/span[3]/a")).click();
		Thread.sleep(5000);
		wd.findElement(By.name ("email")).sendKeys("xixixi@qq.com");
		wd.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/div[2]/input")).click();
		wd.findElement(By.name ("password")).sendKeys(" ");
		wd.findElement(By.name ("password2")).sendKeys(" ");
		wd.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/div[2]/input")).click();
		//12.忘记密码，输入已注册的邮箱，新密码 确认密码 都为空格
		wd.quit();
}
}
