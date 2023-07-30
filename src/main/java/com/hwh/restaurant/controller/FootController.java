package com.hwh.restaurant.controller;

import com.hwh.restaurant.common.Result;
import com.hwh.restaurant.service.IFootService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**

 * @author hwh
 * @since 2023-07-29
 */
@RestController
@RequestMapping("/restaurant/foot")
public class FootController {

    @ApiOperation(tags = {"foot"},value = "查询首页菜单",notes = "查询首页菜单，包含分类和各分类下的菜品")
    @GetMapping("/menu")
    public Result queryMenu(){
        return Result.ok();
    }

}
