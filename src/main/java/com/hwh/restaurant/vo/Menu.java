package com.hwh.restaurant.vo;

import java.util.List;

/**
 * @author hwh
 * @description:菜单类
 * @create 2023-07-30 15:09
 */
public class Menu {

    private List<MenuFootType> menuFootTypes;

    private List<MenuItem> menuItems;

    public Menu() {
    }

    public Menu(List<MenuFootType> menuFootTypes, List<MenuItem> menuItems) {
        this.menuFootTypes = menuFootTypes;
        this.menuItems = menuItems;
    }

    public List<MenuFootType> getMenuFootTypes() {
        return menuFootTypes;
    }

    public void setMenuFootTypes(List<MenuFootType> menuFootTypes) {
        this.menuFootTypes = menuFootTypes;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuFootTypes=" + menuFootTypes +
                ", menuItems=" + menuItems +
                '}';
    }
}
