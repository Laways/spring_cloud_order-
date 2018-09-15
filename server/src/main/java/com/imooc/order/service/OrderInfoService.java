package com.imooc.order.service;

import com.imooc.order.entity.OrderInfo;

import java.util.List;

public interface OrderInfoService {
    List<OrderInfo> findAllOrders();
}
