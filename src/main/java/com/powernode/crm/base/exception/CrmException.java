package com.powernode.crm.base.exception;

import com.powernode.crm.base.constants.CrmExceptionEnum;

/**
 * @ProjectName: CRMM
 * @Package: com.powernode.crm.base.exception
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/17 22:38
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class CrmException extends RuntimeException {

    private CrmExceptionEnum crmExceptionEnum;

    public CrmException (CrmExceptionEnum crmExceptionEnum){
        //获取堆栈信息，调用父类的构造方法
        super(crmExceptionEnum.getMess());
        this.crmExceptionEnum=crmExceptionEnum;
    }

}
