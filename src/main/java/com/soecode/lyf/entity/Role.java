package com.soecode.lyf.entity;

public class Role {
    private Integer id;

    public int getRole_level() {
        return role_level;
    }

    public void setRole_level(int role_level) {
        this.role_level = role_level;
    }

    private int role_level;
    private String role_name;

    private String role_info;

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

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name == null ? null : role_name.trim();
    }

    public String getRole_info() {
        return role_info;
    }

    public void setRole_info(String role_info) {
        this.role_info = role_info == null ? null : role_info.trim();
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