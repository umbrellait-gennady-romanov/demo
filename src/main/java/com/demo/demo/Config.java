package com.demo.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
    @Bean
    public Client getClient() {
        return  new Client();
    }
}
