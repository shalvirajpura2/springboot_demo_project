package com.example.test.service;

import com.example.test.model.EmailDetails;

public interface EmailService {
	 
    String sendSimpleMail(EmailDetails details);
 
    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}