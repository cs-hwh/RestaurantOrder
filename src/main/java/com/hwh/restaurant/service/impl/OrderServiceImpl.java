package com.hwh.restaurant.service.impl;

import com.hwh.restaurant.po.Order;
import com.hwh.restaurant.mapper.OrderMapper;
import com.hwh.restaurant.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hwh
 * @since 2023-07-29
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
