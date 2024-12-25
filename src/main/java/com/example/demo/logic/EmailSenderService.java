package com.example.demo.logic;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

	private JavaMailSender mailSender;
	
	public void sendsimpleEmail(String toEmail,String subject,String body)
	{
		 SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(toEmail);
	        message.setSubject(subject);
	        message.setText(body);
	        message.setFrom("harshit.nigam.2002@gmail.com");
	        mailSender.send(message);
	}
}
