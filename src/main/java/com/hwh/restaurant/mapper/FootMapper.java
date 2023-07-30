package com.hwh.restaurant.mapper;

import com.hwh.restaurant.po.Foot;
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
public interface FootMapper extends BaseMapper<Foot> {
    /**
     * 查询所有启用了的餐品
     * @return
     */
    List<Foot> listFoot();

}
