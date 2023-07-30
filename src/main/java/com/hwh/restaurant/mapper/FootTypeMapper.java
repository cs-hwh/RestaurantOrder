package com.hwh.restaurant.mapper;

import com.hwh.restaurant.po.FootType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hwh
 * @since 2023-07-29
 */
public interface FootTypeMapper extends BaseMapper<FootType> {
    /**
     * 查询所有启用了的分类
     * @return
     */
    List<FootType> listFootType();
}
