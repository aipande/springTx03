package com.aipande.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Author: WangPan
 * Description:账户实体类
 * Date-Of-Create:2020/7/21-21:08
 */
public class Account implements Serializable {

    //账户id
    private Integer id;
    //账户名称
    private String name;
    //账户金额
    private BigDecimal money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
