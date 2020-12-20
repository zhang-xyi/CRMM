package com.powernode.crm.settings.controller;

import com.powernode.crm.base.constants.CrmConstants;
import com.powernode.crm.base.exception.CrmException;
import com.powernode.crm.settings.bean.User;
import com.powernode.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String login(User user, Model model, HttpServletRequest request){

        try {
            String address=request.getRemoteAddr();
            user.setAllowips(address);
            user=userService.login(user);
            //登录成功将用户信息放到session中
            request.getSession().setAttribute(CrmConstants.LOGIN_USER,user);
            //跳转到后台页面
            return "index";
        } catch (CrmException e) {
            model.addAttribute("mess",e.getMessage());
            //回显用户名
            model.addAttribute("loginact",user.getLoginact());
            e.printStackTrace();
        }

        return "../../login";
    }

    @RequestMapping("/loginout")
    public String loginOut(HttpSession session){
        session.removeAttribute(CrmConstants.LOGIN_USER);
        return "../../login";
    }
}
