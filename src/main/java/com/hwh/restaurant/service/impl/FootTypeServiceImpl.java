package com.hwh.restaurant.service.impl;

import com.hwh.restaurant.po.FootType;
import com.hwh.restaurant.mapper.FootTypeMapper;
import com.hwh.restaurant.service.IFootTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author hwh
 * @since 2023-07-29
 */
@Service
public class FootTypeServiceImpl extends ServiceImpl<FootTypeMapper, FootType> implements IFootTypeService {
    private static final Logger logger= LoggerFactory.getLogger(FootTypeServiceImpl.class);

    @Override
    public List<FootType> listFootType() {
        logger.info("执行listFootType去数据库查询所有启用的footType");
        List<FootType> footTypeList = baseMapper.listFootType();
        return footTypeList;
    }
}
