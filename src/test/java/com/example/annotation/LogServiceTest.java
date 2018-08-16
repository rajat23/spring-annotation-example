package com.example.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AnnotationApplication.class)
public class LogServiceTest {

    @Autowired
    private LogService logService;

    @Test
    public void shouldLogExecutionTime() throws InterruptedException {
        logService.save();
    }

}
