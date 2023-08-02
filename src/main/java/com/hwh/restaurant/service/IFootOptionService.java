package com.hwh.restaurant.service;

import com.hwh.restaurant.po.FootOption;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hwh.restaurant.vo.MenuFootOption;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hwh
 * @since 2023-07-29
 */
public interface IFootOptionService extends IService<FootOption> {

    /**
     * 根据餐品Id查询餐品的属性选项
     * @param footId 餐品Id
     * @return
     */
    List<MenuFootOption> getFootOptionListById(String footId);
}
