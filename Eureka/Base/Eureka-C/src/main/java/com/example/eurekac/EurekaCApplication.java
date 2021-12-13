package com.example.eurekac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaCApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaCApplication.class, args);
  }

}
