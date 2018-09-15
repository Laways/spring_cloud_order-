package com.imooc.order.controller;

import com.imooc.order.service.OrderInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/order")
public class OrderInfoController {

    private Logger log = LoggerFactory.getLogger(OrderInfoController.class);

    @Autowired
    private OrderInfoService orderInfoService;

    @GetMapping("/findAllOrders")
    public Object findAllOrders(){
        log.info("findAllOrder execute");
        return orderInfoService.findAllOrders();
    }
}
