package com.example.mapstruct.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailScheduler
{
    @Scheduled(fixedRate = 2000) // Mỗi 10 phút (600000 milliseconds)
    public void sendScheduledEmail() {

        System.out.println("Đã gửi email đến " + "ngoc");
    }
}
