package Login2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {

@Test

public void userlogin() throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//��̨��¼
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//6.ֱ�ӵ����¼��ť
		wd.quit();
}
}
