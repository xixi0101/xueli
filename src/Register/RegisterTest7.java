package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RegisterTest7 {
	@Test
public void register() throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Reg/index");
		//��̨��¼
		
		wd.findElement(By.name ("username")).sendKeys("123456");
		wd.findElement(By.name ("password")).sendKeys("123456");
		wd.findElement(By.name ("password2")).sendKeys("123456");
		wd.findElement(By.name ("email")).sendKeys("123456@qq.com");
		
		wd.findElement(By.xpath("//input[@type='checkbox']")).click();
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//21.��ѡ�������Ķ���ͬ�� ����ע��Э��
		
		wd.quit();
}
}