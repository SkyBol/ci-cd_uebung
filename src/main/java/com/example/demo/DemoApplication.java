package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
class DemoApplication {
  public static void main(String[] args) throws Exception {
    ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

    if (args.length >= 1) {
      System.out.println("PostmanTests");

      try {
        if(0 != executeCommand("npm i newman")) {
          throw new Exception("Could not install newman");
        }
        if(0 != executeCommand("node ./node_modules/newman/bin/newman.js run ./src/test/resources/cd.postman_collection.json -e ./src/test/resources/cd.postman_environment.json")) {
          throw new Exception("Could not run newman");
        }
      } catch (Exception e) {
        e.printStackTrace();
        throw e;
      }

      SpringApplication.exit(context);
    }
  }

  public static int executeCommand(String command) throws IOException, InterruptedException {
    final Process process = Runtime.getRuntime().exec(command);

    process.waitFor();

    return process.exitValue();
  }
}
