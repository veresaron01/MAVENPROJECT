package com.home.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("com.home.training")
public class Application {

    @Value("${name:chromedriver}")
    private String name;

    public static void main(final String[] args) {
        try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class)) {
            context.getBean(Application.class).execute();

        }

    }
    private void execute()
    {
        System.out.println(name);
    }
}
