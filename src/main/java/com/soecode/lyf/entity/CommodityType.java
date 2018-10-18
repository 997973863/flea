package com.soecode.lyf.entity;

public class CommodityType {
    private int type_status;

    public int getType_status() {
        return type_status;
    }

    public void setType_status(int type_status) {
        this.type_status = type_status;
    }

    private Integer id;

    private String type_name;

    private Integer type_father_id;

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

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name == null ? null : type_name.trim();
    }

    public Integer getType_father_id() {
        return type_father_id;
    }

    public void setType_father_id(Integer type_father_id) {
        this.type_father_id = type_father_id;
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