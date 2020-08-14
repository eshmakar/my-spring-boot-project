package eshmakar.ru.myspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //означает что этот класс является spring - говским
public class MySpringBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootProjectApplication.class, args); //всегда необходимо так запускать Spring приложения
    }
 }