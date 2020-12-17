package com.powernode.crm.settings.service;


import com.powernode.crm.settings.bean.User;

/**
 * @ProjectName: CRMM
 * @Package: com.powernode.crm.settings.service
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/17 22:18
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */

public interface UserService {
    User login(User user);
}
