package com.hwh.restaurant.service;

import com.hwh.restaurant.po.FootType;
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
public interface IFootTypeService extends IService<FootType> {

    /**
     * 查询所有启用了的分类
     * @return
     */
    List<FootType> listFootType();
}
