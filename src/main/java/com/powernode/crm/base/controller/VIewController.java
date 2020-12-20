package com.powernode.crm.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

/**
 * @ProjectName: CRMM
 * @Package: com.powernode.crm.base.controller
 * @Description: 页面跳转
 * @Author: 张子凡
 * @CreateDate: 2020/12/18 21:00
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class VIewController {
    @RequestMapping({"/toView/{firstView}/{secondView}","/toView/{firstView}"})
    public String toView(
            @PathVariable(value = "firstView", required = false) String firstView,
            @PathVariable(value = "secondView", required = false) String secondView) {

        if (secondView == null) {
            return File.separator + firstView;
        }else {
            return File.separator + firstView + File.separator + secondView;
        }


    }

}
