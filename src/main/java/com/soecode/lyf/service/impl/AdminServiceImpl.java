package com.soecode.lyf.service.impl;

import com.soecode.lyf.entity.Admin;
import com.soecode.lyf.entity.params.AdminParams;
import com.soecode.lyf.entity.result.ResultModel;
import com.soecode.lyf.enums.WizardAuditEnum;
import com.soecode.lyf.mapper.AdminMapper;
import com.soecode.lyf.service.AdminService;
import com.soecode.lyf.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {

    //    日志
    final static Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    AdminMapper adminMapper;
    @Override
    public ResultModel selectByLogin(HttpServletRequest request, Admin admin) {
//        初始化序列化结果集
        ResultModel result = ResultUtil.info(WizardAuditEnum.StatusEnum.STATUS_FAIL.getValue(),WizardAuditEnum.StatusEnum.STATUS_FAIL.getDesc());
//        查询数据库，返回值为0的化就是没有登录失败，为1的化就是成功
        //添加管理员状态
        admin.setAdmin_status(WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getValue());
        logger.info("登录验证—>start");

        Admin adminInfluence = adminMapper.selectByLogin(admin);
        if(!adminInfluence.getId().equals(null)){
            Map<String,Object> resultMap = new HashMap<String,Object>();
            resultMap.put("admin_id",adminInfluence.getId());
            result = ResultUtil.success(WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getValue(),WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getDesc());
            result.setData(resultMap);
            logger.info("登录成功->end");
        }else {
            logger.info("登录失败—>end");
        }
        return result;
    }

    @Override
    public ResultModel selectAllAdmin(Admin admin) {
        ResultModel result = ResultUtil.info(WizardAuditEnum.StatusEnum.STATUS_FAIL.getValue(),WizardAuditEnum.StatusEnum.STATUS_FAIL.getDesc());
        logger.info("查询数据库->start");
        AdminParams adminParams = adminMapper.selectOneAdmin(admin);
        List<Map<String,Object>> adminList = adminMapper.selectAllAdmin(adminParams);
        logger.info("查询数据库->end");
        if(adminList.size() > 0){
            result.setData(adminList);
            result = ResultUtil.success(WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getValue(),WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getDesc());
        }
        return result;
    }

}
