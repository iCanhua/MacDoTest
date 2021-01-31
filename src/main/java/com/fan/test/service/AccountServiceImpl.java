package com.fan.test.service;


import com.fan.test.dao.AccountMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  AccountMapper accountMapper;


  @Override
  public void transfer(String from,String to,int money) {
    int fromMoney = accountMapper.getAccountMoney(from);
    fromMoney=fromMoney - money;
    accountMapper.updateAccountMoney( from, fromMoney);

    int toMoney = accountMapper.getAccountMoney(to);
    toMoney = toMoney+money;
    accountMapper.updateAccountMoney(to, toMoney);
  }

}
