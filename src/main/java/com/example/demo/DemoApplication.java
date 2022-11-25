package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
class DemoApplication {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

    if (args.length > 1) {
      System.out.println("PostmanTests");

      try {

        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("echo starttest");

      } catch (IOException e) {
        e.printStackTrace();
      }

      SpringApplication.exit(context);
    }
  }
}