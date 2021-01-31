package com.fan.test.controller;


import com.fan.test.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

  @Autowired
  AccountService accountService;

  @RequestMapping("/tech_do")
  public String index() {
    return "Helle, i am tech company !!!";
  }


  @RequestMapping("/date")
  public Date data() {
    return new Date();
  }

  @RequestMapping("/transfer")
  public String transfer(String from,String to,int money) {
    accountService.transfer(from,to,money);
    return "转账成功";
  }

}
