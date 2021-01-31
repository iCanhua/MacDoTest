package com.fan.test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {

  int getAccountMoney(String name);

  int updateAccountMoney(@Param("name")String name,@Param("money")int money);

}
