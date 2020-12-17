package com.powernode.crm.settings.service;

import com.powernode.crm.settings.bean.User;
import com.powernode.crm.settings.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: CRMM
 * @Package: com.powernode.crm.settings.service
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/17 22:19
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {

        return userDao.selectOneByNameAndPwd(user);
    }
}
