package Listener;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

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
		System.out.println("����ִ����ϣ������ʼ�");
	}
//		Mail xi=new Mail();
//		try{
//			xi.send();
//		}catch (Exception e){
			//TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	
	
	
}