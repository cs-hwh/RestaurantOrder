package com.hwh.restaurant.vo;

import java.util.List;

/**
 * @author hwh
 * @description:菜单项类，包含一个分类下的所有菜
 * @create 2023-07-30 15:23
 */
public class MenuItem {

    private String typeId;

    private String typeName;

    private List<MenuFoot> menuIFoots;

    public MenuItem() {
    }

    public MenuItem(String typeId, String typeName, List menuIFoots) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.menuIFoots = menuIFoots;
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

    public List getMenuIFoots() {
        return menuIFoots;
    }

    public void setMenuIFoots(List menuIFoots) {
        this.menuIFoots = menuIFoots;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                ", menuIFoots=" + menuIFoots +
                '}';
    }
}
