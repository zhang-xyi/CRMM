import com.powernode.crm.base.constants.CrmExceptionEnum;
import com.powernode.crm.base.exception.CrmException;
import com.powernode.crm.base.util.MD5Util;
import org.junit.Test;

/**
 * @ProjectName: CRMM
 * @Package: PACKAGE_NAME
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/17 22:48
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class TestCrm {

    //测试异常类
    @Test
    public void test01(){
        int a =1 ;
        try {
            if (a==1){
                throw new CrmException(CrmExceptionEnum.LOGIN_ACCOUNT_EXCEPTION);
            }
        } catch (CrmException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    //测试MD5加密
    @Test
    public void test02(){
        System.out.println(MD5Util.getMD5("123"));

    }
}
