package com.powernode.crm.settings.service;

import com.powernode.crm.base.constants.CrmExceptionEnum;
import com.powernode.crm.base.exception.CrmException;
import com.powernode.crm.base.util.DateTimeUtil;
import com.powernode.crm.base.util.MD5Util;
import com.powernode.crm.settings.bean.User;
import com.powernode.crm.settings.dao.UserDao;
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
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        user.setLoginpwd(MD5Util.getMD5(user.getLoginpwd()));
        //先取出客户端ip

        String address=user.getAllowips();
        //user.setAllowips(null);
        user = userDao.selectOneByNameAndPwd(user);
        if (user==null){
            //用户名或密码错误
            throw new CrmException(CrmExceptionEnum.LOGIN_ACCOUNT_EXCEPTION);
        }else {
            //比较失效日期
            if(user.getExpiretime().compareTo(DateTimeUtil.getSysTime())<0){
                throw new CrmException(CrmExceptionEnum.LOGIN_EXPIRE_EXCEPTION);
            }
            if ("0".equals(user.getLockstate())){
                throw new CrmException(CrmExceptionEnum.LOGIN_LOCK_EXCEPTION);
            }
            if (!user.getAllowips().contains(address)){
                throw new CrmException(CrmExceptionEnum.LOGIN_IP_EXCEPTION);

            }

        }

        return user;
    }
}
