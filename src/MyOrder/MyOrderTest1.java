package MyOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  MyOrderTest1 {

public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://localhost:8032/zl_shop/index.php/Login/login");
		//��¼ҳ��
		wd.findElement(By.name ("username")).sendKeys("a1b1c1");
		wd.findElement(By.name ("password")).sendKeys("a1b1c1");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//��¼�ɹ�
		wd.findElement(By.xpath("html/body/div[1]/div/ul[2]/li[3]/a")).click();
		//1.�㿪�ҵĶ��� ���Բ鿴
		Thread.sleep(5000);
		wd.quit();
		}
}