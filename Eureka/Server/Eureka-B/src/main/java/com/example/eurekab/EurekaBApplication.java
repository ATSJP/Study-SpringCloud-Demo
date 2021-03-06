package com.example.eurekab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author atsjp
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaBApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaBApplication.class, args);
  }

}
