package com.soecode.lyf.util.entity.token;

public class AdminTokenData {
    private static final long serialVersionUID = 2724888087391664167L;

    private String admin_name;//管理员姓名
    private String admin_iphone;//管理员电话

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_iphone() {
        return admin_iphone;
    }

    public void setAdmin_iphone(String admin_iphone) {
        this.admin_iphone = admin_iphone;
    }
}
