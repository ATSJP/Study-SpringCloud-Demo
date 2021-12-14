package com.example.singleclientandsingleserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author atsjp
 */
@EnableEurekaClient
@SpringBootApplication
public class SingleClientAndSingleServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SingleClientAndSingleServerApplication.class, args);
  }

}
