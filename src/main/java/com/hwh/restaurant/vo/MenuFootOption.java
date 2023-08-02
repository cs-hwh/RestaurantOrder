package com.hwh.restaurant.vo;

import java.util.Arrays;

/**
 * @author hwh
 * @description:菜品选项
 * @create 2023-07-31 19:55
 */
public class MenuFootOption {
    private String footOptionId;

    private String footId;

    private String footOptionName;

    private String[] footOptionValue;

    private int sort;

    public MenuFootOption() {
    }

    public MenuFootOption(String footOptionId, String footId, String footOptionName, String[] footOptionValue, int sort) {
        this.footOptionId = footOptionId;
        this.footId = footId;
        this.footOptionName = footOptionName;
        this.footOptionValue = footOptionValue;
        this.sort = sort;
    }

    public String getFootOptionId() {
        return footOptionId;
    }

    public void setFootOptionId(String footOptionId) {
        this.footOptionId = footOptionId;
    }

    public String getFootId() {
        return footId;
    }

    public void setFootId(String footId) {
        this.footId = footId;
    }

    public String getFootOptionName() {
        return footOptionName;
    }

    public void setFootOptionName(String footOptionName) {
        this.footOptionName = footOptionName;
    }

    public String[] getFootOptionValue() {
        return footOptionValue;
    }

    public void setFootOptionValue(String[] footOptionValue) {
        this.footOptionValue = footOptionValue;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "MenuFootOption{" +
                "footOptionId='" + footOptionId + '\'' +
                ", footId='" + footId + '\'' +
                ", footOptionName='" + footOptionName + '\'' +
                ", footOptionValue=" + Arrays.toString(footOptionValue) +
                ", sort=" + sort +
                '}';
    }
}
