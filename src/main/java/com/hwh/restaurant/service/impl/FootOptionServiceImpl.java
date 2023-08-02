package com.hwh.restaurant.service.impl;

import com.hwh.restaurant.po.FootOption;
import com.hwh.restaurant.mapper.FootOptionMapper;
import com.hwh.restaurant.service.IFootOptionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hwh.restaurant.vo.MenuFootOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hwh
 * @since 2023-07-29
 */
@Service
public class FootOptionServiceImpl extends ServiceImpl<FootOptionMapper, FootOption> implements IFootOptionService {
    private static final Logger logger = LoggerFactory.getLogger(FootOptionServiceImpl.class);


    @Override
    public List<MenuFootOption> getFootOptionListById(String footId) {

        try {
            logger.info("执行getFootOptionListById获取菜品属性，footId:{}---开始", footId);

            logger.info("执行getFootOptionListById获取菜品属性---执行Mapper中方法查询属性");
            List<FootOption> footOptionList = baseMapper.getFootOptionListById(footId);

            logger.info("执行getFootOptionListById获取菜品属性---对象转换");
            List<MenuFootOption> menuFootOptionList = new ArrayList<>();
            Iterator<FootOption> iterator = footOptionList.iterator();
            while (iterator.hasNext()){
                FootOption footOption = iterator.next();
                MenuFootOption menuFootOption = new MenuFootOption();

                //对象转换
                menuFootOption.setFootOptionId(footOption.getFootOptionId());
                menuFootOption.setFootId(footOption.getFootId());
                menuFootOption.setFootOptionName(footOption.getFootOptionName());
                menuFootOption.setSort(footOption.getSort());
                //str:[b,a,c,d] -->数组
                String footOptionValueStr = footOption.getFootOptionValue();
                footOptionValueStr=footOptionValueStr.substring(1, footOptionValueStr.length() - 1);
                String[] footOptionValueArr = footOptionValueStr.split(",");

                menuFootOption.setFootOptionValue(footOptionValueArr);

                menuFootOptionList.add(menuFootOption);
            }
            logger.info("执行getFootOptionListById获取菜品属性---结束");
            return menuFootOptionList;
        } catch (Exception e) {
            logger.error("执行getFootOptionListById获取菜品属性,footId:{}---获取失败",footId);
            throw new RuntimeException("获取菜品属性异常",e);
        }
    }
}
