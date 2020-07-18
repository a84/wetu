package com.wetu.controller;

import com.wetu.pojo.Orders;
import com.wetu.service.OrderService;
import com.wetu.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired  //  订单
    OrderService orderService;

    /**
     * 查询所有订单
     * @return
     */
    @GetMapping("/findAll")
    public ResponseResult findAll(
            @RequestParam(defaultValue = "1")Integer pageNum,
            @RequestParam(defaultValue = "10")Integer pageSize){
        List<Orders> result = orderService.findAll(pageNum, pageSize);
        return ResponseResult.ok(result);
    }
}
