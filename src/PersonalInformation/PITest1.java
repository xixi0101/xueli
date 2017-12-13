package PersonalInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PITest1 {

public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//登录页面
		wd.findElement(By.name ("username")).sendKeys("abcdef");
		wd.findElement(By.name ("password")).sendKeys("123456");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		//登录成功
		wd.findElement(By.xpath("html/body/div[1]/div/ul[2]/li[1]/a[1]")).click();
		//点开个人信息
		wd.findElement(By.name ("nickname")).sendKeys("123456");
		wd.findElement(By.name ("password")).sendKeys("123456");
		wd.findElement(By.name ("repassword")).sendKeys("123456");
		//1.修改昵称
		wd.findElement(By.xpath("html/body/div[4]/div/div[2]/div/div[2]/div[1]/form/div/div[7]/div/input")).click();
		wd.quit();
}
}
