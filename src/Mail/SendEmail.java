package Mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmail {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Properties prop = new Properties();
	     prop.setProperty("mail.host", "smtp.163.com");
		 prop.setProperty("mail.transport.protocol", "smtp");
	     prop.setProperty("mail.smtp.auth", "true");

//	 	Session session=Session.getInstance(prop,new Authenticator() {
//			public PasswordAuthentication getPasswordAuthentication() { 
//				return new PasswordAuthentication("xrj0101@163.", "");
//			}
//
//		});
//			
	     
	     //ʹ��JavaMail�����ʼ���5������
	     //1������session
        Session session = Session.getInstance(prop);
	     //����Session��debugģʽ�������Ϳ��Բ鿴��������Email������״̬
	     session.setDebug(true);
	      //2��ͨ��session�õ�transport����
	     Transport ts = session.getTransport("smtp");
		  //3��ʹ��������û��������������ʼ��������������ʼ�ʱ����������Ҫ�ύ������û����� ��smtp���������û��������붼ͨ����֤֮����ܹ����������ʼ����ռ��ˡ�
		 ts.connect("smtp.163.com", "xrj0101@163.com", "xrj0101");	 
		  //4�������ʼ�
		 MimeMessage message = createSimpleMail(session);
//		 Transport.send(message);
//		  5�������ʼ�
	     ts.sendMessage(message, message.getAllRecipients());
		 ts.close();
 
	}
	
	 public static MimeMessage createSimpleMail(Session session)
	            throws Exception {
	        //�����ʼ�����
	        MimeMessage message = new MimeMessage(session);
	        
	        //ָ���ʼ��ķ�����
	        message.setFrom(new InternetAddress("xrj0101@163.com"));
	        //ָ���ʼ����ռ���
	        message.setRecipient(Message.RecipientType.TO, new InternetAddress("931534973@qq.com"));
	        //�ʼ��ı���
	        message.setSubject("����");
	        //�ʼ����ı�����
	        message.setContent("hi~", "text/html;charset=UTF-8");
	        //���ش����õ��ʼ�����
	        return message;
	    }
	}
