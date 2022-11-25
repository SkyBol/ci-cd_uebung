package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.*;

@SpringBootApplication
class DemoApplication {
  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

    if (args.length >= 1 && "postman".equals(args[0])) {
      System.out.println("PostmanTests");

      try {
        if(0 != executeCommand("npm i newman")) {
          throw new Exception("Could not install newman");
        }
        if(0 != executeCommand("node ./node_modules/newman/bin/newman.js run ./src/test/resources/cd.postman_collection.json -e ./src/test/resources/cd.postman_environment.json")) {
          throw new Exception("Errors during Postman Tests");
        }
      } catch (Exception e) {
        e.printStackTrace();
        System.exit(1);
      }

      SpringApplication.exit(context);
    }
  }

  public static int executeCommand(String command) throws IOException, InterruptedException {
    final Process process = Runtime.getRuntime().exec(command);

    process.waitFor();

    String line;

    BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
    while((line = error.readLine()) != null){
      System.out.println(line);
    }
    error.close();

    BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
    while((line=input.readLine()) != null){
      System.out.println(line);
    }
    input.close();


    OutputStream outputStream = process.getOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    printStream.println();
    printStream.flush();
    printStream.close();

    return process.exitValue();
  }
}
