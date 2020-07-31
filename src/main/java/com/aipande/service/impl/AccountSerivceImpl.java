package com.aipande.service.impl;

import com.aipande.dao.IAccountDao;
import com.aipande.entity.Account;
import com.aipande.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Author: WangPan
 * Description:
 * Date-Of-Create:2020/7/21-21:03
 */
@Service("accountService")
public class AccountSerivceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;
    /**
     * 转账操作
     *
     * @param sourceAccount
     * @param targetAccount
     * @param money
     */
    @Transactional()
    public void transfer(String sourceAccount, String targetAccount, BigDecimal money) throws Exception {

        //1.根据名称查询转出账户
        Account source = accountDao.selectByName(sourceAccount);
        //2.根据名称查询转入账户
        Account target = accountDao.selectByName(targetAccount);
        //3.转出账户扣钱
        accountDao.update(source.getId(),source.getMoney().subtract(money));
        //4.转入账户加钱
        accountDao.update(target.getId(),target.getMoney().add(money));
        /*int a = 1/0;*/
    }
}
