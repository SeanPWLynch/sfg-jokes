package com.boanntech.sfgjokes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SfgJokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgJokesApplication.class, args);
    }

}
