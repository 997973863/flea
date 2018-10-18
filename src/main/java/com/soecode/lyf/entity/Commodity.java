package com.soecode.lyf.entity;

import java.math.BigDecimal;

public class Commodity {
    public Integer getCommodity_status() {
        return commodity_status;
    }

    public void setCommodity_status(Integer commodity_status) {
        this.commodity_status = commodity_status;
    }

    private Integer commodity_status;

    private Integer id;

    private String commodity_name;

    private Integer commodity_price;

    private String commodity_address;

    private BigDecimal commodity_cost;

    private Integer type_id;

    private String user_iphone;

    private String user_qq;

    private String create_data;

    private String create_by;

    private String update_data;

    private String update_by;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name == null ? null : commodity_name.trim();
    }

    public Integer getCommodity_price() {
        return commodity_price;
    }

    public void setCommodity_price(Integer commodity_price) {
        this.commodity_price = commodity_price;
    }

    public String getCommodity_address() {
        return commodity_address;
    }

    public void setCommodity_address(String commodity_address) {
        this.commodity_address = commodity_address == null ? null : commodity_address.trim();
    }

    public BigDecimal getCommodity_cost() {
        return commodity_cost;
    }

    public void setCommodity_cost(BigDecimal commodity_cost) {
        this.commodity_cost = commodity_cost;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getUser_iphone() {
        return user_iphone;
    }

    public void setUser_iphone(String user_iphone) {
        this.user_iphone = user_iphone == null ? null : user_iphone.trim();
    }

    public String getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(String user_qq) {
        this.user_qq = user_qq == null ? null : user_qq.trim();
    }

    public String getCreate_data() {
        return create_data;
    }

    public void setCreate_data(String create_data) {
        this.create_data = create_data == null ? null : create_data.trim();
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by == null ? null : create_by.trim();
    }

    public String getUpdate_data() {
        return update_data;
    }

    public void setUpdate_data(String update_data) {
        this.update_data = update_data == null ? null : update_data.trim();
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by == null ? null : update_by.trim();
    }

}