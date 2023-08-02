package com.hwh.restaurant.vo;

import java.math.BigDecimal;

/**
 * @author hwh
 * @description:菜单的食物类
 * @create 2023-07-30 15:11
 */
public class MenuFoot {

    private String footId;

    private String footName;

    private BigDecimal footPrice;

    private String footTypeId;

    private String footCover;

    private String footDescribed;

    private Integer sort;

    private Integer existOption;
    public MenuFoot() {
    }

    public MenuFoot(String footId, String footName, BigDecimal footPrice, String footTypeId, String footCover, String footDescribed, Integer sort, Integer existOption) {
        this.footId = footId;
        this.footName = footName;
        this.footPrice = footPrice;
        this.footTypeId = footTypeId;
        this.footCover = footCover;
        this.footDescribed = footDescribed;
        this.sort = sort;
        this.existOption = existOption;
    }

    public String getFootId() {
        return footId;
    }

    public void setFootId(String footId) {
        this.footId = footId;
    }

    public String getFootName() {
        return footName;
    }

    public void setFootName(String footName) {
        this.footName = footName;
    }

    public BigDecimal getFootPrice() {
        return footPrice;
    }

    public void setFootPrice(BigDecimal footPrice) {
        this.footPrice = footPrice;
    }

    public String getFootTypeId() {
        return footTypeId;
    }

    public void setFootTypeId(String footTypeId) {
        this.footTypeId = footTypeId;
    }

    public String getFootCover() {
        return footCover;
    }

    public void setFootCover(String footCover) {
        this.footCover = footCover;
    }

    public String getFootDescribed() {
        return footDescribed;
    }

    public void setFootDescribed(String footDescribed) {
        this.footDescribed = footDescribed;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getExistOption() {
        return existOption;
    }

    public void setExistOption(Integer existOption) {
        this.existOption = existOption;
    }

    @Override
    public String toString() {
        return "MenuFoot{" +
                "footId='" + footId + '\'' +
                ", footName='" + footName + '\'' +
                ", footPrice=" + footPrice +
                ", footTypeId='" + footTypeId + '\'' +
                ", footCover='" + footCover + '\'' +
                ", footDescribed='" + footDescribed + '\'' +
                ", sort=" + sort +
                ", existOption=" + existOption +
                '}';
    }
}
