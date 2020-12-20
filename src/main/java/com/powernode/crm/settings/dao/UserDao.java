package com.powernode.crm.settings.dao;

import com.powernode.crm.settings.bean.User;

import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    List<User> selectAll();

    User selectOneByNameAndPwd(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}