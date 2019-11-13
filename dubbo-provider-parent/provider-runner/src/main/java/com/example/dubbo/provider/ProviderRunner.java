package com.example.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:dubbo/dubbo-provider.xml")
public class ProviderRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProviderRunner.class);
    }
}
