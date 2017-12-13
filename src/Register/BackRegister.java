package Register;

import com.webtest.core.WebDriverEngine;
public class BackRegister {
	
    public WebDriverEngine webtest;
  
	public BackRegister(WebDriverEngine webtest) {
		this.webtest = webtest;
		
    }
	public void inputValues(String name,String password,String password2,String email) throws InterruptedException {
		Thread.sleep(5000);
		webtest.open("http://localhost:8032/zl_shop/index.php/Reg/index");
		Thread.sleep(5000);
		webtest.type("name=username",name);
		webtest.type("name=password",password);
		webtest.type("name=password2",password2);
		webtest.type("name=email",email);
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
	}
	
}
