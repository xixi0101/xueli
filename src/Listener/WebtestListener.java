package Listener;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import Mail.SendEmail;


public class WebtestListener extends TestListenerAdapter {
	//Testָ����ÿһ����������
	public void onTestFailure(ITestResult result){
		//����
	}
	public void onTestSkipped(ITestResult result){
}
	public void onTestSuccess(ITestResult result){
		System.out.println("ִ�гɹ���");
	}
	public void onTestStart(ITestResult result){
}
	//��������������testng.xml�еģ�test��ǩ��ʼǰ����ִ��
	public void onStart(ITestContext content){
	}
	@Override
	public void onFinish(ITestContext content){
		SendEmail a = new SendEmail();
		
			a.sendMailAttached();
			System.out.println("����ִ����ϣ������ʼ�");
		}
	}
	
	