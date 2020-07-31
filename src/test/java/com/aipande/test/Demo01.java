package com.aipande.test;

import com.aipande.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Author: WangPan
 * Description:
 * Date-Of-Create:2020/7/21-21:45
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //1.创建Spring容器
        ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //2.获取业务层对象
        IAccountService accountService = (IAccountService) context.getBean("accountService");
        //3.调用方法
        accountService.transfer("张三","李四",new BigDecimal(100));
    }
}
