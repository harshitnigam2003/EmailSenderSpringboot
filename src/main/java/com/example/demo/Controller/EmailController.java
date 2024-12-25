package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/email")
public class EmailController {

	@Autowired
	private com.example.demo.logic.EmailSenderService emailSenderService;
   
	 
	  @PostMapping("/send")
	    public String sendEmail(@RequestParam String toEmail, @RequestParam String subject, @RequestParam String body) {
	        emailSenderService.sendsimpleEmail(toEmail, subject, body);
	        return "Email sent successfully!";

}
}
