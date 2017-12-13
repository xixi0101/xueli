package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest10 {

public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//后台登录
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div/div[4]/span[3]/a")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/div[2]/input")).click();
		//10.忘记密码，不输入邮箱 直接提交
		wd.quit();
}
}
