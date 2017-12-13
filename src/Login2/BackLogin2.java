package Login2;

import com.webtest.core.WebDriverEngine;
public class BackLogin2 {
	
    public WebDriverEngine webtest;
  
	public BackLogin2 (WebDriverEngine webtest) {
		this.webtest = webtest;
		
    }
	public void inputValues(String username,String password) throws InterruptedException {
		Thread.sleep(5000);
		webtest.open("http://localhost:8032/zl_shop/index.php/Login/login");
		Thread.sleep(5000);
		webtest.type("name=username",username);
		webtest.type("name=password",password);
		
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
	}
	
}
