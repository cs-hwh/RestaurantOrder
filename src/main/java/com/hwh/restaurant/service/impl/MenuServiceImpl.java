package com.hwh.restaurant.service.impl;

import com.hwh.restaurant.po.Foot;
import com.hwh.restaurant.po.FootType;
import com.hwh.restaurant.service.IFootService;
import com.hwh.restaurant.service.IFootTypeService;
import com.hwh.restaurant.service.IMenuService;
import com.hwh.restaurant.vo.Menu;
import com.hwh.restaurant.vo.MenuFoot;
import com.hwh.restaurant.vo.MenuFootType;
import com.hwh.restaurant.vo.MenuItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hwh
 * @description:
 * @create 2023-07-30 15:35
 */
@Service
public class MenuServiceImpl implements IMenuService {

    private static final Logger logger= LoggerFactory.getLogger(MenuServiceImpl.class);

    @Resource
    private IFootService footService;

    @Resource
    private IFootTypeService footTypeService;


    @Override
    public Menu getMenu() {
        Menu menu =null;

        List<MenuFootType> menuFootTypeList = null;
        List<MenuItem> menuItemList = null;
        try {
            menu = new Menu();

            menuFootTypeList = new ArrayList<>();
            menuItemList = new ArrayList<>();

            logger.info("执行getMenu获取菜单---开始");

            logger.info("执行getMenu获取菜单---查询启用的菜品");
            //查询所有启用的了菜品
            List<Foot> footList = footService.listFoot();

            logger.info("执行getMenu获取菜单---查询启用的菜品分类");
            //查询所有启用了的菜单分类
            List<FootType> footTypeList = footTypeService.listFootType();

            // 使用 Java 8 的 Stream API 将 List<FootType> 转换为 Map<String, List<Foot>>
            //这里的Map负责存储  分类::菜品
            Map<String, List<MenuFoot>> footTypeMap = footTypeList.stream()
                    .collect(Collectors.toMap(
                            footType -> footType.getFootTypeId(),
                            footType -> new ArrayList<>()
                    ));

            logger.info("执行getMenu获取菜单---遍历菜品，对菜品进行分类");
            //遍历菜品，对菜品进行分类
            Iterator<Foot> footIterator = footList.iterator();
            while (footIterator.hasNext()){
                //对象转换
                Foot foot = footIterator.next();
                MenuFoot menuFoot = new MenuFoot();
                BeanUtils.copyProperties(foot,menuFoot);

                //添加到map中对应的list中去
                List<MenuFoot> menuFootList = footTypeMap.get(menuFoot.getFootTypeId());
                menuFootList.add(menuFoot);
                footTypeMap.put(menuFoot.getFootTypeId(),menuFootList);
            }


            //遍历分类
            logger.info("执行getMenu获取菜单---遍历分类，构建menuItem");
            Iterator<FootType> typeIterator = footTypeList.iterator();
            while (typeIterator.hasNext()){
                //对象转换
                FootType footType = typeIterator.next();
                MenuFootType menuFootType = new MenuFootType();
                menuFootType.setTypeId(footType.getFootTypeId());
                menuFootType.setTypeName(footType.getFootTypeName());
                menuFootType.setSort(footType.getSort());

                //构建menuItem
                String typeId = menuFootType.getTypeId();
                MenuItem menuItem = new MenuItem();
                menuItem.setTypeId(typeId);
                menuItem.setTypeName(footType.getFootTypeName());
                menuItem.setMenuIFoots(footTypeMap.get(typeId));

                menuFootTypeList.add(menuFootType);
                menuItemList.add(menuItem);

            }
            menu.setMenuFootTypes(menuFootTypeList);
            menu.setMenuItems(menuItemList);
            logger.info("执行getMenu获取菜单---结束");
            return menu;
        } catch (Exception e) {
            logger.error("执行getMenu获取菜单---获取失败");
            throw new RuntimeException("获取菜单发生异常",e);
        }
    }

}
