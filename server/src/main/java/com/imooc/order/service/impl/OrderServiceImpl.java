package com.imooc.order.service.impl;

import com.imooc.order.dao.OrderInfoMapper;
import com.imooc.order.entity.OrderInfo;
import com.imooc.order.entity.OrderInfoExample;
import com.imooc.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> findAllOrders() {
        OrderInfoExample example = new OrderInfoExample();
        example.createCriteria();
        List<OrderInfo> orderInfos = orderInfoMapper.selectByExample(example);
        return orderInfos;
    }
}
