package com.soecode.lyf.mapper;

import com.soecode.lyf.entity.CommodityType;

public interface CommodityTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityType record);

    int insertSelective(CommodityType record);

    CommodityType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityType record);

    int updateByPrimaryKey(CommodityType record);
}