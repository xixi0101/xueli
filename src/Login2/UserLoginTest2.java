package Login2;

import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class UserLoginTest2 extends BaseTest{ 
	@Test
	public void testBackLogin() throws InterruptedException{
		
		BackLogin2 add=new BackLogin2(webtest);
		Thread.sleep(5000);
		
		add.inputValues("xixixi", "xixixi");
	   	Thread.sleep(3000);
	    //1.登录成功
	}   
	
	   	@Test
		public void testBackLogin2() throws InterruptedException{
			
			BackLogin2 add=new BackLogin2(webtest);
			Thread.sleep(5000);
	   	add.inputValues("xixixixi@qq.com", "xixixi");
	   	Thread.sleep(3000);
	    //2.未注册的邮箱
	   	}
	   	
	   	@Test
		public void testBackLogin3() throws InterruptedException{
			
			BackLogin2 add=new BackLogin2(webtest);
			Thread.sleep(5000);
	   	add.inputValues("15732199999", "xixixi");
	   	Thread.sleep(3000);
	    //3.未验证的手机号
	   	add.inputValues("xixixixi", "xixixi");
	   	Thread.sleep(3000);
	   	}
	   	
		@Test   	
		public void testBackLogin4() throws InterruptedException{
			
			BackLogin2 add=new BackLogin2(webtest);
			Thread.sleep(5000);
	   	add.inputValues("15732199999", "xixixi");
	   	Thread.sleep(3000);
	    //4.不存在的用户名
	   	add.inputValues("xixixi", "xixixixi");
	   	Thread.sleep(3000);
		}
	   	@Test   
		public void testBackLogin5() throws InterruptedException{
			
			BackLogin2 add=new BackLogin2(webtest);
			Thread.sleep(5000);
	   	add.inputValues("15732199999", "xixixi");
	   	Thread.sleep(3000);
	    //5.错误密码
	
}
	   	}