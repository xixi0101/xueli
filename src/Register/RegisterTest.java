package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	@Test
public void register() throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Reg/index");
		//��̨��¼
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//15.ֱ�ӵ��ע�ᰴť
		wd.quit();
}
}
