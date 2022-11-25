package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Arrays;

@SpringBootApplication
class DemoApplication {
  public static void main(String[] args) {
    System.out.println(args.length + " aaaaaaaa");
    Arrays.stream(args).forEach(arg -> {
      System.out.println(arg);
    });

    //ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

    if (args.length > 1) {
      System.out.println("PostmanTests");

      try {

        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("echo starttest");

      } catch (IOException e) {
        e.printStackTrace();
      }

      System.out.println("bbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaah");

      //SpringApplication.exit(context);
    }
  }
}