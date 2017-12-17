package Mail;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


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
	     
	     //使用JavaMail发送邮件的5个步骤
	     //1、创建session
        Session session = Session.getInstance(prop);
	     //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
	     session.setDebug(true);
	      //2、通过session得到transport对象
	     Transport ts = session.getTransport("smtp");
		  //3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和 给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
		 ts.connect("smtp.163.com", "xrj0101@163.com", "xrj0101");	 
		  //4、创建邮件
		 MimeMessage message = createSimpleMail(session);
//		 Transport.send(message);
//		  5、发送邮件
	     ts.sendMessage(message, message.getAllRecipients());
		 ts.close();
 
	}
	
	 public static MimeMessage createSimpleMail(Session session)
	            throws Exception {
	        //创建邮件对象
	        MimeMessage message = new MimeMessage(session);
	        
	         //设置邮件的基本信息         //发件人
	         message.setFrom(new InternetAddress("xrj0101@163.com"));
	         //收件人
	         message.setRecipient(Message.RecipientType.TO , new InternetAddress("626231936@qq.com"));
	         //标题
	         message.setSubject("郗睿杰的测试报告");
	         message.setText("测试报告，请老师查收~"); 
	         //创建邮件正文，为了避免邮件正文中文乱码问题，需要使用charset=UTF-8指明字符编码
	         MimeBodyPart text = new MimeBodyPart();
	         text.setContent("测试报告，请老师查收~", "text/html;charset=UTF-8");        
	         //创建邮件附件
	         MimeBodyPart attach = new MimeBodyPart();
	         DataHandler dh = new DataHandler(new FileDataSource("D:/workspace/xueli/test-output/result3.zip"));
	         attach.setDataHandler(dh);
	         attach.setFileName(dh.getName());  
	         
	         //创建容器描述数据关系
	         MimeMultipart mp = new MimeMultipart();
	         mp.addBodyPart(text);
	         mp.addBodyPart(attach);
	         mp.setSubType("mixed");
	         
	         message.setContent(mp);

	         return message;
	     }

	public void sendMailAttached() {
		// TODO Auto-generated method stub
		
	}
	    }

