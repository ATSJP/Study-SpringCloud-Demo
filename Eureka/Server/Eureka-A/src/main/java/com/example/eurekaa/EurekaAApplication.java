package com.example.eurekaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author atsjp
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaAApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaAApplication.class, args);
  }

}
