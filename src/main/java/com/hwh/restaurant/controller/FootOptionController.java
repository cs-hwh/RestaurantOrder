package com.hwh.restaurant.controller;

import com.hwh.restaurant.common.Result;
import com.hwh.restaurant.service.IFootOptionService;
import com.hwh.restaurant.vo.MenuFootOption;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hwh
 * @since 2023-07-29
 */
@RestController
@CrossOrigin
@RequestMapping("/restaurant/footOption")
public class FootOptionController {

    @Resource
    private IFootOptionService footOptionService;

    @ApiOperation(tags = {"option"}, value = "根据菜品Id查询菜品的属性", notes = "根据菜品的Id,查询菜品的所有属性")
    @GetMapping("/{footId}")
    public Result getFootOptionById(@PathVariable("footId") String footId){

      List<MenuFootOption> footOptionList= footOptionService.getFootOptionListById(footId);
        return Result.ok().data("footOptionList",footOptionList);
    }

}
