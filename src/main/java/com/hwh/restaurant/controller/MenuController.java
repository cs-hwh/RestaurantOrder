package com.hwh.restaurant.controller;

import com.hwh.restaurant.common.Result;
import com.hwh.restaurant.service.IMenuService;
import com.hwh.restaurant.vo.Menu;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hwh
 * @description:菜单相关操作
 * @create 2023-07-30 15:28
 */

@RestController
@CrossOrigin
@RequestMapping("/restaurant/menu")
public class MenuController {

    @Resource
    private IMenuService menuService;

    @ApiOperation(tags = {"menu"}, value = "查询首页菜单", notes = "查询首页菜单，包含分类和各分类下的菜品")
    @GetMapping("/")
    public Result getMenu() {
        Menu menuList = menuService.getMenu();
        return Result.ok().data("menu", menuList);
    }

}
