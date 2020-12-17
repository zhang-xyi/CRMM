package com.powernode.crm.settings.controller;

import com.powernode.crm.settings.bean.User;
import com.powernode.crm.settings.mapper.UserDao;
import com.powernode.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: CRMM
 * @Package: com.powernode.crm.settings.controller
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/17 22:16
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user){
        user=userService.login(user);

        return "";
    }
}
