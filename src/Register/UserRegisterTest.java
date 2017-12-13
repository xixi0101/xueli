package Register;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class UserRegisterTest extends BaseTest{

	@Test
	public void testBackLogin() throws InterruptedException{
		
		BackRegister add=new BackRegister(webtest);
		Thread.sleep(5000);
		
	    add.inputValues("xixi01", "123456", "123456", "xixi01@qq.com");
	   	Thread.sleep(3000);
	    //1.注册成功
	    add.inputValues("xi02", "123456", "123456", "xixi@qq.com");
	   	Thread.sleep(3000);
	    //2.用户名少于6位
	    add.inputValues("xixixixixixixixixixixixi03", "123456", "123456", "xixixixixixixixixixixixixixi03@qq.com");
	   	Thread.sleep(3000);
	    //3.用户名多于20位
	   	add.inputValues("xixi04", "1234", "1234", "xixi@qq.com");
	   	Thread.sleep(3000);
	    //4.密码少于6位
		add.inputValues("xixi05", "12345678901234567890", "12345678901234567890", "xixi05@qq.com");
	   	Thread.sleep(3000);
	    //5.密码多于20位
	   	add.inputValues("xixi06", "123456", "123456", "xixi06");
	   	Thread.sleep(3000);
	    //6.邮箱为 xixi06
	   	add.inputValues("xixi07", "1234567", "1234567", "xixi07@");
	   	Thread.sleep(3000);
	    //7.邮箱为 xixi07@
	   	add.inputValues("xixi08", "123456", "123456", "xixi08@q.com");
	   	Thread.sleep(3000);
	    //8.邮箱为 xixi08@q.com
	   	add.inputValues("      ", "123456", "123456", "xixi09@qq.com");
	   	Thread.sleep(3000);
	    //9.用户名为六个空格
	   	add.inputValues("xixi10", "      ", "      ", "xixi10@qq.com");
	   	Thread.sleep(3000);
	    //10.密码为六个空格
	   	add.inputValues("xixi11", "123456", "1234567", "xixi11@qq.com");
	   	Thread.sleep(3000);
	    //11.确认密码输入框和密码输入框内容不一致
	   	add.inputValues("xixi12", "123456", "123456", "   @qq.com");
	   	Thread.sleep(3000);
	    //12.邮箱为   @qq.com
		add.inputValues("一二三四五六", "123456", "123456", "123456@qq.com");
	   	Thread.sleep(3000);
	    //13.用户名为汉字
		add.inputValues("！@#￥%……", "123456", "123456", "123456@qq.com");
	   	Thread.sleep(3000);  	
	    //14.用户名为！@#￥%……
	   	}
}
