package com.hwh.restaurant.mapper;

import com.hwh.restaurant.po.FootOption;
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
public interface FootOptionMapper extends BaseMapper<FootOption> {

    /**
     * 根据菜品Id查询菜品的属性
     * @param footId 餐品Id
     * @return
     */
   List<FootOption> getFootOptionListById(String footId);
}
