package com.soecode.lyf.service;

import com.soecode.lyf.entity.Admin;
import com.soecode.lyf.entity.result.ResultModel;

import javax.servlet.http.HttpServletRequest;

public interface AdminService {
    /**
     *管理员登录
     * @Parms request
     */
    ResultModel selectByLogin(HttpServletRequest request, Admin admin);

    /**
     *根据管理员权限查询所有管理员信息
     * @Parms request
     */
    ResultModel selectAllAdmin(Admin admin);

}
