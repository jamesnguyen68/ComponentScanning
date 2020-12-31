package com.james.componentscanning.practice;

import com.james.componentscanning.practice.config.ApplicationConfig;
import com.james.componentscanning.practice.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ComponentScanningApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        for (int i=0;i<5;i++){
            outputService.generateOutput();
            Thread.sleep(3000);
        }
    }
}
