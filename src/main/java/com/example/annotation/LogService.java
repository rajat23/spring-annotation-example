package com.example.annotation;

import org.springframework.stereotype.Service;

@Service
public class LogService {

    @LogExecutionTime
    public void save() throws InterruptedException {
        Thread.sleep(2000);
    }
}
