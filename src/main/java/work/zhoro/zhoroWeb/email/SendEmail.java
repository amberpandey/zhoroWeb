/**
 * 
 */
package work.zhoro.zhoroWeb.email;

/**
 * @author amber
 *
 */
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendEmail {

   public static void main(String [] args) {    
      // Recipient's email ID needs to be mentioned.
      String to = "amberpandey@outlook.com";

      // Sender's email ID needs to be mentioned
      String from = "amberpandeyfnu@gmail.com";

      // Assuming you are sending email from localhost
      String host = "smtp.gmail.com";

      // Get system properties
      final String username = "amberpandeyfnu@gmail.com";
      final String password = "kholo123";
      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");
      Session session = Session.getInstance(props,
              new javax.mail.Authenticator() {
          protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
          }
      });

      try {

          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress("amberpandeyfnu@gmail.com"));
          message.setRecipients(Message.RecipientType.TO,
                  InternetAddress.parse(to));
          message.setSubject("hi");
          message.setContent("sadfasdada asdas asdasdaV  ASD", "text/html; charset=utf-8");

          Transport.send(message);

          System.out.println("Done");

      } catch (MessagingException e) {
          throw new RuntimeException(e);
      }
   }
}