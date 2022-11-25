package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
class DemoApplication {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

    if (args.length >= 1) {
      System.out.println("PostmanTests");

      try {
        ProcessBuilder pb = new ProcessBuilder("echo 'aaaaaaaaaaaaaaaaaaaaaaaa'");
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        Process p = pb.start();

      } catch (IOException e) {
        e.printStackTrace();
      }

      SpringApplication.exit(context);
    }
  }
}