package com.nhnacademy.edu.springframework.messagesender.impl;

import com.nhnacademy.edu.springframework.User;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;

public class SmsMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("[SMS] message sent to " + user.getPhoneNumber() + " : " + message);
    }
}
