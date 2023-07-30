package com.hwh.restaurant.service.impl;

import com.hwh.restaurant.po.Foot;
import com.hwh.restaurant.mapper.FootMapper;
import com.hwh.restaurant.service.IFootService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hwh
 * @since 2023-07-29
 */
@Service
public class FootServiceImpl extends ServiceImpl<FootMapper, Foot> implements IFootService {
    private static final Logger logger= LoggerFactory.getLogger(FootServiceImpl.class);
    @Override
    public List<Foot> listFoot() {
        logger.info("执行listFoot去数据库查询所有启用的foot");
        List<Foot> footList = baseMapper.listFoot();
        return footList;
    }
}
