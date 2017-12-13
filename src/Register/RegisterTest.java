package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterTest {


public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Reg/index");
		//后台登录
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//15.直接点击注册按钮
		wd.quit();
}
}
