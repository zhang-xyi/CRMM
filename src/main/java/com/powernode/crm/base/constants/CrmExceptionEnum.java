package com.powernode.crm.base.constants;

/**
 * @ProjectName: CRMM
 * @Package: com.powernode.crm.base.constants
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/17 22:42
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public enum CrmExceptionEnum {

    LOGIN_ACCOUNT_EXCEPTION("001", "用户名或密码错误"),
    LOGIN_EXPIRE_EXCEPTION("002","账户已失效"),
    LOGIN_LOCK_EXCEPTION("003","账户已锁定"),
    LOGIN_IP_EXCEPTION("004","不允许的IP地址"),
    ;


    //业务状态码
    private String code;

    private String mess;

    CrmExceptionEnum() {
    }

    CrmExceptionEnum(String code, String mess) {
        this.code = code;
        this.mess = mess;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }}
