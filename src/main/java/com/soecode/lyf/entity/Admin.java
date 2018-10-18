package com.soecode.lyf.entity;

public class Admin {
    private Integer id;

    private String admin_name;

    private String admin_number;

    private String admin_iphone;

    private Integer admin_status;

    private String create_data;

    private String create_by;

    private String update_date;

    private String update_by;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name == null ? null : admin_name.trim();
    }

    public String getAdmin_number() {
        return admin_number;
    }

    public void setAdmin_number(String admin_number) {
        this.admin_number = admin_number == null ? null : admin_number.trim();
    }

    public String getAdmin_iphone() {
        return admin_iphone;
    }

    public void setAdmin_iphone(String admin_iphone) {
        this.admin_iphone = admin_iphone == null ? null : admin_iphone.trim();
    }

    public Integer getAdmin_status() {
        return admin_status;
    }

    public void setAdmin_status(Integer admin_status) {
        this.admin_status = admin_status;
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

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date == null ? null : update_date.trim();
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by == null ? null : update_by.trim();
    }
}