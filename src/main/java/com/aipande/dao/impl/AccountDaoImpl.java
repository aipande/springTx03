package com.aipande.dao.impl;

import com.aipande.dao.IAccountDao;
import com.aipande.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Author: WangPan
 * Description:
 * Date-Of-Create:2020/7/21-21:05
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 根据账户名称查询账户信息
     *
     * @param accountName
     * @return
     */
    public Account selectByName(String accountName) throws Exception {
        List<Account> accounts =  jdbcTemplate.query("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class),accountName);
        Account account = null;
        //如果结果集为null\空\大于1
        if(accounts == null || accounts.size() == 0 || accounts.size()>1){
            throw new Exception("账户信息异常！");
        }else{
            account = accounts.get(0);
        }
        return account;
    }

    /**
     * 修改账户金额
     *
     * @param accountId
     * @param money
     */
    public void update(Integer accountId, BigDecimal money) {
        jdbcTemplate.update("update account set money = ? where id = ? ",money,accountId);
    }
}
