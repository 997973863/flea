package com.soecode.lyf.entity;

public class CommodityWithBLOBs extends Commodity {
    private byte[] commodity_photo;

    private String commodity_describe;

    public byte[] getCommodity_photo() {
        return commodity_photo;
    }

    public void setCommodity_photo(byte[] commodity_photo) {
        this.commodity_photo = commodity_photo;
    }

    public String getCommodity_describe() {
        return commodity_describe;
    }

    public void setCommodity_describe(String commodity_describe) {
        this.commodity_describe = commodity_describe == null ? null : commodity_describe.trim();
    }
}