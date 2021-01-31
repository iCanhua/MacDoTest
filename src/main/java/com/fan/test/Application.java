package com.fan.test;

import com.fan.test.dao.AccountMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {

    System.out.println("start spring");
    SpringApplication.run(Application.class, args);
  }

}
