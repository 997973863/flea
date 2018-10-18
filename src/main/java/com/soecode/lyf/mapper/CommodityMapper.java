package com.soecode.lyf.mapper;

import com.soecode.lyf.entity.Commodity;
import com.soecode.lyf.entity.CommodityWithBLOBs;

public interface CommodityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityWithBLOBs record);

    int insertSelective(CommodityWithBLOBs record);

    CommodityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CommodityWithBLOBs record);

    int updateByPrimaryKey(Commodity record);
}