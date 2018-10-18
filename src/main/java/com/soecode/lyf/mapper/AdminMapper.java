package com.soecode.lyf.mapper;

import com.soecode.lyf.entity.Admin;
import com.soecode.lyf.entity.params.AdminParams;

import java.util.List;
import java.util.Map;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    /**
     * 登录查询
     * @param admin
     * @return
     */
    Admin selectByLogin(Admin admin);
    /**
     * 根据权限，查询全部管理员信息
     * @param admin
     * @return
     */
    List<Map<String,Object>> selectAllAdmin(Admin admin);
    /**
     * 查询单个管理员信息，根据id和状态
     * @param admin
     * @return
     */
    AdminParams selectOneAdmin(Admin admin);
}