package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.impl.SmsMessageSender;

public class Main {
    public static void main(String[] args) {
        User user = new User("NHN@ACADEMY.com", "010-1111-2222");
        String message = "polymorphism 실습 2";
        MessageSender smsMessageSender = new SmsMessageSender();
        MessageSendService messageSendService = new MessageSendService(smsMessageSender);
        messageSendService.doSendMessage(user, message);

    }
}