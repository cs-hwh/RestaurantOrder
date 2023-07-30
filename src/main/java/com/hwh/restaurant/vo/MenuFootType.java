package com.hwh.restaurant.vo;

/**
 * @author hwh
 * @description:菜单的分类类
 * @create 2023-07-30 15:10
 */
public class MenuFootType {

    private String typeId;

    private String typeName;

    private Integer sort;

    public MenuFootType() {
    }

    public MenuFootType(String typeId, String typeName, Integer sort) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.sort = sort;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "MenuFootType{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                ", sort=" + sort +
                '}';
    }
}
