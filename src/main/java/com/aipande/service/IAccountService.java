package com.aipande.service;

import java.math.BigDecimal;

/**
 * Author: WangPan
 * Description:
 * Date-Of-Create:2020/7/21-21:02
 */
public interface IAccountService {

    /**
     * 转账操作
     * @param sourceAccount
     * @param targetAccount
     * @param money
     */
    public void transfer(String sourceAccount, String targetAccount, BigDecimal money) throws Exception;
}
