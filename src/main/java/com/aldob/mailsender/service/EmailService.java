package com.aldob.mailsender.service;

import java.io.File;

public interface EmailService {

    void sendEmail(String[] toUser, String subject, String message);

    void sendEmailWithFile(String[] toUser, String subject, String message, File file);

}
