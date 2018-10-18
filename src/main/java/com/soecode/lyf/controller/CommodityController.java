//package com.soecode.lyf.controller;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.soecode.lyf.entity.result.ResultModel;
//import com.soecode.lyf.enums.WizardAuditEnum;
//import com.soecode.lyf.service.CommodityService;
//import com.soecode.lyf.service.RedisUtilService;
//import com.soecode.lyf.util.ResultUtil;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//@RequestMapping("/Commodity")
//public class CommodityController {
//    @Autowired
//    CommodityService commodityService;
//    @Autowired
//    RedisUtilService redisUtilServicel;
//
//    //日志
//    final static Logger logger = LoggerFactory.getLogger(CommodityController.class);
//
//    /**
//     * 商品查询
//     * @request
//     */
//    @RequestMapping(value = "/selectCommodityAll",method = RequestMethod.GET)
//    @ResponseBody
//    public String selectByKeyAndPassword(HttpServletRequest request){
//        ResultModel result = null;
//        logger.info("商品查询->start");
//        logger.info("查看数据缓存中是否存在——>start");
//        if(redisUtilServicel.hasKey("allCommodity")){
//            logger.info("查看数据缓存中是否存在——>end");
//            result = ResultUtil.success(WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getValue(),WizardAuditEnum.StatusEnum.STATUS_SUCCESS.getDesc());
//            result.setData(JSON.parseArray((String) redisUtilServicel.get("allCommodity"),CommodityParams.class));
//        } else {
//            logger.info("查询数据库—>start");
//            result = commodityService.selectCommodityAll(request);
//            logger.info("查询数据库—>end");
//            logger.info("把查询的数据存入缓存");
//            redisUtilServicel.set("allCommodity",JSON.toJSON(result.getData()).toString(),60);
//            System.out.println(redisUtilServicel.get("allCommodity"));
//        }
//        logger.info("商品查询—>end");
//        return JSON.toJSONString(result,SerializerFeature.WriteMapNullValue);
//    }
//}
