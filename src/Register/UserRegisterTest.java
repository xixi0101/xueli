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
	    //1.ע��ɹ�
	   	}
	   	
	   	@Test
		public void testBackLogin2() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
			
	    add.inputValues("xi02", "123456", "123456", "xixi@qq.com");
	   	Thread.sleep(3000);
	    //2.�û�������6λ
	   	}
	   	@Test
		public void testBackLogin3() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
			
	    add.inputValues("xixixixixixixixixixixixi03", "123456", "123456", "xixixixixixixixixixixixixixi03@qq.com");
	   	Thread.sleep(3000);
	    //3.�û�������20λ
	   	}
		@Test
		public void testBackLogin4() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
	   	add.inputValues("xixi04", "1234", "1234", "xixi@qq.com");
	   	Thread.sleep(3000);
	    //4.��������6λ
		}
		@Test
		public void testBackLogin5() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
		add.inputValues("xixi05", "12345678901234567890", "12345678901234567890", "xixi05@qq.com");
	   	Thread.sleep(3000);
	    //5.�������20λ
		}
		@Test
		public void testBackLogin6() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
	   	add.inputValues("xixi06", "123456", "123456", "xixi06");
	   	Thread.sleep(3000);
	    //6.����Ϊ xixi06
		}
		@Test
		public void testBackLogin7() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
	   	add.inputValues("xixi07", "1234567", "1234567", "xixi07@");
	   	Thread.sleep(3000);
	    //7.����Ϊ xixi07@
		}
		@Test
		public void testBackLogin8() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
	   	add.inputValues("xixi08", "123456", "123456", "xixi08@q.com");
	   	Thread.sleep(3000);
	    //8.����Ϊ xixi08@q.com
		}
		
		@Test
		public void testBackLogin9() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
	   	add.inputValues("      ", "123456", "123456", "xixi09@qq.com");
	   	Thread.sleep(3000);
	    //9.�û���Ϊ�����ո�
		}
		
		@Test
		public void testBackLogin10() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
	   	add.inputValues("xixi10", "      ", "      ", "xixi10@qq.com");
	   	Thread.sleep(3000);
	    //10.����Ϊ�����ո�
		}
		@Test
		public void testBackLogin11() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
	   	add.inputValues("xixi11", "123456", "1234567", "xixi11@qq.com");
	   	Thread.sleep(3000);
	    //11.ȷ������������������������ݲ�һ��
		}
		@Test
		public void testBackLogin12() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
	   	add.inputValues("xixi12", "123456", "123456", "   @qq.com");
	   	Thread.sleep(3000);
	    //12.����Ϊ   @qq.com
		}
		@Test
		public void testBackLogin13() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
		add.inputValues("һ����������", "123456", "123456", "123456@qq.com");
	   	Thread.sleep(3000);
	    //13.�û���Ϊ����
		}
		@Test
		public void testBackLogin14() throws InterruptedException{
			
			BackRegister add=new BackRegister(webtest);
			Thread.sleep(5000);
		add.inputValues("��@#��%����", "123456", "123456", "123456@qq.com");
	   	Thread.sleep(3000);  	
	    //14.�û���Ϊ��@#��%����
	   	}
}
