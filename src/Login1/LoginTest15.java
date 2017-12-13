package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest15 {

public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//登录
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div/div[4]/span[3]/a")).click();
		Thread.sleep(5000);
		//15.可以查看密码找回页面
		wd.quit();
}
}
