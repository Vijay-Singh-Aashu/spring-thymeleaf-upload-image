package com.excellence.spring.thymeleaf.image.upload;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootUploadImageApplication implements CommandLineRunner {


  public static void main(String[] args) {
    SpringApplication.run(SpringBootUploadImageApplication.class, args);
  }

  @Override
  public void run(String... arg) throws Exception {
  }
}
