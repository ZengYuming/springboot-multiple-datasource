package com.example.springbootmultipledatasource.entity.second;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 交易令牌
 * 用法：用于生成付款or收款的二维码，将此token和用户信息放入（支付or收款）二维码中
 * 每个用户随时保持10可用的交易令牌
 */
@Entity
@Table(name = "tony")
public class Tony {
    @Id
    private Long id;
    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Martin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}