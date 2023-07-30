package com.hwh.restaurant.service;

import com.hwh.restaurant.po.Foot;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hwh
 * @since 2023-07-29
 */
public interface IFootService extends IService<Foot> {

    /**
     * 查询所有启用了的餐品
     * @return
     */
    List<Foot> listFoot();

}
