package com.aipande.dao;

import com.aipande.entity.Account;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Author: WangPan
 * Description:账户持久层
 * Date-Of-Create:2020/7/21-21:04
 */
public interface IAccountDao {

    /**
     * 根据账户名称查询账户信息
     * @param accountName
     * @return
     */
    public Account selectByName(String accountName) throws Exception;

    /**
     * 修改账户金额
     * @param accountId
     * @param money
     */
    public void update(Integer accountId,BigDecimal money);
}
