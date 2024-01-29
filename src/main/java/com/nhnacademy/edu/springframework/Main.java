package com.nhnacademy.edu.springframework;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        User user = new User("NHN@ACADEMY.com", "010-1111-2222");
        String message = "polymorphism 실습 1";
        main.sendSmsMessage(user, message);
    }

    private void sendSmsMessage(User user, String message) {
        System.out.println("[SMS] message sent to " +user.getPhoneNumber() + " : " + message);
    }

    private void sendEmailMessage(User user, String message) {
        System.out.println("[Email] message sent to " +user.getPhoneNumber() + ":" + message);
    }
}