package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest13 {

public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//µÇÂ¼
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div/div[4]/span[3]/a")).click();
		Thread.sleep(5000);
		wd.findElement(By.name ("email")).sendKeys("xixixi01@qq.com");
		wd.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/div[2]/input")).click();
		//13.Íü¼ÇÃÜÂë Î´×¢²áµÄÓÊÏä 
		wd.quit();
}
}
