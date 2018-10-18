package com.soecode.lyf.controller.admin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.soecode.lyf.entity.Admin;
import com.soecode.lyf.entity.result.ResultModel;
import com.soecode.lyf.enums.WizardAuditEnum;
import com.soecode.lyf.mapper.AdminMapper;
import com.soecode.lyf.service.AdminService;
import com.soecode.lyf.util.JwtUtils;
import com.soecode.lyf.util.RSA.RSAUtil;
import com.soecode.lyf.util.ResultUtil;
import com.soecode.lyf.util.RsaJsUtils;
import com.soecode.lyf.util.entity.token.AdminTokenData;
import com.soecode.lyf.util.entity.token.UserTokenData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
@ResponseBody
public class AdministratorsController {
    @Autowired
    AdminService adminService;

    //日志
    final static Logger logger = LoggerFactory.getLogger(AdministratorsController.class);

    /**
     * 用户登录判断
     * @return
     */
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectByLogin",method = RequestMethod.POST,produces="application/json")
//    @Produces(MediaType.APPLICATION_JSON)
    public String selectByLogin(HttpServletRequest request, @RequestBody String admin_login){
         ResultModel result = ResultUtil.info(WizardAuditEnum.StatusEnum.STATUS_FAIL.getValue(),WizardAuditEnum.StatusEnum.STATUS_FAIL.getDesc());
        try {
            logger.info("==========================解密=========================");
              String admin_loginRsa = admin_login.substring(12);
              String jsonStr = RsaJsUtils.decryptByPrivateKeyData(admin_loginRsa);
            Admin admin = JSON.parseObject(jsonStr,Admin.class);
            logger.info("======================验证本地库是否存在数据=========================");
            result = adminService.selectByLogin(request,admin);
            if(result.getCode() == 20){
                logger.info("======================未查询到用户数据=========================");
                return JSONObject.toJSONString(result, SerializerFeature.WriteMapNullValue);
            }
            logger.info("======================用户登录成功封装用户数据返回token=========================");
            //***********************组织token中存储的用户信息start*******************************
            long ttlMillis = 1000*60*60*2;//设定token时间
            //***********************组织token中存储的用户信息end*******************************
            AdminTokenData adminTokenData = new AdminTokenData();
            adminTokenData.setAdmin_iphone(admin.getAdmin_iphone());
            adminTokenData.setAdmin_name(admin.getAdmin_name());
            String subject = JSONObject.toJSONString(adminTokenData, SerializerFeature.WriteMapNullValue);
            Map<String,Object> resultMap = new HashMap<String,Object>();
            resultMap.put("admin_id",result.getData());
            //用户code                   用户ip地址
//            O resultMap = result.getData();
            String token = JwtUtils.createJWT(String.valueOf(admin.getAdmin_iphone()),request.getRemoteAddr(),subject,ttlMillis,admin.getAdmin_name());
//            resultMap.put("memberName",userParams.getUser_studentId());
            resultMap.put("token",token);
            result = ResultUtil.success(WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getValue(),WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getDesc());
            result.setData(resultMap);
        }catch (Exception e){
            result = ResultUtil.info(WizardAuditEnum.StatusEnum.STATUS_FAIL.getValue(),WizardAuditEnum.StatusEnum.STATUS_FAIL.getDesc());
            e.printStackTrace();
        }
        return JSON.toJSONString(result,SerializerFeature.WriteMapNullValue);
    }

//    查询管理员信息
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectAllAdmin",method = RequestMethod.POST,produces="application/json")
    public String selectAllAdmin(HttpServletRequest request, Integer id) {
//         result = ResultUtil.info(WizardAuditEnum.StatusEnum.STATUS_FAIL.getValue(), WizardAuditEnum.StatusEnum.STATUS_FAIL.getDesc());
        Admin admin = new Admin();
//        int id1 = Integer.parseInt(id);
        admin.setId(2);
        admin.setAdmin_status(10);
        logger.info("查询数据库中管理员信息->start");
        ResultModel result = adminService.selectAllAdmin(admin);
        logger.info("查询数据库中管理员信息->end");
        return JSON.toJSONString(result, SerializerFeature.WriteMapNullValue);
    }
    
}
