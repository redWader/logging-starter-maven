package ru.grigorenkomo.loggingstartermaven;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingStarterAutoConfiguration {
    public static void println (String str) {
        System.out.println("Напечатано стартером " + str);
    }
}
